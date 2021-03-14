package Discount;

public class Customer {

    String name;
    DiscountState state;
    private int points;

    public Customer(String name, DiscountState state) {
        this.name = name;
        this.state = state;
        this.points = 0;
    }
    //customer starts out as bronze
    public Customer(String name){
        this.name = name;
        this.state = new BronzeState();
        this.points = 0;
    }

    public double calculateDiscountedCost(double cost){
        return cost - state.calculateDiscount(cost, this);
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

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void addPoints(int points){
        this.points += points;
    }






}
