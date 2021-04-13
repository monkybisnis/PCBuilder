package Components.Part;




public class Motherboard extends Part {
    private String Socket;
    private int RamSlots;

    public Motherboard(){}

    public Motherboard(String serial, String type,String brand, double price,double Wattage,String Socket,int RAMSlots, String icon) {
        super(serial,type ,price,Wattage,brand, icon);

        this.Socket=Socket;
    }

    public void setSocket(String socket){ this.Socket=socket;}

    public String getSocket(){return Socket;}

    @Override
    public String toString() {
        return String.format("Motherboard details:\nSerial number: %s\nType: %s\nBrand: %s\nPrice: %f\nWattage: %f\nSocket: %s\n", serialNumber, Type, brand, price, wattage, Socket);
    }
}
