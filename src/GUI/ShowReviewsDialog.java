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

import java.util.List;
import java.util.Optional;

public class ShowReviewsDialog {
//private Stage stage;

    //Here need to add a review for an item, save to file so it can be viewed later etc

    public static void runDialog(Part item) {
        Dialog<String> dialog = new Dialog<>();

        Stage st = (Stage) dialog.getDialogPane().getScene().getWindow();
        st.getIcons().add(new Image("/resources/case.png"));

        dialog.setTitle("Reviews");

        ButtonType reviewButtonType = new ButtonType("Place Review", ButtonBar.ButtonData.OK_DONE);
//        dialog.getDialogPane().getButtonTypes().addAll(reviewButtonType, ButtonType.CANCEL);

        dialog.getDialogPane().getButtonTypes().addAll(ButtonType.CANCEL);

        VBox vBox = new VBox();
        vBox.setSpacing(10);
        TextArea reviewTA = new TextArea();
        reviewTA.setEditable(false);

        ReviewService.readReviewsFromFile();
        List<String> reviews = ReviewService.reviewsTable.get(item.getSerialNumber());
        String output = "";
        if(reviews == null){
            output = "No reviews yet for this item";
        }
        else {
            for (String s : reviews) {
                output += s + " \n";
            }
        }
        reviewTA.setText(output);

        vBox.getChildren().add(reviewTA);
        dialog.getDialogPane().setContent(vBox);
        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == reviewButtonType) {
                return reviewTA.getText();
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
