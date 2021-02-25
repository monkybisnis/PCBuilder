package PCBuilder;

public class PSU extends Component{

    //data fields
    private int wattage;

    public PSU(String serial, double height, double width, double length, double price) {
        super(serial, height, width, length, price);
    }

    public int getWattageSize(){
        return wattage;
    }

}