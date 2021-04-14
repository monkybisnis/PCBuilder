package Components.Part;

public class PSU extends Part {
    //data fields
    public PSU(){}

    public PSU(String serial,String type, String brand,double price,double Wattage, String icon) {
        super(serial,type,price,Wattage,brand, icon);
    }

    @Override
    public String toString() {
        return String.format("PSU details:\nSerial number: %s\nType: %s\nBrand: %s\nPrice: %f\nWattage: %f\n", serialNumber, Type, brand, price, wattage);
    }
}