package PCBuilder;

import Components.Part;

public class Storage extends Component implements Part{

    //data fields
    private int storageSize;

    public Storage(String serial,String type,String Brand,double price,double Wattage,int storageSize) {
        super(serial,type,price,Wattage,Brand);
        this.storageSize=storageSize;
    }

    public int getStorageSize(){
        return storageSize;
    }

    @Override
    public String printDetails() {
        return null;
    }
}