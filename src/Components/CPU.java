package Components;

import PCBuilder.Component;

import java.util.ArrayList;
import java.util.List;

public class CPU implements PC {
    private List<CPU> CPUs;

    public CPU() {
        this.CPUs = new ArrayList<CPU>();
    }

    public void addCPU(CPU cpu) {
        CPUs.add(cpu);
    }

    public void removeCPU(CPU cpu) {
        CPUs.remove(cpu);
    }
}