package discount.state;

import discount.Customer;

public class SilverState implements State {

    double discount = 0.02;
    public double calculateDiscount(double cost, Customer customer){
        return cost * discount;
    }
}
