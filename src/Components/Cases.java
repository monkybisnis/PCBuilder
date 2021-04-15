package Components;

import Components.Part.Case;
import Components.Part.Part;
import GUI.MenuItems.ItemActionButton;
import javafx.scene.Node;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Cases implements Component {
    private List<Case> cases;

    private void setClickEvent(Label label, Part c) {
        ContextMenu contextMenu = new ContextMenu();
        ItemActionButton item = new ItemActionButton("Add to Cart", c);
        contextMenu.getItems().addAll(item);
        label.setOnContextMenuRequested(event -> contextMenu.show(label, event.getScreenX(), event.getScreenY()));
    }

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
