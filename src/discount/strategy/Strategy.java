package discount.strategy;

import discount.Customer;

public interface Strategy {
    double calculateStrategyDiscount(double cost, Customer customer);
}
