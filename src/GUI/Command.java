package GUI;

import GUI.MenuItems.UIViewModel;

public interface Command extends UIViewModel {
    void execute();
}
