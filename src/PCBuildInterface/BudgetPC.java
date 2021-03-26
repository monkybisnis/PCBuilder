package PCBuildInterface;

import Components.*;
import PCBuilder.PC;

public class BudgetPC extends PC implements PC_Build {

    private  Cases Cases= new Cases();
    private  CPUs CPUs= new CPUs();

    private  Motherboards  Motherboards= new Motherboards();
    private  MemoryModules MemoryModules= new MemoryModules();
    private  StorageComponents StorageComponents = new StorageComponents();
    private GPUs Gpus=new GPUs();
    private PSUs PSUs= new PSUs();

    public BudgetPC(Components components){
        for(Component component  : components.components){
            if(component instanceof Cases){
                Cases=(Cases)component;
            }
            if(component instanceof CPUs){
                CPUs=(CPUs) component;
            }
            if(component instanceof GPUs){
                Gpus=(GPUs) component;
            }
            if(component instanceof StorageComponents){
                StorageComponents=(StorageComponents) component;
            }
            if(component instanceof Motherboards){
                Motherboards=(Motherboards) component;
            }
            if(component instanceof MemoryModules){
                MemoryModules=(MemoryModules) component;
            }
            if(component instanceof PSUs){
                PSUs=(PSUs) component;
            }
        }

       Case selectedCase=addCase(Cases);
       CPU selectedCPU=addCPU(CPUs);
      Motherboard  selectedMotherBoard=addMotherBoard(Motherboards,selectedCPU);
       Memory RAM= addRam(MemoryModules);
      Storage  disk=addStorage(StorageComponents);
      PSU  psu=addPSU(PSUs);

        setaCase(selectedCase);
        setCpu(selectedCPU);
        setMemory(RAM);
        setPsu(psu);
        setStorage(disk);
        setMotherboard(selectedMotherBoard);




    }

    @Override
    public Case addCase(Cases cases) {
        Case selectedCase= cases.extractCase(0);
        int i=0;
        while( i<cases.size()) {
           //  if(i> cases.size()){break;}
           Case comparisonCase= cases.extractCase(i);
           if(selectedCase.getPrice()> comparisonCase.getPrice()){
               selectedCase=comparisonCase;
           }
           i++;
        }
        return selectedCase;
    }

    @Override
    public CPU addCPU(CPUs cpus) {
        CPU selectedCPU= cpus.extractCPU(0);
        int i=1;
        while(i< cpus.getAmmount()){
            CPU comparisonCPU= cpus.extractCPU(i);

            if(selectedCPU.getPrice()> comparisonCPU.getPrice()){
                selectedCPU=comparisonCPU;
            }
            i++;
        }
        return selectedCPU;
    }

    @Override
    public GPU addGPU(GPUs gpus) {
        return null;
    }

    public Memory addRam(MemoryModules memories) {
        Memory selectedMemory= memories.extractMemory(0);
        int i=1;
        while( i< memories.getAmmount()) {

            Memory comparisonMemory= memories.extractMemory(i);
            if(selectedMemory.getPrice()> comparisonMemory.getPrice()){
                selectedMemory=comparisonMemory;
            }
            i++;
        }
        return selectedMemory;
    }


    @Override
    public Storage addStorage(StorageComponents disks) {
        Storage selectedStorage= disks.extractStorage(0);
        int i=1;
        while( i< disks.getAmmount()) {

            Storage comparisonStorage= disks.extractStorage(i);
            if(selectedStorage.getPrice()> comparisonStorage.getPrice()){
                selectedStorage=comparisonStorage;
            }
            i++;
        }
        return selectedStorage;
    }

    @Override
    public PSU addPSU(PSUs psUs) {
       PSU selectedPSU= psUs.extractPSU(0);
        int i=1;
        while( i< psUs.getAmmount()) {

            PSU comparisonPSU= psUs.extractPSU(i);
            if(selectedPSU.getPrice()> comparisonPSU.getPrice()){
                selectedPSU=comparisonPSU;
            }
            i++;
        }
        return selectedPSU;
    }

    @Override
    public Motherboard addMotherBoard(Motherboards motherboards, CPU cpu) {
        Motherboards filteredMotherboards = new Motherboards();
        int i = 0;
        while( i < motherboards.getAmmount()) {
            if (motherboards.extrractMotherboard(i).getSocket().equals(cpu.getSocket())) {
                filteredMotherboards.addMotherboard(motherboards.extrractMotherboard(i));
            }
             i++;
        }
        int j = 0;


        Motherboard selectedMotherboard = filteredMotherboards.extrractMotherboard(0);
        while (j < filteredMotherboards.getAmmount()) {
            Motherboard comparisonMotherboard = filteredMotherboards.extrractMotherboard(j);
            if (selectedMotherboard.getPrice() > comparisonMotherboard.getPrice()) {
                selectedMotherboard = comparisonMotherboard;
            }
            j++;
        }
        return selectedMotherboard;
    }
}
