package PCBuilder;

public class CPU implements Component {
    private double clockSpeed;
    private int cores;
    private String socket;
    private Fan fan;

    CPU(String serial, String type, double price, double wattage, String brand, double clockSpeed, int cores, String socket, Fan fan) {

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

    public Fan addFan()
    {
        Fan fan= new Fan();
        return fan;
    }

    @Override
    public void showComponentProperties() {

         String socket= getSocket();
         Double speed= getClockSpeed();

         System.out.println(socket);
         System.out.println(speed);
    }
}
