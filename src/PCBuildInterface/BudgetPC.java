package PCBuildInterface;

import Components.*;
import Components.Component.*;
import PCBuilder.PC;

public class BudgetPC extends PC implements PC_Build {


    public BudgetPC(Components components){



    }

    @Override
    public Case addCase(Cases cases) {
        Case selectedCase= cases.extractCase(0);
        for(int i=1; i<= cases.size();i++) {

           Case comparisonCase= cases.extractCase(i);
           if(selectedCase.getPrice()> comparisonCase.getPrice()){
               selectedCase=comparisonCase;
           }
        }
        return selectedCase;
    }

    @Override
    public CPU addCPU(CPUs cpus) {
        CPU selectedCPU= cpus.extractCPU(0);
        for(int i=1;i<= cpus.getAmmount();i++){
            CPU comparisonCPU= cpus.extractCPU(i);

            if(selectedCPU.getPrice()> comparisonCPU.getPrice()){
                selectedCPU=comparisonCPU;
            }
        }
        return selectedCPU;
    }

    @Override
    public GPU addGPU(GPUs gpus) {
        return null;
    }

    public Memory addRam(MemoryModules memories) {
        Memory selectedMemory= memories.extractMemory(0);
        for(int i=1; i<= memories.getAmmount();i++) {

            Memory comparisonMemory= memories.extractMemory(i);
            if(selectedMemory.getPrice()> comparisonMemory.getPrice()){
                selectedMemory=comparisonMemory;
            }
        }
        return selectedMemory;
    }


    @Override
    public Storage addStorage(StorageComponents disks) {
        Storage selectedStorage= disks.extractStorage(0);
        for(int i=1; i<= disks.getAmmount();i++) {

            Storage comparisonStorage= disks.extractStorage(i);
            if(selectedStorage.getPrice()> comparisonStorage.getPrice()){
                selectedStorage=comparisonStorage;
            }
        }
        return selectedStorage;
    }

    @Override
    public PSU addPSU(PSUs psUs) {
       PSU selectedPSU= psUs.extractPSU(0);
        for(int i=1; i<= psUs.getAmmount();i++) {

            PSU comparisonPSU= psUs.extractPSU(i);
            if(selectedPSU.getPrice()> comparisonPSU.getPrice()){
                selectedPSU=comparisonPSU;
            }
        }
        return selectedPSU;
    }

    @Override
    public Motherboard addMotherBoard(Motherboards motherboards, CPU cpu) {
        Motherboards filteredMotherboards = new Motherboards();
        for (int i = 0; i <= motherboards.getAmmount(); i++) {
            if (motherboards.extrractMotherboard(i).getSocket() == cpu.getSocket()) {
                filteredMotherboards.addMotherboard(motherboards.extrractMotherboard(i));
            }
        }
        Motherboard selectedMotherboard = filteredMotherboards.extrractMotherboard(0);
        for (int i = 1; i <= filteredMotherboards.getAmmount(); i++) {
            Motherboard comparisonMotherboard = filteredMotherboards.extrractMotherboard(i);
            if (selectedMotherboard.getPrice() > comparisonMotherboard.getPrice()) {
                selectedMotherboard = comparisonMotherboard;
            }
        }
        return selectedMotherboard;
    }
}
