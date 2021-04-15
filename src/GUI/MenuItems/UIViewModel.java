package GUI.MenuItems;

import Components.Component;
import Components.Part.Part;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Pair;

import java.util.Optional;

public interface UIViewModel


{

    default void displayLoginDialog() {
        Dialog<Pair<String, String>> dialog = new Dialog<>();

        Stage st = (Stage)dialog.getDialogPane().getScene().getWindow();
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
        result.ifPresent(pair -> System.out.println("Username: " + pair.getKey() + " Password: " + pair.getValue()));
    }


    public default void setClickEvent(Label label, Part c) {
        ContextMenu contextMenu = new ContextMenu();
        ItemActionButton item = new ItemActionButton("Add to Cart", c);
        contextMenu.getItems().addAll(item);
        label.setOnContextMenuRequested(event -> contextMenu.show(label, event.getScreenX(), event.getScreenY()));
    }

    public default Node[] displayParts(Component component) {
       Node[] parts= new Node[component.size()];
        for (int i = 0; i < component.size(); i++) {
            Part c = (Part)component.extract(i);
            String display = c.toString();
            String path = "/resources/" + c.getIcon();
            Label label = new Label(display, new ImageView(new Image(path)));
            label.setOnMouseClicked(event -> setClickEvent((Label)event.getSource(), c));
            label.setContentDisplay(ContentDisplay.TOP);
            label.setTextFill(Color.WHITE);
            parts[i]=label;
        }
        return parts;
    }

}
