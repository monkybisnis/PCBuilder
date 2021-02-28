package PCBuilder;

public class GPU extends Component {

    private double clockSpeed;
    private int memory;
    private int cache;

    public GPU(String serial,String Type,String brand,double price,double Wattage,double clockSpeed, int memory, int cache) {
        super(serial,Type,brand,price,Wattage);

        this.clockSpeed = clockSpeed;
        this.memory = memory;
        this.cache = cache;
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

    public int getCache() {
        return cache;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }



}
