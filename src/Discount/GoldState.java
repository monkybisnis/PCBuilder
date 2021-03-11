package Discount;

public class GoldState implements DiscountState {
    double discount = 0.1;
    public double calculateDiscount(double cost){
        return cost*discount;
    }
}
