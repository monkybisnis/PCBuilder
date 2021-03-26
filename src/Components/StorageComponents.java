package Components;

import java.util.ArrayList;
import java.util.List;

public class StorageComponents implements Component {
    private List<Storage> StorageComponents;

    public StorageComponents() {
        this.StorageComponents = new ArrayList<Storage>();
    }

    public void addStorage(Storage storageComponent) {
        StorageComponents.add(storageComponent);
    }

    public void removeStorage(Storage storageComponent) {
        StorageComponents.remove(storageComponent);
    }
    public int getAmmount(){return StorageComponents.size(); }

    public Storage extractStorage(int x){ return StorageComponents.get(x);
    }
    @Override
    public String printDetails() {
        return "";
    }
}