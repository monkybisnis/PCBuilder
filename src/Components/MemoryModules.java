package Components;

import Components.Part.Memory;
import Components.Part.Storage;

import java.util.ArrayList;
import java.util.List;

public class MemoryModules implements Component {
    private List<Memory> memoryModules;

    public MemoryModules() {
        this.memoryModules = new ArrayList<Memory>();
    }

    @Override
    public void add(Component c) {
        memoryModules.add((Memory)c);
    }

    @Override
    public void remove(Component c) {
        memoryModules.remove((Memory)c);
    }

    @Override
    public int size() {
        return memoryModules.size();
    }

    @Override
    public Component extract(int x) {
        return (Component)memoryModules.get(x);
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
