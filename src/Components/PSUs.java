package Components;

import Components.Part.PSU;
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

public class PSUs implements Component, Serializable {
    private List<PSU> psus;

    private void setClickEvent(Label label, Part c) {
        ContextMenu contextMenu = new ContextMenu();
        ItemActionButton item = new ItemActionButton("Add to Cart", c);
        contextMenu.getItems().addAll(item);
        label.setOnContextMenuRequested(event -> contextMenu.show(label, event.getScreenX(), event.getScreenY()));
    }
    public PSUs() {
        this.psus = new ArrayList<>();
    }

    @Override
    public void add(Object c) {
        psus.add((PSU)c);
    }

    @Override
    public void remove(Object c) {
        psus.remove(c);
    }

    @Override
    public int size() {
        return psus.size();
    }

    @Override
    public PSU extract(int x) {
        return psus.get(x);
    }



    @Override
    public String printDetails() {
        return "";
    }
}