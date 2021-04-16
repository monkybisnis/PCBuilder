package GUI.MenuItems;

import GUI.Command;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class LoginButton extends MenuItem implements Command {
    private Stage stage;

    public LoginButton(String label, Stage stage) {
        super(label);
        this.setOnAction(event -> this.execute());
        this.stage = stage;

    }

    @Override
    public void execute() {
        displayLoginDialog();
    }
}
