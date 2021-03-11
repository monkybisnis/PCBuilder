package Discount;

public class BronzeState implements DiscountState {

    double discount = 0.03;

    public double calculateDiscount(double cost) {
        return cost * discount;

    }
}
