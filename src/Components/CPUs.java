package Components;

import Components.Part.CPU;

import java.util.ArrayList;
import java.util.List;

public class CPUs implements Component {
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

    public int getAmmount(){return CPUs.size();}

    public CPU extractCPU(int x){ return CPUs.get(x);}

    @Override
    public String printDetails() {
        return "";
    }
}