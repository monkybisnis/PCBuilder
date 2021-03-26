package Components;

import Components.Part.PSU;

import java.util.ArrayList;
import java.util.List;

public class PSUs implements Component {
    private List<PSU> psus;

    public PSUs() {
        this.psus = new ArrayList<PSU>();
    }

    @Override
    public void add(Component c) {
        psus.add((PSU)c);
    }

    @Override
    public void remove(Component c) {
        psus.remove((PSU)c);
    }

    @Override
    public int size() {
        return psus.size();
    }

    @Override
    public Component extract(int x) {
        return (Component)psus.get(x);
    }

    @Override
    public String printDetails() {
        return "";
    }
}