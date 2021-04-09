//package discount.state;
//import discount.Customer;
//
//
//enum States{
//    BronzeState,
//    SilverState,
//    GoldState
//}
//
//enum Transformations{
//    BronzeToSilver, BronzeToGold,
//    SilverToGold, SilverToBronze,
//    GoldToSilver, GoldToBronze
//}
//
//
//public class stateObject implements State {
//
//    //stateObject state = new stateObject();
//    String nameOfState;
//
//    private stateObject(String state){
//        this.nameOfState = state;
//    }
//    @Override
//    public double calculateDiscount(double cost, Customer customer) {
//        return 0;
//    }
//    // this object will store and be trigger event in option on change the state
//
//
//}
