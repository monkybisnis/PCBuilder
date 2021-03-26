package payment;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;



public class StagedPayment extends Payment {

    private double realPrice;
    @Override
    public void payForPC(double amount) {
        System.out.println("making stage payment, 50 % now, 50% in 6 months" );
        Calendar calendar = Calendar.getInstance();
        Date now = calendar.getTime() ;
        calendar.add(Calendar.MONTH, 6);
        Date future = calendar.getTime() ;
        System.out.println("Future date " + future);
        double stageAmount = (amount * 1.1) / 2;
        paymentImplementor.processPayment(stageAmount);
        paymentImplementor.futurePayment(stageAmount, future);
    }

    public double getRealPrice() {
        return realPrice;
    }
}
