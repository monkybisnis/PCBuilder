package GUI.MenuItems;

import Components.*;
import Components.Part.Case;
import Components.Part.Part;
import GUI.Command;
import javafx.event.EventHandler;
import javafx.scene.Node;
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

public class PartDisplayButton  extends MenuItem implements Command  {
    private Component component;
    private Stage stage;
    public FlowPane partsPane;
    private int id;

    public PartDisplayButton(String label, Stage stage, FlowPane partsPane, Component component) {
        super(label);
        this.stage = stage;
        this.partsPane = partsPane;
        this.component = component;
        this.setOnAction(event -> this.execute());
    }



    @Override
    public void execute() {
       partsPane.getChildren().clear();

       partsPane.getChildren().addAll(displayParts(component));



    }
}
