package Components;

import Components.Part.Fan;

import java.util.ArrayList;
import java.util.List;

public class Fans implements Component {
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