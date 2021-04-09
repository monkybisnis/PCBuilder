package payment;

public class FullPayment extends Payment {


    @Override
    public void payForPC(double amount) {
        paymentImplementor.processPaymentNow(amount);
    }
}

