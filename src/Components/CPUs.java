package Components;

import PCBuilder.CPU;

import java.util.ArrayList;
import java.util.List;

public class CPUs implements PC {
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
}