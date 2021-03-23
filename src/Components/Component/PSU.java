package Components.Component;

import Components.Part;

public class PSU extends Component implements Part {
    //data fields
    public PSU(String serial,String type, String brand,double price,double Wattage) {
        super(serial,type,price,Wattage,brand);
    }

    @Override
    public String printDetails() {
        return "Storage details:\n Name: "+serialNumber+ "\n Type : "+ Type +"\n Brand : %d"+ brand+"\n Power Consumption : "+wattage+
                "\n Price : "+ price ;
    }
}