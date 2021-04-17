package GUI;

// import javafx.scene.control.*;

import Components.Part.Part;
import discount.Cart;
import discount.Customer;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.util.Pair;
import loginService.LoginService;

import java.util.Optional;

public class ReviewDialog {
//private Stage stage;

    //Here need to add a review for an item, save to file so it can be viewed later etc

    public static void runDialog(Part item) {
        Dialog<String> dialog = new Dialog<>();

        Stage st = (Stage)dialog.getDialogPane().getScene().getWindow();
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
        result.ifPresent(pair -> {
                    System.out.println(pair);
                }
        );
/*
        stage = new Stage();
        Dialog<String> dialog = new Dialog<>();
        // set title for the stage
        stage.setTitle("Reviews");

        // TODO: 1, on top User details same as main window
        GridPane userGrid = new GridPane();
        ColumnConstraints column1 = new ColumnConstraints(250,100,Double.MAX_VALUE);
        column1.setHgrow(Priority.ALWAYS);
        ColumnConstraints column2 = new ColumnConstraints(100);
        userGrid.getColumnConstraints().addAll(column1, column2); // first column gets any extra width
        userGrid.setPadding(new Insets(10, 10, 10, 10));
        userGrid.setVgap(5);
        userGrid.setHgap(5);


        ButtonType reviewButtonType = new ButtonType("Save Review", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(reviewButtonType, ButtonType.CANCEL);

        // TODO: 2, Submission part, condition only if user is log-in
        TextArea textReviewInputArea = new TextArea();

        textReviewInputArea.setPromptText("Enter your review of product.");
        textReviewInputArea.setPrefHeight(250);
        textReviewInputArea.setPrefWidth(70);
        textReviewInputArea.getText();
        Button button = new Button("Show Dialog");

        GridPane.setConstraints(textReviewInputArea, 0, 0); // column=0 row=0
        GridPane.setConstraints(button, 1, 0);
        userGrid.getChildren().addAll(textReviewInputArea);



        // TODO: 3, List of the reviews where in the top is roll option to chose

        VBox vBox = new VBox();
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(10,10,10,10));

        StackPane r = new StackPane();
        r.getChildren().add(userGrid);

        vBox.getChildren().addAll(r);

        Scene sc = new Scene(vBox, 800, 550);

        // set the scene
        stage.setScene(sc);
        stage.show();


        /*
        HBox mainPane = new HBox();
        mainPane.setPadding(new Insets(10, 10, 10, 10));
        mainPane.setPrefSize(800, 350);
        mainPane.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
        mainPane.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
*/
/*
        Stage st = (Stage) mainPane.getScene().getWindow();
        st.getIcons().add(new Image("/resources/case.png"));



        VBox vBox = new VBox();*/

        /*for (;;){

        }*/

        // Scene scene = new Scene(st, 800, 350);

        /*stage.setTitle("Reviews");
        stage.getIcons().add(new Image("/resources/case.png"));
        stage.setScene(scene);
        stage.setResizable(false);*/

    }
}
