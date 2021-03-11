package Discount;

public class Customer {

    String name;
    DiscountState state;

    public Customer(String name, DiscountState state) {
        this.name = name;
        this.state = state;
    }

    public double calculateActualCost(double cost){
        return cost - state.calculateDiscount(cost);
    }

    public DiscountState getState() {
        return state;
    }

    public void setState(DiscountState state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }






}
