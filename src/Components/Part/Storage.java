package Components.Part;

public class Storage extends Part {
    //data fields
    private int storageSize;

    public Storage(){}

    public Storage(String serial,String type,String Brand,double price,double Wattage,int storageSize) {
        super(serial,type,price,Wattage,Brand);
        this.storageSize=storageSize;
    }

    public int getStorageSize(){
        return storageSize;
    }

    @Override
    public String toString() {

        return "Storage details:\n Name: "+ serialNumber+ "\n Type : "+ Type +"\n Brand : "+ brand+"\n Power Consumption : "+wattage+
                "\n Size : "+ storageSize+"\n Price : "+ price;
    }
}