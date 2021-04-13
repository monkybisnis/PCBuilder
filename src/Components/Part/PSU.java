package Components.Part;

import Components.Component;

public class PSU extends Part {
    //data fields
    public PSU(String serial,String type, String brand,double price,double Wattage) {
        super(serial,type,price,Wattage,brand);
    }

    @Override
    public String toString() {
        return "Storage details:\n Name: "+serialNumber+ "\n Type : "+ Type +"\n Brand : %d"+ brand+"\n Power Consumption : "+wattage+
                "\n Price : "+ price ;
    }

    @Override
    public String printDetails() {
        return null;
    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Component extract(int x) {
        return null;
    }
}