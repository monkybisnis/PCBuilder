package PCBuilder;

public class CPU extends Component {
    private int clockSpeed;
    private int cores;

    public CPU(String serial, double height, double width, double length, double price, int clockSpeed, int cores) {
        super(serial, height, width, length, price);
        this.clockSpeed = clockSpeed;
        this.cores = cores;
    }

    public int getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

}
