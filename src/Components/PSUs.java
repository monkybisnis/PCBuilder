package Components;

import Components.Component.*;

import java.util.ArrayList;
import java.util.List;

public class PSUs implements Part {
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

    @Override
    public String printDetails() {
        return "";
    }
}