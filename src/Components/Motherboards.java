package Components;

import Components.Part.Motherboard;

import java.util.ArrayList;
import java.util.List;

public class Motherboards implements Component {
    private List<Motherboard> motherboards;

    public Motherboards() {
        this.motherboards = new ArrayList<Motherboard>();
    }

    @Override
    public void add(Object c) {
        motherboards.add((Motherboard)c);
    }

    @Override
    public void remove(Object c) {
        motherboards.remove((Motherboard)c);
    }

    @Override
    public int size() {
        return motherboards.size();
    }

    @Override
    public Motherboard extract(int x) {
        return motherboards.get(x);
    }

    @Override
    public String printDetails() {
        return "";
    }

}
