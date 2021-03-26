package Components;

import Components.Part.CPU;

import java.util.ArrayList;
import java.util.List;

public class CPUs implements Component {
    private List<CPU> CPUs;

    public CPUs() {
        this.CPUs = new ArrayList<CPU>();
    }

    @Override
    public void add(Component c) {
        CPUs.add((CPU)c);
    }

    @Override
    public void remove(Component c) {
        CPUs.remove((CPU)c);
    }

    @Override
    public int size() {
        return CPUs.size();
    }

    @Override
    public Component extract(int x) {
        return (Component)CPUs.get(x);
    }

    @Override
    public String printDetails() {
        return "";
    }
}