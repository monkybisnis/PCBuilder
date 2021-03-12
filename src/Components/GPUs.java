package Components;

import PCBuilder.GPU;

import java.util.ArrayList;
import java.util.List;

public class GPUs implements Part {
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

    @Override
    public String printDetails() {
        return "";
    }
}