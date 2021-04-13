package discount;

import Components.Component;
import PCBuilder.PC;

import java.util.ArrayList;
import java.util.List;

public class Cart implements java.io.Serializable {

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

    public double getTotalPrice(PC pc){

        double price = pc.getTotalPrice();
        return price;
    }

}
