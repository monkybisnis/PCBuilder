package GUI.MenuItems;

import GUI.Command;
import javafx.scene.control.MenuItem;

public class AutoBuildButton extends MenuItem implements Command {
    public AutoBuildButton(String label) {
        super(label);
        this.setOnAction(event -> this.execute());
    }

    @Override
    public void execute() {
        System.out.println(this.getText());
    }
}