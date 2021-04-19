package GUI.MenuItems;

import Components.Part.Part;
import GUI.Command;
import GUI.ShowReviewsDialog;
import javafx.scene.control.MenuItem;

public class ShowReviewsButton extends MenuItem implements Command {
    private Part item;

    public ShowReviewsButton(String label, Part item) {
        super(label);
        this.item = item;
        this.setOnAction(event -> this.execute());
    }
    @Override
    public void execute() {
        ShowReviewsDialog.runDialog(item);
    }
}

