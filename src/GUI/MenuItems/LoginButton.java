package GUI.MenuItems;

import GUI.Command;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Pair;

import java.util.Optional;

public class LoginButton extends MenuItem implements Command {
    private Stage stage;

    public LoginButton(String label, Stage stage) {
        super(label);
        this.setOnAction(event -> this.execute());
        this.stage = stage;

    }



    @Override
    public void execute() {
        displayLoginDialog();
    }
}
