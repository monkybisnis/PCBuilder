package GUI;

// import javafx.scene.control.*;

import Components.Part.Part;
import PCBuilder.Main;
import interceptor.ReviewService;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Optional;

public class ReviewDialog {
//private Stage stage;

    //Here need to add a review for an item, save to file so it can be viewed later etc

    public static void runDialog(Part item) {
        Dialog<String> dialog = new Dialog<>();

        Stage st = (Stage) dialog.getDialogPane().getScene().getWindow();
        st.getIcons().add(new Image("/resources/case.png"));

        dialog.setTitle("Review");

        ButtonType reviewButtonType = new ButtonType("Place Review", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(reviewButtonType, ButtonType.CANCEL);

        VBox vBox = new VBox();
        vBox.setSpacing(10);
        TextArea review = new TextArea();
        review.setPromptText("Review");

        vBox.getChildren().add(review);
        dialog.getDialogPane().setContent(vBox);
        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == reviewButtonType) {
                return review.getText();
            }
            return null;
        });
        Optional<String> result = dialog.showAndWait();
        result.ifPresent(reviewStr -> {
                    System.out.println("Review String: " + reviewStr);
                    System.out.println("Part serial number: " + item.getSerialNumber());

                    Main.dispatcher.addReview(item, reviewStr);
                    ReviewService.printReviews(item);
                }
        );
    }
}
