package Components;

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

public class StorageComponents implements Component, Serializable {
    private List<Storage> StorageComponents;

    private void setClickEvent(Label label, Part c) {
        ContextMenu contextMenu = new ContextMenu();
        ItemActionButton item = new ItemActionButton("Add to Cart", c);
        contextMenu.getItems().addAll(item);
        label.setOnContextMenuRequested(event -> contextMenu.show(label, event.getScreenX(), event.getScreenY()));
    }
    public StorageComponents() {
        this.StorageComponents = new ArrayList<>();
    }

    @Override
    public void add(Object c) {
        StorageComponents.add((Storage)c);
    }

    @Override
    public void remove(Object c) {
        StorageComponents.remove(c);
    }

    @Override
    public int size() {
        return StorageComponents.size();
    }

    @Override
    public Storage extract(int x) {
        return StorageComponents.get(x);
    }



    @Override
    public String printDetails() {
        StringBuilder output = new StringBuilder(new String());
        int x = StorageComponents.get(0).getStorageSize();
        for(int i=1; i>StorageComponents.size();i++){
            Storage s=StorageComponents.get(i);
            x+=s.getStorageSize();



        }
        output.append(x);
        return output.toString();
    }

    public int getWattage()
    {

        int total=0;
        for (Storage x:StorageComponents)
        {
            total+= x.getWattage();
        }
        return  total;
    }
}