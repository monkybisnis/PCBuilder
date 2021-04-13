package Components;

import Components.Part.Case;

import java.util.ArrayList;
import java.util.List;

public class Cases implements Component {
    private List<Case> cases;

    public Cases() {
        this.cases = new ArrayList<>();
    }

    @Override
    public void add(Object c) {
        cases.add((Case)c);
    }

    @Override
    public void remove(Object c) {
        cases.remove(c);
    }

    @Override
    public int size() {
        return cases.size();
    }

    @Override
    public Case extract(int x) {
        return cases.get(x);
    }

    @Override
    public String printDetails() {
        return String.format("Cases: %d\n", cases.size());
    }
}
