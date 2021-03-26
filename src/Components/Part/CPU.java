package Components.Part;

import Components.Component;

import java.util.ArrayList;
import java.util.List;

public class CPU extends Part implements Component {
    private double clockSpeed;
    private int cores;
    private String socket;
    private Fan fan;

    private List<Fan> fans;
    static private int fanSlots = 2;

    public CPU(String serial, String type, double price, double wattage, String brand, double clockSpeed, String socket) {
        super(serial, type, price, wattage, brand);
        this.clockSpeed = clockSpeed;
        this.cores = cores;
        this.socket = socket;
        this.fans = new ArrayList<Fan>();
    }

    public boolean addFan(Fan fan) {
        if (fans.size() < fanSlots) {
            fans.add(fan);
            return true;
        } else {
            return false;
        }
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public String getSocket()
    {
        return socket;
    }

    public void setSocket(String socket)
    {
        this.socket = socket;
    }

    public void addCooler(Fan fan) {
        this.fan = fan;
    }

    public String printDetails() {
        return String.format("CPU details:\nSerial number: %s\nType: %s\nPrice: %f\nWattage: %f\nClock Speed: %f\nSocket: %s\n", serialNumber, Type, brand, price, wattage, clockSpeed, socket);
    }
}
