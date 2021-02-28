package PCBuildInterface;

import PCBuilder.*;

public interface PC_BUild {
    public Case getCase();
    public CPU getCPU();
    public GPU getGPU();
    public Memory getRAM();
    public Storage getStorage();
    public PSU getPSU();
    public Motherboard getMotherboard();


}
