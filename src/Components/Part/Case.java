package Components.Part;

import Components.Component;

import java.util.ArrayList;
import java.util.List;

public class Case extends Part {
    private List<Fan> fans;
    private int fanSlots;

    public Case(String serialNumber, String Type,String Brand, double price, double Wattage, int fanSlots) {
        super(serialNumber,Type,price,Wattage,Brand);
        this.fans = new ArrayList<Fan>();
        this.fanSlots = fanSlots;
    }

    public boolean addFan(Fan fan) {
        if (fans.size() < fanSlots) {
            fans.add(fan);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String fanList = "";
        for (Fan fan : fans) {
            fanList += fan.toString() + "\n";
        }
        return String.format("Case details:\nSerial number: %s\nType: %s\nBrand: %s\nPrice: %.1f\nWattage: %.1f\nFan slots: %d\nFans:\n%s\n", serialNumber, Type, brand, price, wattage, fanSlots, fanList);
    }
}
