package Components;

import Components.Part.Fan;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Fans implements Component, Serializable {
    private List<Fan> fans;

    public Fans() {
        this.fans = new ArrayList<>();
    }

    @Override
    public void add(Object c) {
        fans.add((Fan)c);
    }

    @Override
    public void remove(Object c) {
        fans.remove(c);
    }

    public int size() {
        return fans.size();
    }

    public Fan extract(int x) {
        return fans.get(x);
    }

    @Override
    public String printDetails() {
        return "";
    }
}