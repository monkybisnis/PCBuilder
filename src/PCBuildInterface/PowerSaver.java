package PCBuildInterface;

import PCBuilder.pc;

public class PowerSaver implements PC_BUild {
    @Override
    public double getCost() {
        return 0;
    }

    @Override
    public double getWattage() {
        return 0;
    }

    @Override
    public pc BUildPC() {
        return null;
    }
}
