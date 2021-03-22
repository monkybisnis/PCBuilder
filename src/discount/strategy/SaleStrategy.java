package discount.strategy;

import discount.Customer;

public class SaleStrategy implements Strategy {

    @Override
    public double calculateStrategyDiscount(double cost, Customer customer) {
        int points = 0;
        //can can only cash in 2000 points
        if(customer.getPoints() < 2000){
            points = customer.getPoints();
        }
        else{
            points = 2000;
        }

        customer.deductPoints(points);
        customer.addPoints((int)cost);
        return points/100.0;
    }
}
