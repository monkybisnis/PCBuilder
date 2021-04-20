package GUI.MenuItems;

import Components.Components;
import Components.Part.Part;
import GUI.Command;
import PCBuildInterface.BudgetPC;
import PCBuildInterface.Gaming;
import PCBuildInterface.PowerSaver;
import javafx.scene.control.MenuItem;
import loginService.LoginService;

public class AutoBuildButton extends MenuItem implements Command {
    private Part item;
    private int type=0;
    public AutoBuildButton(String label, Components components, int i){
        super(label);
        this.type=i;
         switch (type){
             case 1:
             { this.item= new BudgetPC(components); break;}

             case 2:
             {this.item= new Gaming(components);break;}
             case 3:
             { this.item= new PowerSaver(components); break;}
         }

        this.setOnAction(event -> this.execute());


    }



    @Override
    public void execute() {

        LoginService.currentCustomer.getCart().addToUICart(item);
    }
}