package Components.Part;


import Components.Component;

public class Motherboard extends Part {
    private String Socket;
    private int RamSlots;

    public Motherboard(String serial, String type,String brand, double price,double Wattage,String Socket,int  RAMSlots) {
        super(serial,type ,price,Wattage,brand);

        this.Socket=Socket;
    }

    public void setSocket(String socket){ this.Socket=socket;}

    public String getSocket(){return Socket;}

    @Override
    public String toString() {

        return "Storage details:\n Name: "+ serialNumber+ "\n Type : "+ Type +"\n Socket : %d"+ brand+"\n Brand : %d"+ Socket+ "\n Power Consumption : "+wattage+
                "\n Price : "+ price ;
    }
}
