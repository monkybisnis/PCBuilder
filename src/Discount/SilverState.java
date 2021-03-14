package Discount;

public class SilverState implements DiscountState {

    double discount = 0.05;
    public double calculateDiscount(double cost, Customer customer){

        customer.addPoints((int)cost);

        if(customer.getPoints() >= 5000){
            customer.setState((new GoldState()));
        }

        return cost * discount;
    }
}
