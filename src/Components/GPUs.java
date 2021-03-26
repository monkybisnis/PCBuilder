package Components;

import Components.Part.GPU;

import java.util.ArrayList;
import java.util.List;

public class GPUs implements Component {
    private List<GPU> GPUs;

    public GPUs() {
        this.GPUs = new ArrayList<GPU>();
    }

    @Override
    public void add(Component c) {
        GPUs.add(((GPU)c));
    }

    @Override
    public void remove(Component c) {
        GPUs.remove((GPU)c);
    }

    @Override
    public int size() {
        return GPUs.size();
    }

    @Override
    public Component extract(int x) {
        return (Component)GPUs.get(x);
    }

    @Override
    public String printDetails() {
        return "";
    }
}