package Discount;

public class GoldState implements DiscountState {
    double discount = 0.1;
    public double calculateDiscount(double cost, Customer customer){

        customer.addPoints((int)cost);
        return cost*discount;
    }
}
