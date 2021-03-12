package Components;

import Components.Component.*;

import java.util.ArrayList;
import java.util.List;

public class Cases implements Part {
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

    @Override
    public String printDetails() {
        return "";
    }
}
