package PCBuilder;

import Components.Part;

public class Memory extends Component implements Part {

    private int speed;
    private int size;



    public Memory(String serial, String type,String brand, double price, double Wattage, int speed, int size){
        super(serial,type,price,Wattage,brand);

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
    public String printDetails() {
        return null;
    }
}
