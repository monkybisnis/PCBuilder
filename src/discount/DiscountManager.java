package discount;

import discount.strategy.SaleStrategy;
import discount.strategy.Strategy;

//This class will oversee
public class DiscountManager {

    public static double calculateDiscountedCost(double cost, Customer customer){
        Strategy saleStrategy = new SaleStrategy();
        return  customer.calculateDiscount(cost, saleStrategy);
    }
}
