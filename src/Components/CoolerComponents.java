package Components;

import Components.Component.*;

import java.util.ArrayList;
import java.util.List;

public class CoolerComponents implements Part {
    private List<Cooler> coolerComponents;

    public CoolerComponents() {
        this.coolerComponents = new ArrayList<Cooler>();
    }

    public void addCooler(Cooler coolerComponent) {
        coolerComponents.add(coolerComponent);
    }

    public void removeCooler(Cooler coolerComponent) {
        coolerComponents.remove(coolerComponent);
    }

    @Override
    public String printDetails() {
        return "";
    }
}