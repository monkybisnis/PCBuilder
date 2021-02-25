package PCBuilder;

public class Storage extends Component{

    //data fields
    private int storageSize;

    public Storage(){

    }

    public Storage(int storageSize){
        this.storageSize = storageSize;
    }

    public int getStorageSize(){
        return storageSize;
    }

}