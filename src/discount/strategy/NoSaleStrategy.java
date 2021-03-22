package discount.strategy;

import discount.Customer;

public class NoSaleStrategy implements Strategy {

    @Override
    public double calculateStrategyDiscount(double cost, Customer customer) {
        customer.addPoints((int)cost);
        return 0;
    }
}
