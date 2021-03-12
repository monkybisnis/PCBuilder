package Components;

import PCBuilder.Component;

import java.util.ArrayList;
import java.util.List;

public class Components implements Component {
    private List<PC> components;

    public Components() {
        this.components = new ArrayList<>();
    }

    public void addComponent(PC component) {
        components.add(component);
    }

    public void removeComponent(PC component) {
        components.remove(component);
    }

    @Override
    public void showComponentProperties() {
         // method to show properties of each comonent
    }
}