package Discount;

public class SilverState implements DiscountState {

    double discount = 0.05;
    public double calculateDiscount(double cost){
        return cost * discount;

    }
}
