package payment;

public class FullPayment extends Payment {


    @Override
    public String payForCart(double amount) {
        paymentImplementor.processPaymentNow(amount);
        return "";
    }
}

