package Components;

import Components.Part.CPU;
import Components.Part.Part;
import GUI.MenuItems.ItemActionButton;
import javafx.scene.Node;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CPUs implements Component, Serializable {
    private List<CPU> CPUs;

    public CPUs() {
        this.CPUs = new ArrayList<>();
    }

    @Override
    public void add(Object c) {
        CPUs.add((CPU)c);
    }

    @Override
    public void remove(Object c) {
        CPUs.remove(c);
    }

    @Override
    public int size() {
        return CPUs.size();
    }

    @Override
    public CPU extract(int x) {
        return CPUs.get(x);
    }



    @Override
    public String printDetails() {
        return "";
    }
}