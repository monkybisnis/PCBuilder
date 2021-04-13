package Components;

import Components.Part.CPU;
import Components.Part.GPU;
import Components.Part.Motherboard;
import Components.Part.Storage;

import java.util.ArrayList;
import java.util.List;

public class GPUs implements Component {
    private List<GPU> GPUs;
    public GPUs() {
        this.GPUs = new ArrayList<GPU>();
    }
    @Override
    public void add(Component c) {
        GPUs.add((GPU) c);
    }

    @Override
    public void remove(Component c) {
        GPUs.remove((CPU)c);
    }



    @Override
    public Component extract(int x) {
        return (Component)GPUs.get(x);
    }

    @Override
    public String printDetails() {
        return "";
    }

    @Override
    public int size() {
        return 0;
    }

    public int getWattage()
    {

        int total=0;
        for (GPU x: GPUs)
        {
            total+= x.getWattage();
        }
        return  total;
    }
   
}