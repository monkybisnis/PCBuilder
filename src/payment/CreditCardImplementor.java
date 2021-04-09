package payment;

import java.util.Date;

public class CreditCardImplementor implements PaymentImplementor {


    @Override
    public void processPaymentNow(double amount) {

        System.out.println("Payment from Credit Card" + amount);

    }

    @Override
    public void futurePayment(double amount, Date date) {

        System.out.println("Future payment from Credit Card" + amount);

    }
}
