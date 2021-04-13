package Components;

import Components.Part.Part;

public interface Component  {
    public String printDetails();

    public void add(Component c);
    public void remove(Component c);
    public int size();
    public Component extract(int x);
}