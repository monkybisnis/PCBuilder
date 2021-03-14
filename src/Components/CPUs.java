package Components;

import Components.Component.*;

import java.util.ArrayList;
import java.util.List;

public class CPUs implements Part {
    private List<CPU> CPUs;

    public CPUs() {
        this.CPUs = new ArrayList<CPU>();
    }

    public void addCPU(CPU cpu) {
        CPUs.add(cpu);
    }

    public void removeCPU(CPU cpu) {
        CPUs.remove(cpu);
    }

    @Override
    public String printDetails() {
        return "";
    }
}