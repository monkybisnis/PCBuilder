package Components;

import Components.Part.Fan;
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

public class Fans implements Component, Serializable {
    private List<Fan> fans;
    private void setClickEvent(Label label, Part c) {
        ContextMenu contextMenu = new ContextMenu();
        ItemActionButton item = new ItemActionButton("Add to Cart", c);
        contextMenu.getItems().addAll(item);
        label.setOnContextMenuRequested(event -> contextMenu.show(label, event.getScreenX(), event.getScreenY()));
    }
    public Fans() {
        this.fans = new ArrayList<>();
    }

    @Override
    public void add(Object c) {
        fans.add((Fan)c);
    }

    @Override
    public void remove(Object c) {
        fans.remove(c);
    }

    public int size() {
        return fans.size();
    }

    public Fan extract(int x) {
        return fans.get(x);
    }



    @Override
    public String printDetails() {
        return "";
    }
}