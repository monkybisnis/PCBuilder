package GUI;

// import javafx.scene.control.*;

import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Optional;

public class ReviewPage extends MenuItem {
private Stage stage;


    public void execute() {
//        Dialog<Pair<String, String>> dialog = new Dialog<>();
        Dialog<String> dialog = new Dialog<>();

        Stage st = (Stage)dialog.getDialogPane().getScene().getWindow();
        st.getIcons().add(new Image("/resources/case.png"));

        dialog.setTitle("Compose Review");

        ButtonType reviewButtonType = new ButtonType("Save Review", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(reviewButtonType, ButtonType.CANCEL);

        VBox vBox = new VBox();
        vBox.setSpacing(10);
//        TextField userName = new TextField();
//        userName.setPromptText("Username");
//        PasswordField password = new PasswordField();
//        password.setPromptText("Password");
        TextArea reviewArea = new TextArea();
        reviewArea.setPromptText("Review");

//        vBox.getChildren().addAll(userName, password, reviewArea);
        vBox.getChildren().addAll( reviewArea);
        dialog.getDialogPane().setContent(vBox);
        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == reviewButtonType) {
                // return new Pair<>(userName.getText(), password.getText());
                return reviewArea.getText() ;
            }
            return null;
       });
        // Optional<Pair<String, String>> result = dialog.showAndWait();
        Optional<String> result = dialog.showAndWait();
//        result.ifPresent(pair -> System.out.println("Username: " + pair.getKey() + " Password: " + pair.getValue()));
        result.ifPresent(str -> System.out.println("Review: " + str));
    }
}
