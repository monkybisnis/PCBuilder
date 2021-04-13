package Components;

import Components.Part.CPU;

import java.util.ArrayList;
import java.util.List;

public class CPUs implements Component  {
    private List<CPU> CPUs;

    public CPUs() {
        this.CPUs = new ArrayList<>();
    }

    @Override
    public void add(Object c) {
        CPUs.add((CPU)c);
    }

    @Override
    public void remove(Object c) {
        CPUs.remove(c);
    }

    @Override
    public int size() {
        return CPUs.size();
    }

    @Override
    public CPU extract(int x) {
        return CPUs.get(x);
    }

    @Override
    public String printDetails() {
        return "";
    }
}