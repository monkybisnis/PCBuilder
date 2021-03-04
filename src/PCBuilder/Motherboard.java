package PCBuilder;


public class Motherboard extends Component {


    private String Socket;
    private int RamSlots;


    public Motherboard(String serial, String type,String brand,String Socket, double price,double Wattage,int  RAMSlots) {
        super(serial,type,brand ,price,Wattage);

        this.Socket=Socket;
    }



    public void setSocket(String socket){ this.Socket=socket;}
    public String getSocket(){return Socket;}
}
