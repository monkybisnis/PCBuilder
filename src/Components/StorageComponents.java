package Components;

import Components.Component.*;

import java.util.ArrayList;
import java.util.List;

public class StorageComponents implements Part {
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

    @Override
    public String printDetails() {
        return "";
    }
}