package discount.strategy;

import discount.Customer;

public class SuperSaleStrategy implements Strategy {

    private int MAX = 4000;
    @Override
    public double calculateStrategyDiscount(double cost, Customer customer) {

        int points = 0;
        //can can only cash in 4000 points
        if(customer.getPoints() < MAX){
            points = customer.getPoints();
        }
        else{
            points = MAX;
        }

        customer.deductPoints(points);
        //get double points
        customer.addPoints((int)cost*2);
        return points/100.0;
    }


}
