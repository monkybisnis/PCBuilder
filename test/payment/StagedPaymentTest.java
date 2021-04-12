package payment;

import discount.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StagedPaymentTest {

    double amount = 500;
    ProcessPayment payer = new ProcessPayment();

    @BeforeEach
    void setUp() {

    }

    @Test
    void stagedPaymentTest()  {

        double stageAmount = (amount * 1.1) / 2;
        payer.processPayment(stageAmount);
        assertEquals(275, payer.getRealPrice(), "right amount");
    }
}
