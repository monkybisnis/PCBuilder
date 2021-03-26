package PCBuildInterface;

import Components.*;
import Components.Part.*;
public interface PC_Build {
    public Case addCase(Cases cases);
    public CPU addCPU(CPUs cpus);
    public GPUs addGPUs(GPUs gpus);
    public MemoryModules addRam(MemoryModules memories);
    public StorageComponents addStorage(StorageComponents disks);
    public PSU addPSU(PSUs psUs);
    public Motherboard addMotherBoard(Motherboards motherboards, CPU cpu);




}
