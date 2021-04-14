package Components;

import PCBuilder.PC;

import java.util.ArrayList;
import java.util.List;

public class Components implements Component {
    public List<Component> components;

    public Components() {
        this.components = new ArrayList<>();
    }

    public void addComponents(Component... components) {
        for (Component p : components) {
            this.components.add(p);
        }
    }

    @Override
    public void add(Object c) {
        components.add((Component)c);
    }

    @Override
    public void remove(Object c) {
        components.remove(c);
    }

    @Override
    public int size() {
        return components.size();
    }

    @Override
    public Component extract(int x) {
        return components.get(x);
    }

    @Override
    public String printDetails() {
         return "";
    }

}