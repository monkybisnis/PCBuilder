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

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    @Override
    public String printDetails() {
         return "";
    }
}