package PCBuilder;

public class Memory extends Component {

    private int speed;
    private int size;



    public Memory(String serial, String type,String brand, double price, double Wattage, int speed, int size){
        super(serial,type,brand,price,Wattage);

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
