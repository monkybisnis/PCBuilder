package discount;

import discount.state.BronzeState;
import discount.state.GoldState;
import discount.state.SilverState;
import discount.state.State;
import discount.strategy.Strategy;

public class Customer {

    String name;
    State state;
    private int points;

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

    public double calculateDiscount(double cost, Strategy strategy){
        return calculateStateDiscount(cost) + calculateStrategyDiscount(cost, strategy);
    }

    public double calculateStateDiscount(double cost){
        return state.calculateDiscount(cost, this);
    }

    public double calculateStrategyDiscount(double cost, Strategy strategy){
        return strategy.calculateStrategyDiscount(cost, this);
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
