package Components;

import Components.Component.*;

import java.util.ArrayList;
import java.util.List;

public class Components implements Part {
    private List<Part> components;

    public Components() {
        this.components = new ArrayList<>();
    }

    public void addComponent(Part component) {
        components.add(component);
    }

    public void removeComponent(Part component) {
        components.remove(component);
    }

    @Override
    public String printDetails() {
         return "";
    }
}