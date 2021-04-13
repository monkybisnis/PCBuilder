package Components;

import Components.Part.Memory;
import Components.Part.Storage;

import java.util.ArrayList;
import java.util.List;

public class MemoryModules implements Component {
    private List<Memory> memoryModules;

    public MemoryModules() {
        this.memoryModules = new ArrayList<>();
    }

    @Override
    public void add(Object c) {
        memoryModules.add((Memory)c);
    }

    @Override
    public void remove(Object c) {
        memoryModules.remove(c);
    }

    @Override
    public int size() {
        return memoryModules.size();
    }

    @Override
    public Memory extract(int x) {
        return memoryModules.get(x);
    }

    @Override
    public String printDetails() {
        return "";
    }
    public int getWattage()
    {

        int total=0;
        for (Memory x:memoryModules)
        {
            total+= x.getWattage();
        }
        return  total;
    }
}
