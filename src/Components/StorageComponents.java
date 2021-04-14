package Components;

import Components.Part.Storage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StorageComponents implements Component, Serializable {
    private List<Storage> StorageComponents;

    public StorageComponents() {
        this.StorageComponents = new ArrayList<>();
    }

    @Override
    public void add(Object c) {
        StorageComponents.add((Storage)c);
    }

    @Override
    public void remove(Object c) {
        StorageComponents.remove(c);
    }

    @Override
    public int size() {
        return StorageComponents.size();
    }

    @Override
    public Storage extract(int x) {
        return StorageComponents.get(x);
    }
    @Override
    public String printDetails() {
        return "";
    }

    public int getWattage()
    {

        int total=0;
        for (Storage x:StorageComponents)
        {
            total+= x.getWattage();
        }
        return  total;
    }
}