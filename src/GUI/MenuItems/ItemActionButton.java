package GUI.MenuItems;

import Components.Part.Part;
import GUI.Command;
import discount.Cart;
import javafx.scene.control.MenuItem;
import loginService.LoginService;

public class ItemActionButton extends MenuItem implements Command {
    private Part item;

    public ItemActionButton(String label, Part item) {
        super(label);
        this.item = item;
        this.setOnAction(event -> this.execute());
    }

    //This execute is supposed to add item to the cart

    @Override
    public void execute() {
        Cart cart = LoginService.currentCustomer.getCart();
        cart.addItem(item);
    }
}
