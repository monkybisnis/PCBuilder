package PCBuildInterface;

import Components.*;
import PCBuilder.*;
import Components.Component.*;


public class PowerSaver extends PC implements PC_Build {


    private  Cases Cases= new Cases();
    private  CPUs CPUs= new CPUs();


    private  Motherboards  Motherboards= new Motherboards();
    private  MemoryModules MemoryModules= new MemoryModules();
    private  StorageComponents StorageComponents = new StorageComponents();
    private GPUs Gpus=new GPUs();
    private PSUs PSUs= new PSUs();

    public PowerSaver(Components components){
        for(Part component  : components.components){
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
       Memory RAM= addRam(MemoryModules);
       Storage disk=addStorage(StorageComponents);
       PSU psu=addPSU(PSUs);


        setaCase(selectedCase);
        setCpu(selectedCPU);
        setMemory(RAM);
        setPsu(psu);
        setStorage(disk);
        setMotherboard(selectedMotherBoard);
        ;



    }
    @Override
    public Case addCase(Cases cases) {
        Case selectedCase= cases.extractCase(0);
        int i=0;
        while( i<cases.size()) {
            //  if(i> cases.size()){break;}
            Case comparisonCase= cases.extractCase(i);
            if(selectedCase.getWattage()> comparisonCase.getWattage()){
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

            if(selectedCPU.getWattage()> comparisonCPU.getWattage()){
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
            if(selectedMemory.getWattage()> comparisonMemory.getWattage()){
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
            if(selectedStorage.getWattage()> comparisonStorage.getWattage()){
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
            if(selectedPSU.getWattage()> comparisonPSU.getWattage()){
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
            if (selectedMotherboard.getWattage() > comparisonMotherboard.getWattage()) {
                selectedMotherboard = comparisonMotherboard;
            }
            j++;
        }
        return selectedMotherboard;
    }
}
