package PCBuilder;

public class Cooling extends Component {

    //data fields
    private double fanStrength;
    private String Socket;

    public Cooling(String serial, String Type,String Brand,String Socket, double price,double Wattage, double fanStrength) {
        super(serial,Type,Brand ,price,Wattage);
        this.fanStrength= fanStrength;
        this.Socket=Socket;
    }

    public double getFanStrength(){
        return fanStrength;
    }

    public void setFanStrength(double fanStrength){
        this.fanStrength = fanStrength;
    }

    public void setSocket(String socket){this.Socket=socket;}

    public String getSocket(){return Socket;}

}
