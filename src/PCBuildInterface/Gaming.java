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
        setIcon("Case.png");
        double x= TotalPrice();
        System.out.println(x);
        setPrice(x);


    }
    @Override
    public Case addCase(Cases cases) {
        Case selectedCase= cases.extract(0);
        int i=0;
        while( i<cases.size()) {
            //  if(i> cases.size()){break;}
            Case comparisonCase= cases.extract(i);
            if(selectedCase.getPrice()< comparisonCase.getPrice()){
                selectedCase=comparisonCase;
            }
            i++;
        }
        return selectedCase;
    }

    @Override
    public CPU addCPU(CPUs cpus) {
        CPU selectedCPU= (CPU) cpus.extract(0);
        int i=1;
        while(i< cpus.size()){
            CPU comparisonCPU= (CPU) cpus.extract(i);

            if(selectedCPU.getClockSpeed()< comparisonCPU.getClockSpeed()){
                selectedCPU=comparisonCPU;
            }
            i++;
        }
        return selectedCPU;
    }

    @Override
    public GPUs addGPUs(GPUs gpus) {
        GPUs chosengpus=new GPUs();
        GPU selectedGPU= gpus.extract(0);
        int i=1;
        while( i< gpus.size()) {

            GPU comparisonGPU= gpus.extract(i);
            if(selectedGPU.getClockSpeed()< comparisonGPU.getClockSpeed()){
                selectedGPU=comparisonGPU;
            }
            i++;
        }


        chosengpus.add(selectedGPU);
        return chosengpus;
    }

    public MemoryModules addRam(MemoryModules memories) {
        Memory selectedMemory= memories.extract(0);
        int i=1;
        while( i< memories.size()) {

            Memory comparisonMemory= memories.extract(i);
            if(selectedMemory.getSize()< comparisonMemory.getSize()){
                selectedMemory=comparisonMemory;
            }
            i++;
        }

        MemoryModules chosenmemories=new MemoryModules();
        chosenmemories.add(selectedMemory );
        chosenmemories.add(selectedMemory );
        return chosenmemories;
    }


    @Override
    public StorageComponents addStorage(StorageComponents disks) {
        Storage selectedStorage= disks.extract(0);
        int i=1;
        while( i< disks.size()) {

            Storage comparisonStorage= disks.extract(i);
            if(selectedStorage.getStorageSize()< comparisonStorage.getStorageSize()){
                selectedStorage=comparisonStorage;
            }
            i++;
        }
        StorageComponents chosenStorgage=new StorageComponents();
        chosenStorgage.add(selectedStorage);
        return chosenStorgage;
    }

    @Override
    public PSU addPSU(PSUs psUs) {
        PSU selectedPSU= psUs.extract(0);
        int i=1;
        while( i< psUs.size()) {

            PSU comparisonPSU= psUs.extract(i);
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
        while( i < motherboards.size()) {
            Motherboard temp = motherboards.extract(i);
            if (temp.getSocket().equals(cpu.getSocket())) {
                filteredMotherboards.add(temp);
            }
            i++;
        }
        int j = 0;

        System.out.println(filteredMotherboards.size());
        Motherboard selectedMotherboard = filteredMotherboards.extract(0);
        while (j < filteredMotherboards.size()) {
            Motherboard comparisonMotherboard = filteredMotherboards.extract(j);
            if (selectedMotherboard.getPrice() < comparisonMotherboard.getPrice()) {
                selectedMotherboard = comparisonMotherboard;
            }
            j++;
        }
        return selectedMotherboard;
    }


}