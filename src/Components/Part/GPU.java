package Components.Part;

import java.io.Serializable;

public class GPU extends Part implements Serializable {
    private double clockSpeed;
    private int memory;

    public GPU(){}

    public GPU(String serial,String Type,String brand,double price,double Wattage,double clockSpeed, int memory, String icon) {
        super(serial,Type,price,Wattage,brand, icon);
        this.clockSpeed = clockSpeed;
        this.memory = memory;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(double clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return String.format("GPU details:\nSerial number: %s\nType: %s\nBrand: %s\nPrice: %f\nWattage: %f\nClock Speed: %f\nMemory: %d\n", serialNumber, Type, brand, price, wattage, clockSpeed, memory);
    }
}
