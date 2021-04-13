package GUI;

import Components.Components;
import Components.Part.Part;
import GUI.MenuItems.AutoBuildButton;
import GUI.MenuItems.ExitButton;
import GUI.MenuItems.PartDisplayButton;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.List;

public class UI extends Application {
    static private Components components;

    private Stage stage;

    private FlowPane mainPane;
    private FlowPane partsPane = new FlowPane();
    private FlowPane cartPane;

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


        mainPane = new FlowPane();
        mainPane.setPadding(new Insets(10, 10, 10, 10));
        mainPane.setVgap(35);
        mainPane.setHgap(50);
        mainPane.setPrefSize(1200, 800);
        mainPane.setBackground(new Background(new BackgroundFill(Color.GREY, CornerRadii.EMPTY, Insets.EMPTY)));

        mainPane.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

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

        VBox split = new VBox();
        split.getChildren().addAll(menuVb, mainPane);

        Scene scene = new Scene(split, 1200, 800);

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
