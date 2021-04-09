package discount.strategy;

import discount.Customer;


public class SaleStrategy implements Strategy {

    private final int CUT_OFF_POINT = 2000;
    private final int POINT_CASH_DIVIDER = 100;

    @Override
    public double calculateStrategyDiscount(double cost, Customer customer) {
        int points = 0;
        //can can only cash in 2000 points
        if(customer.getPoints() < CUT_OFF_POINT){
            points = customer.getPoints();
        }
        else{
            points = CUT_OFF_POINT;
        }

        customer.deductPoints(points);
        customer.addPoints((int)cost);
        return points / POINT_CASH_DIVIDER;
    }
}
