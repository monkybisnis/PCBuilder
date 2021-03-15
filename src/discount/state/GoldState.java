package discount.state;

import discount.Customer;

public class GoldState implements State {
    double discount = 0.05;
    public double calculateDiscount(double cost, Customer customer){
        return cost*discount;
    }
}
