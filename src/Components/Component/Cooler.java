package Components.Component;

import Components.Part;

public class Cooler extends Component implements Part {
    //data fields

    private String Socket;

    public Cooler(String serial, String Type, String Brand, String Socket, double price, double Wattage) {
        super(serial,Type,price,Wattage,Brand );

        this.Socket=Socket;
    }

    public void setSocket(String socket){this.Socket=socket;}

    public String getSocket(){return Socket;}

    @Override
    public String printDetails() {
        return null;
    }
}
