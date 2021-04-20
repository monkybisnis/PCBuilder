package GUI;

// import javafx.scene.control.*;

import discount.Customer;
import discount.strategy.SaleStrategy;
import discount.strategy.Strategy;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import loginService.LoginService;
import payment.CreditCardImplementor;
import payment.PaymentImplementor;
import payment.StagedPayment;

import java.util.Optional;

public class PayLaterDialog {
//private Stage stage;

    // Here need to add a review for an item, save to file so it can be viewed later etc

    public static void runDialog(Customer customer) {
        Dialog<String> dialog = new Dialog<>();

        Stage st = (Stage) dialog.getDialogPane().getScene().getWindow();
        st.getIcons().add(new Image("/resources/case.png"));

        dialog.setTitle("Pay Later");

        ButtonType payButtonType = new ButtonType("Pay In Stages", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(payButtonType, ButtonType.CANCEL);

        VBox vBox = new VBox();
        vBox.setSpacing(10);
        TextArea payInfo = new TextArea();
        payInfo.setText("Payment Info\n");
        double totalPrice = customer.getCart().getTotalPrice();
        payInfo.appendText("List price: " + totalPrice + "\n");

        Strategy saleStrategy = new SaleStrategy();
        double discount = customer.calculateDiscount(customer.getCart().getTotalPrice(), saleStrategy);

        payInfo.appendText("Discount: " + discount + "\n");

        payInfo.appendText("Amount to pay: " + (totalPrice - discount));

        PaymentImplementor creditCardImplementor = new CreditCardImplementor() ;
        StagedPayment stagedPayment = new StagedPayment() ;
        stagedPayment.setPaymentImplementor(creditCardImplementor);
        String s = stagedPayment.payForCart(100);

        payInfo.appendText(s);

        vBox.getChildren().add(payInfo);
        dialog.getDialogPane().setContent(vBox);
        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == payButtonType) {
                return payInfo.getText();
            }
            return null;
        });
        Optional<String> result = dialog.showAndWait();
        result.ifPresent(reviewStr -> {
                    System.out.println("Payment Made");
                    LoginService.currentCustomer.getCart().clearCart();
                }
        );
    }
}
