package PCBuildInterface;

import PCBuilder.*;
import Components.Component.*;
public interface PC_Build {
    public Case addCase();
    public CPU addCPU();
    public GPU addGPU();
    public Memory addRam();
    public Storage addStorage();
    public PSU addPSU();
    public Motherboard addMotherBoard();


}
