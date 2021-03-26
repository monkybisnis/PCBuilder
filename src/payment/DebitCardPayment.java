package payment;

import java.text.DecimalFormat;
import java.util.Date;


public class DebitCardPayment implements PaymentImplementor{

    private static DecimalFormat df = new DecimalFormat("#.##");
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment from Debit Card " + df.format(amount));
        System.out.println("YOur current balance is 100\nDo you want to proceed ");

    }

    @Override
    public void futurePayment(double amount, Date date) {

        System.out.println("Future payment from Debit Card " + df.format(amount));
    }
}
