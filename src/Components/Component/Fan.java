package Components.Component;

import Components.Part;

public class Fan extends Component implements Part {
    private int RPMs;

    public Fan(String serial, String type, String brand, double price, double wattage, int RPMs) {
        super(serial, type, price, wattage, brand);
        this.RPMs = RPMs;
    }

    @Override
    public String printDetails() {
        return null;
    }
}
