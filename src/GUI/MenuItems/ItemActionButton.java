package GUI.MenuItems;

import Components.Part.Part;
import GUI.Command;
import javafx.scene.control.MenuItem;

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
         AddtoCart(item);
    }
}
