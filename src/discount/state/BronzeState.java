package discount.state;

public class BronzeState implements State {

    public double calculateDiscount(double cost) {
       return 0;
    }

    @Override
    public String toString() {
        return "Bronze";
    }
}
