package PCBuilder;

public class Storage extends Component{

    //data fields
    private int storageSize;

    public Storage(String serial,String type,String Brand,double price,double Wattage,int storageSize) {
        super(serial,type,Brand,price,Wattage);
        this.storageSize=storageSize;
    }

    public int getStorageSize(){
        return storageSize;
    }

}