package GUI;

import discount.Customer;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Pair;
import loginService.LoginService;

import java.util.Optional;

public class Loginpage extends MenuItem {
    private Stage stage;


    public void execute() {
        Dialog<Pair<String, String>> dialog = new Dialog<>();

        Stage st = (Stage) dialog.getDialogPane().getScene().getWindow();
        st.getIcons().add(new Image("/resources/case.png"));

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
        result.ifPresent(pair -> {
                    System.out.println("Username: " + pair.getKey() + " Password: " + pair.getValue());
                    Customer c = LoginService.login(pair.getKey(), pair.getValue());
                    System.out.println("Current Customer Name: " + LoginService.currentCustomer.getName());
                    UI.userName.setText("Logged in as "+ LoginService.currentCustomer.getName());
                    UI.points.setText("Points: "+ LoginService.currentCustomer.getPoints());
                    UI.state.setText("State: "+ LoginService.currentCustomer.getState().toString());
                }
        );
    }
}
