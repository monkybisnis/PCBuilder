package Components.Part;

import Components.Component;

public class GPU extends Part {
    private double clockSpeed;
    private int memory;

    public GPU(String serial,String Type,String brand,double price,double Wattage,double clockSpeed, int memory ) {
        super(serial,Type,price,Wattage,brand);
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
        return String.format("GPU details:\nSerial number: %s\nType: %s\nPrice: %f\nWattage: %f\nClock Speed: %f\nMemory: %d\n", serialNumber, Type, brand, price, wattage, clockSpeed, memory);
    }
}
