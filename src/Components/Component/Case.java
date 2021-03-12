package Components.Component;

import Components.Part;

import java.util.ArrayList;
import java.util.List;

public class Case extends Component implements Part {
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
    public String printDetails() {
        return null;
    }
}
