package GUI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class UI extends Application {
    private Stage stage;

    private FlowPane mainPane;
    private FlowPane partsPane;
    private FlowPane cartPane;

    private void displayUI() {
        //FlowPane for the background and adding the sectors
        mainPane = new FlowPane();
        mainPane.setPadding(new Insets(10, 10, 10, 10));
        mainPane.setVgap(35);
        mainPane.setHgap(50);
        mainPane.setPrefSize(1200, 800);
        mainPane.setBackground(new Background(new BackgroundFill(Color.GREY, CornerRadii.EMPTY, Insets.EMPTY)));

        mainPane.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));


        partsPane = new FlowPane();
        Label label = new Label("Available Parts:");
        label.setTextFill(Color.color(0, 0, 0));
        partsPane.setPrefSize(800, 700);
        partsPane.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        VBox v = new VBox();
        v.setPadding(new Insets(10, 10, 10, 10));
        v.getChildren().addAll(label, partsPane);
        mainPane.getChildren().add(v);

        cartPane = new FlowPane();
        label = new Label("Cart:");
        label.setTextFill(Color.color(0, 0, 0));
        cartPane.setPrefSize(280, 700);
        cartPane.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        v = new VBox();
        v.setPadding(new Insets(10, 10, 10, 10));
        v.getChildren().addAll(label, cartPane);
        mainPane.getChildren().add(v);

        Scene scene = new Scene(mainPane, 1200, 800);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }


    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        displayUI();
    }

    public static void run() {
        launch("");
    }
}
