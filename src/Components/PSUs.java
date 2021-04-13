package Components;

import Components.Part.PSU;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PSUs implements Component, Serializable {
    private List<PSU> psus;

    public PSUs() {
        this.psus = new ArrayList<>();
    }

    @Override
    public void add(Object c) {
        psus.add((PSU)c);
    }

    @Override
    public void remove(Object c) {
        psus.remove(c);
    }

    @Override
    public int size() {
        return psus.size();
    }

    @Override
    public PSU extract(int x) {
        return psus.get(x);
    }

    @Override
    public String printDetails() {
        return "";
    }
}