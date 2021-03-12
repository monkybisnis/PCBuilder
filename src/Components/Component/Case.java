package Components.Component;

import Components.Part;

public class Case  extends  Component implements Part{
    public Case(String serialNumber, String Type,String Brand, double price,double Wattage){
        super(serialNumber,Type,price,Wattage,Brand);

    }

    @Override
    public String printDetails() {
        return null;
    }
}
