package GUI.MenuItems;

import GUI.Command;
import GUI.UI;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import loginService.LoginService;

public class LogoutButton extends MenuItem implements Command {
    private Stage stage;

    public LogoutButton(String label, Stage stage) {
        super(label);
        this.setOnAction(event -> this.execute());
        this.stage = stage;

    }

    @Override
    public void execute() {
        LoginService.currentCustomer.getCart().saveCart();
        UI.userName.setText("Logged in as guest");
        UI.points.setText("Points: 0");
        UI.state.setText("State: Bronze");
        LoginService.currentCustomer = null;
        LoginService.login() ;
        UI.cartPane.getChildren().clear();
    }
}
