package PCBuilder;

public class PC {

    private CPU cpu;
    private GPU gpu;
    private Motherboard motherboard;
    private Memory memory;
    private Cooling cooling;
    private PSU psu;
    private Storage storage;
    private Case aCase;

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public GPU getGpu() {
        return gpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Cooling getCooling() {
        return cooling;
    }

    public void setCooling(Cooling cooling) {
        this.cooling = cooling;
    }

    public PSU getPsu() {
        return psu;
    }

    public void setPsu(PSU psu) {
        this.psu = psu;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Case getaCase() {
        return aCase;
    }

    public void setaCase(Case aCase) {
        this.aCase = aCase;
    }

    public PC(CPU cpu, GPU gpu, Motherboard motherboard, Memory memory, Cooling cooling, PSU psu, Storage storage, Case aCase){
        this.cpu = cpu;
        this.gpu = gpu;
        this.motherboard = motherboard;
        this.memory = memory;
        this.cooling = cooling;
        this.psu = psu;
        this.storage = storage;
        this.aCase = aCase;
    }

    public PC getPC(PC pc){
        return pc;
    }

}
