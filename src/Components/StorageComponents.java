package Components;

import Components.Part.Storage;

import java.util.ArrayList;
import java.util.List;

public class StorageComponents implements Component {
    private List<Storage> StorageComponents;

    public StorageComponents() {
        this.StorageComponents = new ArrayList<Storage>();
    }

    @Override
    public void add(Component c) {
        StorageComponents.add((Storage)c);
    }

    @Override
    public void remove(Component c) {
        StorageComponents.remove((Storage)c);
    }

    @Override
    public int size() {
        return StorageComponents.size();
    }

    @Override
    public Component extract(int x){
        return (Component)StorageComponents.get(x);
    }
    @Override
    public String printDetails() {
        return "";
    }
}