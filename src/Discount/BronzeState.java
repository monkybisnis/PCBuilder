package Discount;

public class BronzeState implements DiscountState {

    double discount = 0.03;

    public double calculateDiscount(double cost, Customer customer) {
        //1 euro = 1 point
        customer.addPoints((int)cost);

        if(customer.getPoints() >= 5000){
            customer.setState((new GoldState()));
        }

        else if(customer.getPoints() >= 2000){
            customer.setState(new SilverState());
        }

        return cost * discount;

    }
}
