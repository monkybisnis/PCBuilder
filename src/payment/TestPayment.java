package payment;

public class TestPayment {
    public static void main(String[] args){
       PaymentImplementor creditCardImplementor = new CreditCardImplementor() ;
       FullPayment fullPayment = new FullPayment() ;
       fullPayment.setPaymentImplementor(creditCardImplementor);
       fullPayment.payForCart(100);

        StagedPayment stagedPayment = new StagedPayment() ;
        stagedPayment.setPaymentImplementor(creditCardImplementor);
        stagedPayment.payForCart(100);
    }
}
