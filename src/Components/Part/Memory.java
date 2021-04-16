package Components.Part;


import java.io.Serializable;

public class Memory extends Part implements Serializable {
    private int speed;
    private int size;

    public Memory(){}

    public Memory(String serial, String type, String brand, double price, double wattage, int speed, int size, String icon){
        super(serial,type,price,wattage,brand, icon);

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
        return String.format("Memory details:\nSerial number: %s\nType: %s\nBrand: %s\nPrice: %f\nWattage: %f\n", serialNumber, Type, brand, price, wattage);
    }
}
