package Discount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer("joe", new GoldState());
    }

    @Test
    void getName() {
        assertEquals("joe", customer.getName(), "getName() should work");
    }


    @Test
    void calculateActualCost() {
        assertEquals(900, customer.calculateActualCost(1000), "right amount");
    }

}