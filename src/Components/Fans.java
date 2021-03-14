package Components;

import Components.Component.*;

import java.util.ArrayList;
import java.util.List;

public class Fans implements Part {
    private List<Fan> fans;

    public Fans() {
        this.fans = new ArrayList<Fan>();
    }

    public void addFan(Fan fan) {
        fans.add(fan);
    }

    public void removeFan(Fan fan) {
        fans.remove(fan);
    }

    @Override
    public String printDetails() {
        return "";
    }
}