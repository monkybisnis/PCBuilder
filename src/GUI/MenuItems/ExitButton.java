package GUI.MenuItems;

import GUI.Command;
import interceptor.ReviewService;
import javafx.scene.control.MenuItem;
import loginService.LoginService;

public class ExitButton extends MenuItem implements Command {
    public ExitButton(String label) {
        super(label);
        this.setOnAction(event -> this.execute());
    }

    @Override
    public void execute() {
        if(!(LoginService.currentCustomer.getName().equals("Guest"))){
            LoginService.currentCustomer.getCart().saveCart();}
        ReviewService.saveReviews2File();
        System.exit(0);
    }
}