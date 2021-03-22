package Components;

import Components.Component.*;
import java.util.ArrayList;
import java.util.List;

public class MemoryModules implements Part {
    private List<Memory> memoryModules;

    public MemoryModules() {
        this.memoryModules = new ArrayList<Memory>();
    }

    public void addMemory(Memory memoryModule) {
        memoryModules.add(memoryModule);
    }

    public void removeMemory(Memory memoryModule) {
        memoryModules.remove(memoryModule);
    }

    public int getAmmount(){ return  memoryModules.size();}

    public Memory extractMemory(int x){return memoryModules.get(x);}
    @Override
    public String printDetails() {
        return "";
    }

}
