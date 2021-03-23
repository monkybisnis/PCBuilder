package PCBuilder;

import Components.Component.*;

public  abstract class PC   {
    private CPU cpu;
    private GPU gpu;
    private Motherboard motherboard;
    private Memory memory;
    private PSU psu;
    private Storage storage;
    private Case aCase;

    public PC(CPU cpu, GPU gpu, Motherboard motherboard, Memory memory, PSU psu, Storage storage, Case aCase){
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

    public GPU getGpu() {
        return gpu;
    }

    public Memory getMemory() {
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

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public void setPsu(PSU psu) {
        this.psu = psu;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }



    public  PC(){}

    public double getPowerConsumption(){

        if(gpu!= null){return cpu.getWattage()+gpu.getWattage()+ motherboard.getWattage()+ cpu.getWattage()+ aCase.getWattage()+storage.getWattage()+ memory.getWattage();
    }

        else{return cpu.getWattage()+ motherboard.getWattage()+ cpu.getWattage()+ aCase.getWattage()+storage.getWattage()+ memory.getWattage();}
}

    public double getTotalPrice(){

        if(gpu!= null){return cpu.getPrice()+gpu.getPrice()+ motherboard.getPrice()+ cpu.getPrice()+ aCase.getPrice()+storage.getPrice()+ memory.getPrice();
        }

        else{return cpu.getPrice()+ motherboard.getPrice()+ cpu.getPrice()+ aCase.getPrice()+storage.getPrice()+ memory.getPrice();}
    }
}
