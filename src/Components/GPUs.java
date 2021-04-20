package Components;

import Components.Part.GPU;
import Components.Part.Memory;
import Components.Part.Part;
import Components.Part.Storage;
import GUI.MenuItems.ItemActionButton;
import javafx.scene.Node;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GPUs implements Component, Serializable {
    private List<GPU> GPUs;
    public GPUs() {
        this.GPUs = new ArrayList<>();
    }
    private void setClickEvent(Label label, Part c) {
        ContextMenu contextMenu = new ContextMenu();
        ItemActionButton item = new ItemActionButton("Add to Cart", c);
        contextMenu.getItems().addAll(item);
        label.setOnContextMenuRequested(event -> contextMenu.show(label, event.getScreenX(), event.getScreenY()));
    }
    @Override
    public void add(Object c) {
        GPUs.add((GPU)c);
    }

    @Override
    public void remove(Object c) {
        GPUs.remove(c);
    }

    @Override
    public GPU extract(int x) {
        return GPUs.get(x);
    }



    @Override
    public String printDetails() {
        StringBuilder output = new StringBuilder(new String());
        GPU g = GPUs.get(0);
        output.append(GPUs.size()).append("x").append(" ").append(g.getSerialNumber()).append(" ").append(g.getMemory()).append("Gb");


        return output.toString();

    }

    @Override
    public int size() {
        return GPUs.size();
    }

    public int getWattage()
    {

        int total=0;
        for (GPU x: GPUs)
        {
            total+= x.getWattage();
        }
        return  total;
    }
   
}