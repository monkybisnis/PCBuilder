package PCBuildInterface;

import Components.*;
import Components.Part.*;
import PCBuilder.*;

public class Gaming extends  PC implements PC_Build {

    private  Cases Cases= new Cases();
    private  CPUs CPUs= new CPUs();

    private  Motherboards  Motherboards= new Motherboards();
    private  MemoryModules MemoryModules= new MemoryModules();
    private  StorageComponents StorageComponents = new StorageComponents();
    private GPUs Gpus=new GPUs();
    private PSUs PSUs= new PSUs();
    public Gaming(Components components){


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
        System.out.println(Cases.size());
        Case selectedCase=addCase(Cases);
        CPU selectedCPU=addCPU(CPUs);
        Motherboard  selectedMotherBoard=addMotherBoard(Motherboards,selectedCPU);
        MemoryModules RAM= addRam(MemoryModules);
        StorageComponents  disk=addStorage(StorageComponents);
        PSU  psu=addPSU(PSUs);
        GPUs gpu= addGPUs(Gpus);
        setaCase(selectedCase);
        setCpu(selectedCPU);
        setMemory(RAM);
        setPsu(psu);
        setStorage(disk);
        setMotherboard(selectedMotherBoard);
        setGpus(gpu);



    }
    @Override
    public Case addCase(Cases cases) {
        Case selectedCase= cases.extractCase(0);
        int i=0;
        while( i<cases.size()) {
            //  if(i> cases.size()){break;}
            Case comparisonCase= cases.extractCase(i);
            if(selectedCase.getPrice()< comparisonCase.getPrice()){
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

            if(selectedCPU.getClockSpeed()< comparisonCPU.getClockSpeed()){
                selectedCPU=comparisonCPU;
            }
            i++;
        }
        return selectedCPU;
    }

    @Override
    public GPUs addGPUs(GPUs gpus) {
        GPU selectedGPU=  gpus.extractGPu(0);
        int i=1;
        while( i< gpus.getAmmount()) {

            GPU comparisonGPU= gpus.extractGPu(i);
            if(selectedGPU.getClockSpeed()< comparisonGPU.getClockSpeed()){
                selectedGPU=comparisonGPU;
            }
            i++;
        }


        return selectedGPU;
    }

    public MemoryModules addRam(MemoryModules memories) {
        Memory selectedMemory= memories.extractMemory(0);
        int i=1;
        while( i< memories.getAmmount()) {

            Memory comparisonMemory= memories.extractMemory(i);
            if(selectedMemory.getSpeed()< comparisonMemory.getSpeed()){
                selectedMemory=comparisonMemory;
            }
            i++;
        }
        return selectedMemory;
    }


    @Override
    public StorageComponents addStorage(StorageComponents disks) {
        Storage selectedStorage= disks.extractStorage(0);
        int i=1;
        while( i< disks.getAmmount()) {

            Storage comparisonStorage= disks.extractStorage(i);
            if(selectedStorage.getStorageSize()< comparisonStorage.getStorageSize()){
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
            if(selectedPSU.getWattage()< comparisonPSU.getWattage()){
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

        System.out.println(filteredMotherboards.getAmmount());
        Motherboard selectedMotherboard = filteredMotherboards.extrractMotherboard(0);
        while (j < filteredMotherboards.getAmmount()) {
            Motherboard comparisonMotherboard = filteredMotherboards.extrractMotherboard(j);
            if (selectedMotherboard.getPrice() < comparisonMotherboard.getPrice()) {
                selectedMotherboard = comparisonMotherboard;
            }
            j++;
        }
        return selectedMotherboard;
    }


}