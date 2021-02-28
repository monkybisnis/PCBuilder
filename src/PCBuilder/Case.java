package PCBuilder;

public class Case  extends  Component{

    private String style;
    private int nrOfFans;

    public Case(String serialNumber, String Type,String Brand, double price,String style,double Wattage,int nrOfFans){
        super(serialNumber,Type,Brand,price,Wattage);
        this.style=style;
        this.nrOfFans=nrOfFans;
    }



    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
