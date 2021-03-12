package Components;

import PCBuilder.Motherboard;

import java.util.ArrayList;
import java.util.List;

public class Motherboards implements Part {
    private List<Motherboard> motherboards;

    public Motherboards() {
        this.motherboards = new ArrayList<Motherboard>();
    }

    public void addMotherboard(Motherboard motherboard) {
        motherboards.add(motherboard);
    }

    public void removeMotherboard(Motherboard motherboard) {
        motherboards.remove(motherboard);
    }

    @Override
    public String printDetails() {
        return "";
    }

}
