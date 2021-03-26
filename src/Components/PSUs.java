package Components;

import java.util.ArrayList;
import java.util.List;

public class PSUs implements Component {
    private List<PSU> psus;

    public PSUs() {
        this.psus = new ArrayList<PSU>();
    }

    public void addPSU(PSU psu) {
        psus.add(psu);
    }

    public void removePSU(PSU psu) {
        psus.remove(psu);
    }

    public int getAmmount(){return psus.size();}

    public PSU extractPSU(int x){return psus.get(x);}
    @Override
    public String printDetails() {
        return "";
    }
}