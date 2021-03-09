package PCBuildInterface;

import PCBuilder.*;

public class BudgetPC implements PC_Build {

    @Override
    public Case addCase() {
        return null;
    }

    @Override
    public CPU addCPU() {
        return null;
    }

    @Override
    public GPU addGPU() {
        return null;
    }

    @Override
    public Memory addRam() {
        return null;
    }

    @Override
    public Storage addStorage() {
        return null;
    }

    @Override
    public PSU addPSU() {
        return null;
    }

    @Override
    public Motherboard addMotherBoard() {
        return null;
    }

    public double totalDiscount(double cost){
        return 0;
    }

}
