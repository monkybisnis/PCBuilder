package Components;

import Components.Part.GPU;

import java.util.ArrayList;
import java.util.List;

public class GPUs implements Component {
    private List<GPU> GPUs;

    public GPUs() {
        this.GPUs = new ArrayList<GPU>();
    }

    public void addGPU(GPU gpu) {
        GPUs.add(gpu);
    }

    public void removeGPU(GPU gpu) {
        GPUs.remove(gpu);
    }
public int getAmmount(){return GPUs.size(); }
public GPU extractGPu(int x){return GPUs.get(x);}
    @Override
    public String printDetails() {
        return "";
    }
}