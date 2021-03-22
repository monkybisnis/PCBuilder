package payment;

import discount.Customer;
import discount.strategy.SaleStrategy;
import discount.strategy.Strategy;

public class ProcessPayment {

    public void processPayment(double amount){

        Customer customer = new Customer("joe");

        Strategy saleStrategy = new SaleStrategy();
        double discount = customer.calculateDiscount(amount, saleStrategy);
        double realPrice = amount - discount;
        Payment payment = new StagedPayment();
        payment.setPaymentImplementor(new DebitCardPayment());
        payment.payForPC(realPrice);

    }
}
