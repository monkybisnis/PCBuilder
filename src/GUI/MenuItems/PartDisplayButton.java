package GUI.MenuItems;

import Components.*;
import Components.Part.Case;
import Components.Part.Part;
import GUI.Command;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.List;

public class PartDisplayButton extends MenuItem implements Command {
    private Component component;
    private Stage stage;
    private FlowPane partsPane;

    public PartDisplayButton(String label, Stage stage, FlowPane partsPane, Component component) {
        super(label);
        this.stage = stage;
        this.partsPane = partsPane;
        this.component = component;
        this.setOnAction(event -> this.execute());
    }

    private void displayParts() {
        partsPane.getChildren().clear();
        for (int i = 0; i < component.size(); i++) {
            Part c = (Part)component.extract(i);
            String display = c.toString();
            String path = "/resources/" + c.getIcon();
            Label label = new Label(display, new ImageView(new Image(path)));
            label.setId("ID: " + i);
            label.setOnMouseClicked(event -> {

            });
            //label.setPrefWidth(200);
            //label.setPrefHeight(200);
            label.setContentDisplay(ContentDisplay.TOP);
            label.setTextFill(Color.BLACK);
            partsPane.getChildren().add(label);
        }
    }

    @Override
    public void execute() {
        displayParts();
        /*
        if (component instanceof Cases) {
            displayParts();
        } else if (component instanceof CPUs) {
            System.out.println("CPUs");
        } else if (component instanceof GPUs) {
            System.out.println("GPUs");
        } else if (component instanceof MemoryModules) {
            System.out.println("MemoryModules");
        } else if (component instanceof Motherboards) {
            System.out.println("Motherboards");
        } else if (component instanceof PSUs) {
            System.out.println("PSUs");
        } else if (component instanceof StorageComponents) {
            System.out.println("StorageComponents");
        }

         */
    }
}
