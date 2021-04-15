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

public class Components implements Component {
    public List<Component> components;

    public Components(){
     this.components = new ArrayList<>();
    }

    public void addComponents(Component... components) {
        for (Component p : components) {
            this.components.add(p);
        }
    }
    private void setClickEvent(Label label, Part c) {
        ContextMenu contextMenu = new ContextMenu();
        ItemActionButton item = new ItemActionButton("Add to Cart", c);
        contextMenu.getItems().addAll(item);
        label.setOnContextMenuRequested(event -> contextMenu.show(label, event.getScreenX(), event.getScreenY()));
    }

    @Override
    public void add(Object c) {
        components.add((Component)c);
    }

    @Override
    public void remove(Object c) {
        components.remove(c);
    }

    @Override
    public int size() {
        return components.size();
    }

    @Override
    public Component extract(int x) {
        return components.get(x);
    }






    @Override
    public String printDetails() {
         return "";
    }

}