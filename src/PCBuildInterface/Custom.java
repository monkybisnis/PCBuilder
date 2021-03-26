package PCBuildInterface;

import Components.*;
import Components.Part.*;

public class Custom implements PC_Build {

    @Override
    public Case addCase(Cases cases) {
        return null;
    }

    @Override
    public CPU addCPU(CPUs cpus) {
        return null;
    }

    @Override
    public GPUs addGPUs(GPUs gpus) {
        return null;
    }

    public MemoryModules addRam(MemoryModules memories) {
        return null;
    }

    @Override
    public StorageComponents addStorage(StorageComponents disks) {
        return null;
    }

    @Override
    public PSU addPSU(PSUs psUs) {
        return null;
    }

    @Override
    public Motherboard addMotherBoard(Motherboards motherboards, CPU cpu) {
        return null;
    }
}
