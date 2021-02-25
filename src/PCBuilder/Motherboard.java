package PCBuilder;


public class Motherboard {

    private String usb;
    private String pciSlot;
    private String ideController;

    public Motherboard(){
    }

    public Motherboard(String usb, String pciSlot, String ideController) {

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
