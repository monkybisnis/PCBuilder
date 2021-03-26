package Components;

import Components.Part.Case;

import java.util.ArrayList;
import java.util.List;

public class Cases implements Component {
    private List<Case> cases;

    public Cases() {
        this.cases = new ArrayList<Case>();
    }

    @Override
    public void add(Component c) {
        cases.add((Case)c);
    }

    @Override
    public void remove(Component c) {
        cases.remove((Case)c);
    }

    @Override
    public int size() {
        return cases.size();
    }

    @Override
    public Component extract(int x) {
        return (Component)cases.get(x);
    }

    @Override
    public String printDetails() {
        return String.format("Cases: %d\n", cases.size());
    }
}
