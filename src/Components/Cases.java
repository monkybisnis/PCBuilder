package Components;

import java.util.ArrayList;
import java.util.List;

public class Cases implements Component {
    private List<Case> cases;

    public Cases() {
        this.cases = new ArrayList<Case>();
    }

    public void addCase(Case c) {
        cases.add(c);
    }

    public void removeCase(Case c) {
        cases.remove(c);
    }

    public int size(){return cases.size();}

    public Case extractCase(int x){ return cases.get(x);}

    @Override
    public String printDetails() {
        return String.format("Cases: %d\n", cases.size());
    }
}
