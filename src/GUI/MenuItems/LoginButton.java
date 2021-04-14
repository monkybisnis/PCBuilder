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

    public void displayLoginDialog() {
        Dialog<Pair<String, String>> dialog = new Dialog<>();
        dialog.setTitle("Login");

        ButtonType loginButtonType = new ButtonType("Log in", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL);

        VBox vBox = new VBox();
        vBox.setSpacing(10);
        TextField userName = new TextField();
        userName.setPromptText("Username");
        PasswordField password = new PasswordField();
        password.setPromptText("Password");

        vBox.getChildren().addAll(userName, password);
        dialog.getDialogPane().setContent(vBox);

        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == loginButtonType) {
                return new Pair<>(userName.getText(), password.getText());
            }
            return null;
        });
        Optional<Pair<String, String>> result = dialog.showAndWait();
        result.ifPresent(pair -> System.out.println("Username: " + pair.getKey() + " Password: " + pair.getValue()));
    }

    @Override
    public void execute() {
        displayLoginDialog();
    }
}
