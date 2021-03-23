package payment;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;



public class StagedPayment extends Payment {

    private double realPrice;
    @Override
    public void payForPC(double amount) {

        Calendar calendar = Calendar.getInstance();
        Date now = calendar.getTime() ;
        calendar.add(Calendar.MONTH, 6);
        Date future = calendar.getTime() ;
        double stageAmount = (amount * 1.1) / 2;
        paymentImplementor.processPayment(stageAmount);
        paymentImplementor.futurePayment(stageAmount, future);
    }

    public double getRealPrice() {
        return realPrice;
    }
}
