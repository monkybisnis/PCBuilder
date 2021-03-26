package payment;

import discount.Customer;
import discount.strategy.SaleStrategy;
import discount.strategy.Strategy;

public class ProcessPayment {

    private double discount;
    public double realPrice;


    public void processPayment(double amount){

        Customer customer = new Customer("joe");

        Strategy saleStrategy = new SaleStrategy();
        discount = customer.calculateDiscount(amount, saleStrategy);
        realPrice = amount - discount;
        Payment payment = new StagedPayment();
        payment.setPaymentImplementor(new DebitCardPayment());
        payment.payForPC(realPrice);

    }

    public double getRealPrice() {
        return realPrice;
    }


}
