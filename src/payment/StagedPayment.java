package payment;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;


public class StagedPayment extends Payment {

    private static DecimalFormat df = new DecimalFormat("#.##");
    private double realPrice;
    @Override
    public String payForCart(double amount) {
        String s = "\nMaking stage payment, 50 % now, 50% in 6 month, 5% interest charged\n";
        System.out.println("making stage payment, 50 % now, 50% in 6 months" );
        Calendar calendar = Calendar.getInstance();
        Date now = calendar.getTime() ;
        calendar.add(Calendar.MONTH, 6);
        Date future = calendar.getTime() ;
        System.out.println("Future date " + future);
        s += "Future date: "+  future + "\n";
        double stageAmount = (amount * 1.05) / 2;
        s += "Stage Amount: " + df.format(stageAmount) + "\n";
        paymentImplementor.processPaymentNow(stageAmount);
        paymentImplementor.futurePayment(stageAmount, future);
        return s;
    }

    public double getRealPrice() {
        return realPrice;
    }
}
