package GUI.MenuItems;

import GUI.Command;
import javafx.scene.control.MenuItem;

public class LoginButton extends MenuItem implements Command {
    public LoginButton(String label) {
        super(label);
        this.setOnAction(event -> this.execute());
    }

    @Override
    public void execute() {

    }
}
