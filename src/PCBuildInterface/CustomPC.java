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

        for(int i=1 ;i< cpus.size(); i++){
            CPU comparisonCPU= cpus.extract(i);

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
        GPUs chosenGpuS=new GPUs();
        GPU selectedGPU = gpus.extract(0);

        for(int i=1 ;i< gpus.size(); i++){
            GPU comparisonGPU= gpus.extract(i);

            if(selectedGPU.getClockSpeed() < comparisonGPU.getClockSpeed()){
                selectedGPU=comparisonGPU;
                chosenGpuS.add(selectedGPU);
            }
        }
        return chosenGpuS;
    }

    // TODO: progress from this line

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
