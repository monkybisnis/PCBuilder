package Components;

import Components.Part.Memory;
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

public class MemoryModules implements Component, Serializable {
    private List<Memory> memoryModules;
    private void setClickEvent(Label label, Part c) {
        ContextMenu contextMenu = new ContextMenu();
        ItemActionButton item = new ItemActionButton("Add to Cart", c);
        contextMenu.getItems().addAll(item);
        label.setOnContextMenuRequested(event -> contextMenu.show(label, event.getScreenX(), event.getScreenY()));
    }
    public MemoryModules() {
        this.memoryModules = new ArrayList<>();
    }

    @Override
    public void add(Object c) {
        memoryModules.add((Memory)c);
    }

    @Override
    public void remove(Object c) {
        memoryModules.remove(c);
    }

    @Override
    public int size() {
        return memoryModules.size();
    }

    @Override
    public Memory extract(int x) {
        return memoryModules.get(x);
    }



    @Override
    public String printDetails() {
        StringBuilder output = new StringBuilder(new String());

        Memory m=memoryModules.get(0);
        output.append(memoryModules.size()).append("x").append(" ").append(m.getSerialNumber()).append(" ").append(m.getSpeed()).append("mhz");

        return output.toString();
    }
    public int getWattage()
    {

        int total=0;
        for (Memory x:memoryModules)
        {
            total+= x.getWattage();
        }
        return  total;
    }
}
