package payment;

public class FullPayment extends Payment {


    @Override
    public void payForPC(double amount) {
        paymentImplementor.processPayment(amount);
    }
}
