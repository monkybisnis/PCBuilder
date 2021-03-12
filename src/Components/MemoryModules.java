package Components;

import PCBuilder.Memory;

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

    @Override
    public String printDetails() {
        return "";
    }

}
