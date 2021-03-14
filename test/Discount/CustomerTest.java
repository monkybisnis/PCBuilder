package Discount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer("joe");
    }

    @Test
    void getNameTest() {
        assertEquals("joe", customer.getName(), "getName() should work");
    }


    @Test
    void calculateDiscountedCostTest() {
        assertEquals(970, customer.calculateDiscountedCost(1000), "right amount");
    }

    @Test
    void toSilverTest(){
        customer.calculateDiscountedCost(3000);
        assertEquals(SilverState.class, customer.getState().getClass());
    }

    @Test
    void toGoldTest(){
        customer.calculateDiscountedCost(5000);
        assertEquals(GoldState.class, customer.getState().getClass());
    }

    @Test
    void pointsTest(){
        customer.calculateDiscountedCost(2500);
        customer.calculateDiscountedCost(4000);
        assertEquals(6500, customer.getPoints());
    }

}