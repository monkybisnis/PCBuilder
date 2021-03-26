package Components;

import Components.Part.Fan;

import java.util.ArrayList;
import java.util.List;

public class Fans implements Component {
    private List<Fan> fans;

    public Fans() {
        this.fans = new ArrayList<Fan>();
    }

    @Override
    public void add(Component c) {
        fans.add((Fan)c);
    }

    @Override
    public void remove(Component c) {
        fans.remove((Fan)c);
    }

    public int size() {
        return fans.size();
    }

    public Component extract(int x) {
        return (Component)fans.get(x);
    }

    @Override
    public String printDetails() {
        return "";
    }
}