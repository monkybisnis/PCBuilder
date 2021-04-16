package GUI.MenuItems;

import Components.Component;
import GUI.Command;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

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
