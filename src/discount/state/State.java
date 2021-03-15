package discount.state;

import discount.Customer;

public interface State {

    public double calculateDiscount(double cost, Customer customer);

}
