package Components.Part;

import Components.Component;

public class Memory extends Part {
    private int speed;
    private int size;

    public Memory(String serial, String type, String brand, double price, double wattage, int speed, int size){
        super(serial,type,price,wattage,brand);

        this.speed = speed;
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Storage details:\n Name: +"+serialNumber+ "\n Type : "+ Type +"\n Brand : "+ brand+ "\n Size : "+ size+"\n ClockSpeed : "+ speed+"\n Power Consumption : "+wattage+
                "\n Price : "+ price ;
    }
}