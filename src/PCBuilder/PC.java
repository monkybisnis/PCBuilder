package PCBuilder;

import Components.Component.*;

public class PC   {
    private CPU cpu;
    private GPU gpu;
    private Motherboard motherboard;
    private Memory memory;
    private Cooler cooling;
    private PSU psu;
    private Storage storage;
    private Case aCase;

    public PC(CPU cpu, GPU gpu, Motherboard motherboard, Memory memory, Cooler cooling, PSU psu, Storage storage, Case aCase){
        this.cpu = cpu;
        this.gpu = gpu;
        this.motherboard = motherboard;
        this.memory = memory;
        this.cooling = cooling;
        this.psu = psu;
        this.storage = storage;
        this.aCase = aCase;
    }

    public double getTotalCost(){
        return 0;

    }

    public double getPowerConsumption(){
        return 0;
    }
}
