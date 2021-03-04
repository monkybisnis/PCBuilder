package PCBuilder;

public class Cooling extends Component {

    //data fields

    private String Socket;

    public Cooling(String serial, String Type,String Brand,String Socket, double price,double Wattage) {
        super(serial,Type,Brand ,price,Wattage);

        this.Socket=Socket;
    }



    public void setSocket(String socket){this.Socket=socket;}

    public String getSocket(){return Socket;}

}
