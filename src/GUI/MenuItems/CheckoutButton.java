package GUI.MenuItems;

import GUI.Command;
import javafx.scene.control.Button;

public class CheckoutButton extends Button implements Command {
    public CheckoutButton(String label) {
        super(label);
        this.setOnAction(event -> this.execute());
    }

    @Override
    public void execute() {
        displayCheckoutDialog();
    }
}
