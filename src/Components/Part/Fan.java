package Components.Part;


public class Fan extends Part {
    private int RPMs;

    public Fan(){}

    public Fan(String serial, String type, String brand, double price, double wattage, int RPMs, String icon) {
        super(serial, type, price, wattage, brand, icon);
        this.RPMs = RPMs;
    }

    @Override
    public String toString() {
        return String.format("Fan details:\nSerial number: %s\nType: %s\nBrand: %s\nPrice: %f\nWattage: %f\nRPMs: %d", serialNumber, Type, brand, price, wattage, RPMs);
    }
}
