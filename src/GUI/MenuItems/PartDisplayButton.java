package GUI.MenuItems;

import Components.*;
import Components.Part.Case;
import Components.Part.Part;
import GUI.Command;
import javafx.event.EventHandler;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.List;

public class PartDisplayButton extends MenuItem implements Command {
    private Component component;
    private Stage stage;
    private FlowPane partsPane;
    private int id;

    public PartDisplayButton(String label, Stage stage, FlowPane partsPane, Component component) {
        super(label);
        this.stage = stage;
        this.partsPane = partsPane;
        this.component = component;
        this.setOnAction(event -> this.execute());
    }

    private void setClickEvent(Label label, Part c) {
        ContextMenu contextMenu = new ContextMenu();
        ItemActionButton item = new ItemActionButton("Add to Cart", c);
        contextMenu.getItems().addAll(item);
        label.setOnContextMenuRequested(event -> contextMenu.show(label, event.getScreenX(), event.getScreenY()));
    }

    private void displayParts() {
        partsPane.getChildren().clear();
        for (int i = 0; i < component.size(); i++) {
            Part c = (Part)component.extract(i);
            String display = c.toString();
            String path = "/resources/" + c.getIcon();
            Label label = new Label(display, new ImageView(new Image(path)));
            label.setOnMouseClicked(event -> setClickEvent((Label)event.getSource(), c));
            label.setContentDisplay(ContentDisplay.TOP);
            label.setTextFill(Color.WHITE);
            partsPane.getChildren().add(label);
        }
    }

    @Override
    public void execute() {
        displayParts();
    }
}
