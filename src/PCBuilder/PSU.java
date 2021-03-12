package PCBuilder;

import Components.Part;

public class PSU extends Component implements Part {

    //data fields


    public PSU(String serial,String type, String brand,double price,double Wattage) {
        super(serial,type,price,Wattage,brand);
    }


    @Override
    public String printDetails() {
        return null;
    }
}