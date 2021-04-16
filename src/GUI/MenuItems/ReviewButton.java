package GUI.MenuItems;

import GUI.Command;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ReviewButton extends MenuItem implements Command {
    private Stage stage;


    public ReviewButton(String label, Stage stage) {
        super(label);
        this.setOnAction(event -> this.execute());
        this.stage = stage;
    }
    @Override
    public void execute() {
        // set title for the stage
        stage.setTitle("Reviews");

        // TODO: 1, on top User details same as main window
        GridPane userGrid = new GridPane();
        userGrid.setPadding(new Insets(10, 10, 10, 10));
        userGrid.setVgap(5);
        userGrid.setHgap(5);


        // TODO: 2, Submission part, condition only if user is log-in
        final TextField name = new TextField();
        name.setPromptText("Enter your first name.");
        name.setPrefColumnCount(10);
        name.getText();



        // TODO: 3, List of the reviews where in the top is roll option to chose


        TextField b = new TextField();
        StackPane r = new StackPane();
        r.getChildren().add(b);

        Scene sc = new Scene(r, 800, 550);

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

