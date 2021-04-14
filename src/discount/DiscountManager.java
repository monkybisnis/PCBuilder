package discount;

import discount.strategy.SaleStrategy;
import discount.strategy.Strategy;

public class DiscountManager {

    public static double calculateDiscountedCost(double cost, Customer customer){
        Strategy saleStrategy = new SaleStrategy();
        return  customer.calculateDiscount(cost, saleStrategy);
    }
}
