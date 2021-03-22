package PCBuildInterface;

import Components.*;
import Components.Component.*;
import PCBuilder.*;

public class MediaDesign implements PC_Build {

    @Override
    public Case addCase(Cases cases) {
        return null;
    }

    @Override
    public CPU addCPU(CPUs cpus) {
        return null;
    }

    @Override
    public GPU addGPU(GPUs gpus) {
        return null;
    }

    public Memory addRam(MemoryModules memories) {
        return null;
    }

    @Override
    public Storage addStorage(StorageComponents disks) {
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
