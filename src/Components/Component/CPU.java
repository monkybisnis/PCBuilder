package Components.Component;

import Components.Part;

public class CPU extends Component implements Part {
    private double clockSpeed;
    private int cores;
    private String socket;
    private Fan fan;

    public CPU(String serial, String type, double price, double wattage, String brand, double clockSpeed, int cores, String socket) {
        super(serial, type, price, wattage, brand);
        this.clockSpeed = clockSpeed;
        this.cores = cores;
        this.socket = socket;
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
        return "";
    }
}
