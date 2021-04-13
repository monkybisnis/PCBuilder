package discount;

import Components.Component;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<Component> components;
    public Cart() {
        components = new ArrayList<Component>();
    }

    public void addItem(Component c){
        components.add(c);
    }

    public void deleteItem(Component c){
        components.remove(c);
    }

//    public double getTotalPrice(){
//        double price = 0;
//        for(Component c: components){
//            price += c
//        }
//    }

}
