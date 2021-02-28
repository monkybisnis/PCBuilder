package PCBuilder;

public abstract class Component {
    String serialNumber;
    String Type;
    double price;
    double Wattage;
    String Brand;

    public Component(String serialNumber, String Type,String Brand, double price,double Wattage) {
        this.serialNumber = serialNumber;
        this.Type= Type;
        this.price = price;
        this.Wattage=Wattage;
        this.Brand=Brand;
    }

    public String getSerialNumber()
    {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber)
    {
        this.serialNumber=serialNumber;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWattage() {
        return Wattage;
    }

    public void setWattage(double Wattage) {
        Wattage = Wattage;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }
}
