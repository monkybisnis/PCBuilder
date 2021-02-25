package PCBuilder;

public class GPU {

    private double clockSpeed;
    private int memory;
    private int cache;

    public GPU(double clockSpeed, int memory, int cache) {
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
