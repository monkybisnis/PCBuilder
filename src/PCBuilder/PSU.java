package PCBuilder;

public class PSU extends Component{

    //data fields
    private int wattage;

    public PSU(String serial,String type, String brand,double price,double Wattage) {
        super(serial,type,brand,price,Wattage);
    }

    public int getWattageSize(){
        return wattage;
    }

}