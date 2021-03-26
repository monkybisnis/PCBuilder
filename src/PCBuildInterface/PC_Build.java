package PCBuildInterface;

import Components.*;
import Components.Part.*;
public interface PC_Build {
    public Case addCase(Cases cases);
    public CPU addCPU(CPUs cpus);
    public GPU addGPU(GPUs gpus);
    public Memory addRam(MemoryModules memories);
    public Storage addStorage(StorageComponents disks);
    public PSU addPSU(PSUs psUs);
    public Motherboard addMotherBoard(Motherboards motherboards, CPU cpu);




}
