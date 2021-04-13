package GUI;


import javax.swing.*;

public class Menu {
        JMenu menu, login,checkout;
        JMenuItem i1, i2, i3, i4, i5;

        public Menu() {
            JFrame f = new JFrame("Actimel PC Builders");
            JMenuBar mb = new JMenuBar();

            menu = new JMenu("Buy PC");
            login = new JMenu("Login");
            checkout = new JMenu("checkout");
            i1 = new JMenuItem("Custom");
            i2 = new JMenuItem("PowerSaver");
            i3 = new JMenuItem("Budget");

            menu.add(i1);
            menu.add(i2);
            menu.add(i3);

            mb.add(menu);
            mb.add(login);
            mb.add(checkout);
            f.setJMenuBar(mb);
            f.setSize(400, 400);
            f.setLayout(null);
            f.setVisible(true);
        }
    }


