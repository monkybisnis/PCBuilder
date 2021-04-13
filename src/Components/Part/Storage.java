package Components.Part;

import Components.Component;

public class Storage extends Part {
    //data fields
    private int storageSize;

    public Storage(String serial,String type,String Brand,double price,double Wattage,int storageSize) {
        super(serial,type,price,Wattage,Brand);
        this.storageSize=storageSize;
    }

    public int getStorageSize(){
        return storageSize;
    }

    @Override
    public String toString() {

        return "Storage details:\n Name: "+ serialNumber+ "\n Type : "+ Type +"\n Brand : "+ brand+"\n Power Consumption : "+wattage+
                "\n Size : "+ storageSize+"\n Price : "+ price;
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