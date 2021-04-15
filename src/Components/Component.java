package Components;

import javafx.scene.Node;
import javafx.scene.layout.FlowPane;

import java.util.Collection;

public interface Component  {
    String printDetails();
    void add(Object c);
    void remove(Object c);
    int size();
    Object extract(int x);

}