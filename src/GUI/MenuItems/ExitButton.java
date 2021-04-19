package GUI.MenuItems;

import GUI.Command;
import interceptor.ReviewService;
import javafx.scene.control.MenuItem;

public class ExitButton extends MenuItem implements Command {
    public ExitButton(String label) {
        super(label);
        this.setOnAction(event -> this.execute());
    }

    @Override
    public void execute() {
        ReviewService.saveReviews2File();
        System.exit(0);
    }
}