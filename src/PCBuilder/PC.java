package PCBuilder;

import Components.Component.*;
import Components.GPUs;
import Components.MemoryModules;
import Components.Part.*;
import Components.StorageComponents;

public  abstract class PC   {
    private CPU cpu;
    private GPUs gpu;
    private Motherboard motherboard;
    private MemoryModules memory;
    private PSU psu;
    private StorageComponents storage;
    private Case aCase;

    public PC(CPU cpu, GPUs gpu, Motherboard motherboard, MemoryModules memory, PSU psu, StorageComponents storage, Case aCase){
        this.cpu = cpu;
        this.gpu = gpu;
        this.motherboard = motherboard;
        this.memory = memory;
        this.psu = psu;
        this.storage = storage;
        this.aCase = aCase;
    }

    public double getTotalCost(){
        return 0;

    }

    public Case getaCase() {
        return aCase;
    }

    public CPU getCpu() {
        return cpu;
    }

    public GPUs getGpus() {
        return gpu;
    }

    public MemoryModules getMemories() {
        return memory;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public PSU getPsu() {
        return psu;
    }

    public void setaCase(Case aCase) {
        this.aCase = aCase;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setGpus(GPUs gpu) {
        this.gpu = gpu;
    }

    public StorageComponents getStorage() {
        return storage;
    }

    public void setMemory(MemoryModules memory) {
        this.memory = memory;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public void setPsu(PSU psu) {
        this.psu = psu;
    }

    public void setStorage(StorageComponents storage) {
        this.storage = storage;
    }



    public  PC(){}

    public double getPowerConsumption(){

        if(gpu!= null){return cpu.getWattage()+gpu.getWattage()+ motherboard.getWattage()+ cpu.getWattage()+ aCase.getWattage()+storage.getWattage()+ memory.getWattage();
    }

        else{return cpu.getWattage()+ motherboard.getWattage()+ cpu.getWattage()+ aCase.getWattage()+storage.getWattage()+ memory.getWattage();}
}

    public double getTotalPrice() {
        double memoryTotal = 0.0;
        double storageTotal = 0.0;
        for (int i = 0; i < storage.size(); i++) {
            Storage s = (Storage)storage.extract(i);
            storageTotal += s.getPrice();
        }
        for (int i = 0; i < memory.size(); i++) {
            Memory m = (Memory)memory.extract(i);
            memoryTotal += m.getPrice();
        }
        if (gpu!= null) {
            double gpuTotal = 0.0;
            for (int i = 0; i < gpu.size(); i++) {
                GPU g = (GPU)gpu.extract(i);
                gpuTotal += g.getPrice();
            }
            return cpu.getPrice() + gpuTotal + motherboard.getPrice() + cpu.getPrice() + aCase.getPrice()+storageTotal + memoryTotal;
        } else {
            return cpu.getPrice() + motherboard.getPrice() + cpu.getPrice() + aCase.getPrice() + storageTotal + memoryTotal;
        }
    }
}
