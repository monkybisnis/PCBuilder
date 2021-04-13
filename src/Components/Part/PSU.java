package Components.Part;

public class PSU extends Part {
    //data fields
    public PSU(){}

    public PSU(String serial,String type, String brand,double price,double Wattage, String icon) {
        super(serial,type,price,Wattage,brand, icon);
    }

    @Override
    public String toString() {
        return "Storage details:\n Name: "+serialNumber+ "\n Type : "+ Type +"\n Brand : %d"+ brand+"\n Power Consumption : "+wattage+
                "\n Price : "+ price ;
    }
}