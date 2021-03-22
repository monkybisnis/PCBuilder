package payment;

import java.util.Date;

public interface PaymentImplementor {

    public  void processPayment(double amount);
    public  void futurePayment(double amount, Date date);
}
