package discount;

import discount.state.BronzeState;
import discount.state.GoldState;
import discount.state.SilverState;
import discount.state.State;
import discount.strategy.Strategy;

import java.text.DecimalFormat;

public class Customer {

    String name;
    String password;
    State state;
    private int points;
    private Cart cart;

    private static DecimalFormat df = new DecimalFormat("#.##");

    public Customer(String name, State state) {
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

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Customer(String name, String password, int points, Cart cart) {
        this.name = name;
        this.password = password;
        this.points = points;
        this.cart = cart;
    }

    public double calculateDiscount(double cost, Strategy strategy){
        return calculateStateDiscount(cost) + calculateStrategyDiscount(cost, strategy);
    }

    public double calculateStateDiscount(double cost){

        double discount = state.calculateDiscount(cost);
        System.out.println("state discount: "+ df.format(discount));
        return discount;

}

    public double calculateStrategyDiscount(double cost, Strategy strategy){
        double discount = strategy.calculateStrategyDiscount(cost, this);
        System.out.println("strategy discount " + df.format(discount));
        return discount;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
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

    public void deductPoints(int points){this.points -= points;}

    public void addPoints(int points){
        this.points += points;
        updateState();
    }

    public void updateState(){
        if(points < 2000){
            setState(new BronzeState() );
        }
        else if(points < 5000){
            setState(new SilverState());
        }
        else{
            setState(new GoldState());
        }
    }






}
