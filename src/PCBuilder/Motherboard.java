package PCBuilder;


public class Motherboard extends Component {

    private String usb;
    private String pciSlot;
    private String ideController;

    public Motherboard(String serial, double height, double width, double length, double price, String usb, String pciSlot, String ideController) {
        super(serial, height, width, length, price);
        this.usb = usb;
        this.pciSlot = pciSlot;
        this.ideController = ideController;
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
}
