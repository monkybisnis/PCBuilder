package GUI.MenuItems;

import GUI.Command;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class ReviewButton extends MenuItem implements Command {
    private Stage stage;

    public ReviewButton(String label, Stage stage) {
        super(label);
        this.setOnAction(event -> this.execute());
        this.stage = stage;
    }
    @Override
    public void execute() {
        displayLoginDialog();
    }


    }

