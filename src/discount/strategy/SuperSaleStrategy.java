package discount.strategy;

import discount.Customer;

public class SuperSaleStrategy implements Strategy {


    @Override
    public double calculateStrategyDiscount(double cost, Customer customer) {

        int points = 0;
        //can can only cash in 4000 points
        if(customer.getPoints() < 4000){
            points = customer.getPoints();
        }
        else{
            points = 4000;
        }

        customer.deductPoints(points);
        //get double points
        customer.addPoints((int)cost*2);
        return points/100.0;
    }


}
