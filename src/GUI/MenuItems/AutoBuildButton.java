package GUI.MenuItems;

import Components.Component;
import Components.Components;
import Components.Part.Part;
import GUI.Command;
import PCBuildInterface.BudgetPC;
import javafx.scene.control.MenuItem;
import loginService.LoginService;

public class AutoBuildButton extends MenuItem implements Command {
    private Part item;
    public AutoBuildButton(String label, Components components ){
        super(label);
          this.item= new BudgetPC(components);
        this.setOnAction(event -> this.execute());

    }



    @Override
    public void execute() {
        LoginService.currentCustomer.getCart().addToUICart(item);
    }
}