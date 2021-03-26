package Components;

import Components.Part.Motherboard;

import java.util.ArrayList;
import java.util.List;

public class Motherboards implements Component {
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

    public int getAmmount(){return motherboards.size();}

    public Motherboard extrractMotherboard(int x){return motherboards.get(x);}
    @Override
    public String printDetails() {
        return "";
    }

}
