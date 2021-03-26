package Components;

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
    public void add(Component c) {
        components.add(c);
    }

    @Override
    public void remove(Component c) {
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