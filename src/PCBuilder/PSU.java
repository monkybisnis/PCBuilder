package PCBuilder;

public class PSU extends Component{

    //data fields
    private int wattage;

    public PSU(){

    }

    public PSU(int wattage){
        this.wattage = wattage;
    }

    public int getWattageSize(){
        return wattage;
    }

}