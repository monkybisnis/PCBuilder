package GUI.MenuItems;

import GUI.Command;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
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
        // Stage st = (Stage)dialog.getDialogPane().getScene().getWindow();
        // st.getIcons().add(new Image("/resources/case.png"));

        // dialog.setTitle("Reviews");

        VBox vBox = new VBox();

        for (;;){

        }

    }


    }

