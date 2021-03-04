package PCBuilder;

public class CPU extends Component {
    private double clockSpeed;

    private String Socket;
    CPU(String serial, String Type, String brand, String Socket, double price, double Wattage, double clockSpeed) {
        super(serial, Type,brand, price,Wattage);
        this.clockSpeed = clockSpeed;

        this.Socket= Socket;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }


    public String getSocket()
    {
        return Socket;
    }

    public void setSocket(String socket)
    {
        this.Socket=socket;
    }
}
