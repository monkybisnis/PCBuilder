package discount.state;

public class GoldState implements State {
    double discount = 0.05;
    public double calculateDiscount(double cost){
        return cost*discount;
    }

    @Override
    public String toString() {
        return "Gold";
    }
}
