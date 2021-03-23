package discount;

import discount.state.GoldState;
import discount.state.SilverState;
import discount.strategy.NoSaleStrategy;
import discount.strategy.SaleStrategy;
import discount.strategy.Strategy;
import discount.strategy.SuperSaleStrategy;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;



import static org.junit.Assert.assertEquals;
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
    void noDiscountTest() {
        Strategy noSale = new NoSaleStrategy();
       // assertEquals(0, customer.calculateDiscount(1000, noSale), "right amount");
    }



    @Test
    void toSilverTest(){
        Strategy noSale = new NoSaleStrategy();
        customer.calculateDiscount(3000, noSale);
        assertEquals(SilverState.class, customer.getState().getClass());
    }
//
    @Test
    void toGoldTest(){
        Strategy noSale = new NoSaleStrategy();
        customer.calculateDiscount(5000,noSale);
        assertEquals(GoldState.class, customer.getState().getClass());
    }
//
    @Test
    void noSaleSilverTest(){
        Strategy noSale = new NoSaleStrategy();
        customer.addPoints(3000);
        double discount = customer.calculateDiscount(1000, noSale);
        assertEquals(20, discount);
    }


    @Test
    void saleSilverTest(){
        Strategy saleStrategy = new SaleStrategy();
        customer.addPoints(3000);
        double discount = customer.calculateDiscount(1000, saleStrategy);
        // state discount 20 + strategy discount 20 (max 2000 points) = 40
        assertEquals(40, discount);
        assertEquals(2000, customer.getPoints());
    }

    @Test
    void saleGoldTest(){
        Strategy saleStrategy = new SaleStrategy();
        customer.addPoints(5000);
        double discount = customer.calculateDiscount(1000, saleStrategy);
        // state discount 50 + strategy discount 20 (max 2000 points) =70
        assertEquals(70, discount);
        assertEquals(4000, customer.getPoints());
    }

    @Test
    void superSaleGoldTest(){
        Strategy supperSaleStrategy = new SuperSaleStrategy();
        customer.addPoints(5000);
        double discount = customer.calculateDiscount(1000, supperSaleStrategy);
        // state discount 50 + strategy discount 40 (max 4000 points) =90
        assertEquals(90, discount);
        assertEquals(3000, customer.getPoints());
    }






}