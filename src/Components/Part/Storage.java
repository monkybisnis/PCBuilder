package Components.Part;

import java.io.Serializable;

public class Storage extends Part implements Serializable {
    //data fields
    private int storageSize;

    public Storage(){}

    public Storage(String serial,String type,String Brand,double price,double Wattage,int storageSize, String icon) {
        super(serial,type,price,Wattage,Brand, icon);
        this.storageSize=storageSize;
    }

    public int getStorageSize(){
        return storageSize;
    }

    @Override
    public String toString() {
        return String.format("Storage details:\nSerial number: %s\nType: %s\nBrand: %s\nPrice: %f\nWattage: %f\n", serialNumber, Type, brand, price, wattage);
    }
}