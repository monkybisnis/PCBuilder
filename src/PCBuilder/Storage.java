package PCBuilder;

public class Storage extends Component{

    //data fields
    private int storageSize;

    public Storage(String serial, double height, double width, double length, double price) {
        super(serial, height, width, length, price);
    }

    public int getStorageSize(){
        return storageSize;
    }

}