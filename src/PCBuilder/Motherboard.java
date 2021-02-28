package PCBuilder;


public class Motherboard extends Component {

    private String usb;
    private String pciSlot;
    private String ideController;
    private String Socket;


    public Motherboard(String serial, String type,String brand,String Socket, double price,double Wattage, String usb, String pciSlot, String ideController) {
        super(serial,type,brand ,price,Wattage);

        this.Socket=Socket;
    }

    public String getUsb() {
        return usb;
    }

    public void setUsb(String usb) {
        this.usb = usb;
    }

    public String getPciSlot() {
        return pciSlot;
    }

    public void setPciSlot(String pciSlot) {
        this.pciSlot = pciSlot;
    }

    public String getIdeController() {
        return ideController;
    }

    public void setIdeController(String ideController) {
        this.ideController = ideController;
    }

    public void setSocket(String socket){ this.Socket=socket;}
    public String getSocket(){return Socket;}
}
