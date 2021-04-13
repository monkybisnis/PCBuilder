package PCBuildInterface;

import Components.*;
import Components.Part.CPU;
import Components.Part.Case;
import Components.Part.Motherboard;
import Components.Part.PSU;
import PCBuilder.PC;

public class CustomPC extends PC implements PC_Build {
    private  Cases Cases= new Cases();
    private  CPUs CPUs= new CPUs();

    private  Motherboards  Motherboards= new Motherboards();
    private  MemoryModules MemoryModules= new MemoryModules();
    private  StorageComponents StorageComponents = new StorageComponents();
    private GPUs Gpus=new GPUs();
    private PSUs PSUs= new PSUs();


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

    @Override
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
