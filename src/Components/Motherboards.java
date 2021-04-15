package Components;

import Components.Part.Motherboard;
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

public class Motherboards implements Component, Serializable {
    private List<Motherboard> motherboards;
    private void setClickEvent(Label label, Part c) {
        ContextMenu contextMenu = new ContextMenu();
        ItemActionButton item = new ItemActionButton("Add to Cart", c);
        contextMenu.getItems().addAll(item);
        label.setOnContextMenuRequested(event -> contextMenu.show(label, event.getScreenX(), event.getScreenY()));
    }
    public Motherboards() {
        this.motherboards = new ArrayList<Motherboard>();
    }

    @Override
    public void add(Object c) {
        motherboards.add((Motherboard)c);
    }

    @Override
    public void remove(Object c) {
        motherboards.remove((Motherboard)c);
    }

    @Override
    public int size() {
        return motherboards.size();
    }

    @Override
    public Motherboard extract(int x) {
        return motherboards.get(x);
    }



    @Override
    public String printDetails() {
        return "";
    }

}
