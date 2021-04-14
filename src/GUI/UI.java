package GUI;

import Components.Components;
import Components.Part.Part;
import GUI.MenuItems.AutoBuildButton;
import GUI.MenuItems.ExitButton;
import GUI.MenuItems.PartDisplayButton;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.List;

public class UI extends Application {
    static private Components components;

    private Stage stage;

    private HBox mainPane;
    private FlowPane partsPane = new FlowPane();
    private VBox cartPane = new VBox();

    private void displayParts() {

    }

    private void displayUI() {
        Menu file = new Menu("File");
        Menu view = new Menu("View");
        Menu build = new Menu("Build");

        ExitButton f1 = new ExitButton("Exit");

        PartDisplayButton v1 = new PartDisplayButton("Cases", stage, partsPane, components.extract(0));
        PartDisplayButton v2 = new PartDisplayButton("CPUs", stage, partsPane, components.extract(1));
        PartDisplayButton v3 = new PartDisplayButton("GPUs", stage, partsPane, components.extract(2));
        PartDisplayButton v4 = new PartDisplayButton("Memory Modules", stage, partsPane, components.extract(3));
        PartDisplayButton v5 = new PartDisplayButton("Motherboards", stage, partsPane, components.extract(4));
        PartDisplayButton v6 = new PartDisplayButton("PSUs", stage, partsPane, components.extract(5));
        PartDisplayButton v7 = new PartDisplayButton("Storage Components", stage, partsPane, components.extract(6));

        AutoBuildButton b1 = new AutoBuildButton("Auto Build Optimized Budget PC");
        AutoBuildButton b2 = new AutoBuildButton("Auto Build Optimized Gaming PC");
        AutoBuildButton b3 = new AutoBuildButton("Auto Build Optimized PowerSaver PC");

        file.getItems().addAll(f1);
        view.getItems().addAll(v1, v2, v3, v4, v5, v6, v7);
        build.getItems().addAll(b1, b2, b3);
        MenuBar mb = new MenuBar();
        mb.getMenus().addAll(file, view, build);
        VBox menuVb = new VBox(mb);

        mainPane = new HBox();
        mainPane.setPadding(new Insets(10, 10, 10, 10));
        mainPane.setPrefSize(1200, 700);
        mainPane.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));

        mainPane.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

        Label label = new Label("Available Parts:");
        label.setTextFill(Color.WHITE);
        partsPane.setPrefSize(800, 700);
        partsPane.setPadding(new Insets(5, 5, 5, 5));
        partsPane.setBackground(new Background(new BackgroundFill(Color.rgb(22, 9, 23), CornerRadii.EMPTY, Insets.EMPTY)));

        ScrollPane sPartsPane = new ScrollPane();
        sPartsPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        sPartsPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        sPartsPane.setContent(partsPane);

        VBox v = new VBox();
        v.setPadding(new Insets(10, 10, 10, 10));
        v.getChildren().addAll(label, sPartsPane);

        mainPane.getChildren().add(v);

        label = new Label("Cart:");
        label.setTextFill(Color.WHITE);

        cartPane.setPrefSize(280, 700);
        cartPane.setBackground(new Background(new BackgroundFill(Color.rgb(22, 9, 23), CornerRadii.EMPTY, Insets.EMPTY)));

        ScrollPane sCartPane = new ScrollPane();
        sCartPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        sCartPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        sCartPane.setContent(cartPane);

        v = new VBox();
        v.setPadding(new Insets(10, 10, 10, 10));
        v.getChildren().addAll(label, sCartPane);

        mainPane.getChildren().add(v);

        /*
        ScrollPane sMainPane = new ScrollPane();
        sMainPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        sMainPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        sMainPane.setStyle("-fx-background: rgb(255,255,255);\n -fx-background-color: rgb(255,255,255)");
        sMainPane.setContent(mainPane);
        */

        VBox split = new VBox();
        split.getChildren().addAll(menuVb, mainPane);

        Scene scene = new Scene(split, 1200, 700);

        stage.getIcons().add(new Image("/resources/case.png"));
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }


    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        displayUI();
    }

    public static void run(Components components) {
        UI.components = components;
        launch("");
    }
}
