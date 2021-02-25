package PCBuilder;

public abstract class Component {
    String serialNumber;
    double height;
    double width;
    double length;
    double price;

    public Component(String serialNumber, double height, double width, double length, double price) {
        this.serialNumber = serialNumber;
        this.height = height;
        this.width = width;
        this.length = length;
        this.price = price;
    }
}
