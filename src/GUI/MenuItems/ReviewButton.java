package GUI.MenuItems;

import Components.Part.Part;
import GUI.Command;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class ReviewButton extends MenuItem implements Command {
    private Part item;

    public ReviewButton(String label, Part item) {
        super(label);
        this.item = item;
        this.setOnAction(event -> this.execute());
    }
    @Override
    public void execute() {
        displayReviewDialog();
    }
}

