package Components;

import PCBuilder.Component;

import java.util.ArrayList;
import java.util.List;

public class Components implements PC {
    private List<PC> components;

    public Components() {
        this.components = new ArrayList<>();
    }

    public void addComponent(PC component) {
        components.add(component);
    }

    public void removeDepartment(PC component) {
        components.remove(component);
    }
}