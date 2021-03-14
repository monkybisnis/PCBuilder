package Discount;
//This class will oversee
public class DiscountManager {

    public static double calculateDiscountedCost(double cost, Customer customer){

        return  customer.calculateDiscountedCost(cost);
    }
}
