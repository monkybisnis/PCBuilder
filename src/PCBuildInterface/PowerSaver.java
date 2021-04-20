package PCBuildInterface;

import Components.*;
import Components.Part.*;
import PCBuilder.*;
import loginService.LoginService;


public class PowerSaver extends PC implements PC_Build {


    private  Cases Cases= new Cases();
    private  CPUs CPUs= new CPUs();


    private  Motherboards  Motherboards= new Motherboards();
    private  MemoryModules MemoryModules= new MemoryModules();
    private  StorageComponents StorageComponents = new StorageComponents();
    private GPUs Gpus=new GPUs();
    private PSUs PSUs= new PSUs();

    public PowerSaver(Components components){
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
      Motherboard selectedMotherBoard=addMotherBoard(Motherboards,selectedCPU);
        MemoryModules RAM= addRam(MemoryModules);
       StorageComponents disk=addStorage(StorageComponents);
       PSU psu=addPSU(PSUs);


        setaCase(selectedCase);
        setCpu(selectedCPU);
        setMemory(RAM);
        setPsu(psu);
        setStorage(disk);
        setMotherboard(selectedMotherBoard);
        setIcon("Case.png");
        double x= TotalPrice();
        System.out.println(x);
        setPrice(x);



    }
    @Override
    public Case addCase(Cases cases) {
        Case selectedCase = cases.extract(0);
        int i=0;
        while( i<cases.size()) {
            //  if(i> cases.size()){break;}
            Case comparisonCase= cases.extract(i);
            if(selectedCase.getWattage()> comparisonCase.getWattage()){
                selectedCase=comparisonCase;
            }
            i++;
        }

        return selectedCase;
    }

    @Override
    public CPU addCPU(CPUs cpus) {
        CPU selectedCPU= (CPU)cpus.extract(0);
        int i=1;
        while(i< cpus.size()){
            CPU comparisonCPU= (CPU)cpus.extract(i);

            if(selectedCPU.getWattage()> comparisonCPU.getWattage()){
                selectedCPU=comparisonCPU;
            }
            i++;
        }
        return selectedCPU;
    }

    @Override
    public GPUs addGPUs(GPUs gpus) {
        return null;
    }

    @Override
    public MemoryModules addRam(MemoryModules memories) {
        Memory selectedMemory= memories.extract(0);
        int i=1;
        while( i< memories.size()) {

            Memory comparisonMemory= memories.extract(i);
            if(selectedMemory.getWattage() > comparisonMemory.getWattage()){
                selectedMemory=comparisonMemory;
            }
            i++;
        }
        MemoryModules selectedMemories= new MemoryModules();
        selectedMemories.add(selectedMemory);
        return selectedMemories;
    }


    @Override
    public StorageComponents addStorage(StorageComponents disks) {
        Storage selectedStorage= disks.extract(0);
        int i=1;
        while( i< disks.size()) {

            Storage comparisonStorage= disks.extract(i);
            if(selectedStorage.getWattage()> comparisonStorage.getWattage()){
                selectedStorage=comparisonStorage;
            }
            i++;
        }
        StorageComponents selectedComponents = new StorageComponents();
        selectedComponents.add(selectedStorage);
        return selectedComponents;
    }

    @Override
    public PSU addPSU(PSUs psUs) {
        PSU selectedPSU= psUs.extract(0);
        int i=1;
        while( i< psUs.size()) {

            PSU comparisonPSU= psUs.extract(i);
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
        while( i < motherboards.size()) {
            Motherboard m = motherboards.extract(i);
            if (m.getSocket().equals(cpu.getSocket())) {
                filteredMotherboards.add(motherboards.extract(i));
            }
            i++;
        }
        int j = 0;

        System.out.println(filteredMotherboards.size());
        Motherboard selectedMotherboard = filteredMotherboards.extract(0);
        while (j < filteredMotherboards.size()) {
            Motherboard comparisonMotherboard = filteredMotherboards.extract(j);
            if (selectedMotherboard.getWattage() > comparisonMotherboard.getWattage()) {
                selectedMotherboard = comparisonMotherboard;
            }
            j++;
        }
        return selectedMotherboard;
    }
}
