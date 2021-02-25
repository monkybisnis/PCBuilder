package PCBuilder;

public class Memory {

    private int speed;
    private int size;

    public Memory(){
    }

    public Memory(int speed, int size){

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
}
