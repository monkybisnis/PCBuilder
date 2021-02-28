package PCBuildInterface;

import PCBuilder.*;

public class BudgetPC implements PC_BUild {

    @Override
    public Case getCase() {
        return null;
    }

    @Override
    public CPU getCPU() {
        return null;
    }

    @Override
    public GPU getGPU() {
        return null;
    }

    @Override
    public Memory getRAM() {
        return null;
    }

    @Override
    public Storage getStorage() {
        return null;
    }

    @Override
    public PSU getPSU() {
        return null;
    }

    @Override
    public Motherboard getMotherboard() {
        return null;
    }

    public double totalDiscount(double cost){
        return 0;
    }

}
