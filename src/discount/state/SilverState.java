package discount.state;

public class SilverState implements State {

    double discount = 0.02;
    public double calculateDiscount(double cost){
        return cost * discount;
    }
}
