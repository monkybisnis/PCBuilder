package PCBuildInterface;

import Components.*;
import Components.Part.*;
import PCBuilder.PC;

public class CustomPC extends PC implements PC_Build {
    private  Cases cases = new Cases();
    private  CPUs cpuS = new CPUs();

    private  Motherboards motherboards = new Motherboards();
    private  MemoryModules memoryModules = new MemoryModules();
    private  StorageComponents storageComponents = new StorageComponents();
    private GPUs gpus =new GPUs();
    private PSUs psuS = new PSUs();


    /**
     * @param components main holder of whole PC object
     *
     * Constructor for Custom PC
     */
    public CustomPC(Components components){

        for(Component component  : components.components){
            if(component instanceof Cases){
                this.cases = (Cases)component;
            }
            if(component instanceof CPUs){
                this.cpuS = (CPUs) component;
            }
            if(component instanceof GPUs){
                this.gpus = (GPUs) component;
            }
            if(component instanceof StorageComponents){
                this.storageComponents = (StorageComponents) component;
            }
            if(component instanceof Motherboards){
                this.motherboards = (Motherboards) component;
            }
            if(component instanceof MemoryModules){
                this.memoryModules = (MemoryModules) component;
            }
            if(component instanceof PSUs){
                this.psuS = (PSUs) component;
            }
        }

        Case selectedCase               = addCase(cases);
        CPU selectedCPU                 = addCPU(cpuS);
        Motherboard selectedMotherBoard = addMotherBoard(motherboards,selectedCPU);
        MemoryModules ramModule         = addRam(memoryModules);
        StorageComponents disks         = addStorage(storageComponents);
        PSU psu                         = addPSU(psuS);

        setaCase(selectedCase);
        setCpu(selectedCPU);
        setMemory(ramModule);
        setPsu(psu);
        setStorage(disks);
        setMotherboard(selectedMotherBoard);
    }

    /**
     * @param cases
     * @return
     */
    @Override
    public Case addCase(Cases cases) {
        Case selectedCase = cases.extract(0);

        for(int i = 0; i < cases.size(); i++){
            Case comparisonCase = cases.extract(i);
            if(selectedCase.getPrice() > comparisonCase.getPrice()) {
                selectedCase = comparisonCase;
            }
        }
        return selectedCase;
    }

    /**
     * @param cpus
     * @return
     */
    @Override
    public CPU addCPU(CPUs cpus) {
        CPU selectedCPU = cpus.extract(0);

        for(int i =1; i< cpus.size(); i++){
            CPU comparisonCPU = cpus.extract(i);

            if(selectedCPU.getPrice()> comparisonCPU.getPrice()){
                selectedCPU = comparisonCPU;
            }
        }
        return selectedCPU;
    }

    /**
     * @param gpus
     * @return
     */
    @Override
    public GPUs addGPUs(GPUs gpus) {
        GPUs chosenGpuS = new GPUs();
        GPU selectedGPU = gpus.extract(0);

        for(int i =1; i < gpus.size(); i++){
            GPU comparisonGPU = gpus.extract(i);

            if(selectedGPU.getClockSpeed() < comparisonGPU.getClockSpeed()){
                selectedGPU = comparisonGPU;
                chosenGpuS.add(selectedGPU);
            }
        }
        return chosenGpuS;
    }


    /**
     * @param memories
     * @return
     */
    @Override
    public MemoryModules addRam(MemoryModules memories) {

        Memory selectedMemory = memories.extract(0);
        MemoryModules chosenMemories = new MemoryModules();
        for(int i =1; i < memories.size(); i++) {
            Memory comparisonMemory = memories.extract(i);
            if(selectedMemory.getSize() < comparisonMemory.getSize()){
                selectedMemory = comparisonMemory;
                chosenMemories.add(selectedMemory);
            }
        }
        return chosenMemories;
    }

    /**
     * @param disks
     * @return
     */
    @Override
    public StorageComponents addStorage(StorageComponents disks) {

        Storage selectedStorage = disks.extract(0);
        StorageComponents chosenStorage=new StorageComponents();
        for (int i =1; i < disks.size(); i++) {

            Storage comparisonStorage= disks.extract(i);
            if(selectedStorage.getStorageSize()< comparisonStorage.getStorageSize()){
                selectedStorage = comparisonStorage;
            }
        }

        chosenStorage.add(selectedStorage);
        return chosenStorage;
    }

    /**
     * @param psuS
     * @return
     */
    @Override
    public PSU addPSU(PSUs psuS) {
        PSU selectedPSU = psuS.extract(0);

        for(int i =1; i < psuS.size(); i++) {

            PSU comparisonPSU = psuS.extract(i);
            if(selectedPSU.getWattage()< comparisonPSU.getWattage()){
                selectedPSU=comparisonPSU;
            }
        }
        return selectedPSU;
    }

    /**
     * @param motherboards
     * @param cpu
     * @return
     */
    @Override
    public Motherboard addMotherBoard(Motherboards motherboards, CPU cpu) {
        Motherboards filteredMotherboards = new Motherboards();

        for(int i = 0; i < motherboards.size(); i++) {
            Motherboard temp = motherboards.extract(i);
            if (temp.getSocket().equals(cpu.getSocket())) {
                filteredMotherboards.add(temp);
            }
        }

        System.out.println(filteredMotherboards.size());

        Motherboard selectedMotherboard = filteredMotherboards.extract(0);

        for(int j = 0; j < filteredMotherboards.size(); j++) {
            Motherboard comparisonMotherboard = filteredMotherboards.extract(j);
            if (selectedMotherboard.getPrice() < comparisonMotherboard.getPrice()) {
                selectedMotherboard = comparisonMotherboard;
            }
        }
        return selectedMotherboard;
    }
}
