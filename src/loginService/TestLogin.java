package loginService;

import discount.Customer;
import discount.strategy.SaleStrategy;
import discount.strategy.Strategy;
import payment.PaypalImplementor;
import payment.Payment;
import payment.StagedPayment;

public class TestLogin {
    public static void main(String[] args) {
        double cost = 1500;
        System.out.println("list price " + cost);

//        Customer customer = new Customer("joe");
//        customer.addPoints(2000);

        Customer customer = LoginService.login("joe", "1234");
        if(customer!= null) {
            Strategy saleStrategy = new SaleStrategy();
            double discount = customer.calculateDiscount(cost, saleStrategy);
            double realPrice = cost - discount;
            System.out.println("discounted price " + realPrice);
            Payment payment = new StagedPayment();
            payment.setPaymentImplementor(new PaypalImplementor());
            payment.payForCart(realPrice);
        }
        else
        {
            System.out.println("Incorrect Login");
        }

        customer = LoginService.register("John", "12345");
        if(customer != null){
            System.out.println("Register successful");
        }
        else{
            System.out.println("Register failed");
        }

    }
}