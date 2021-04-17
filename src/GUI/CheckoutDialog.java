package GUI;

import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import loginService.LoginService;

public class CheckoutDialog {
    public static void runDialog() {
        Dialog<String> dialog = new Dialog<>();

        Stage st = (Stage)dialog.getDialogPane().getScene().getWindow();
        st.getIcons().add(new Image("/resources/case.png"));

        dialog.setTitle("Checkout");

        ButtonType payNowButtonType = new ButtonType("Pay Now", ButtonBar.ButtonData.OK_DONE);
        ButtonType payLaterButtonType = new ButtonType("Pay Later", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(payNowButtonType, payLaterButtonType, ButtonType.CANCEL);

        VBox vBox = new VBox();
        vBox.setSpacing(10);
        Label cartItems = new Label("Items in Cart: " + LoginService.currentCustomer.getCart().getTotalItems());
        Label cartPrice = new Label("Total Price: " + LoginService.currentCustomer.getCart().getTotalPrice());

        vBox.getChildren().addAll(cartItems, cartPrice);
        dialog.getDialogPane().setContent(vBox);
        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == payNowButtonType) {
                System.out.println("Pay Now");
            } else if (dialogButton == payLaterButtonType) {
                System.out.println("Pay Later");
            }
            return null;
        });
        dialog.showAndWait();
    }
}
