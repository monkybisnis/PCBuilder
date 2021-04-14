package discount;

import Components.Part.Part;
import PCBuilder.PC;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Cart {

    Customer customer;
    List<Part> parts;
    PC pc;

    public Cart(Customer c) {
        this.customer = c;
        parts = new ArrayList<Part>();
    }

    public Cart(){
        parts = new ArrayList<Part>();
    }

    public void addItem(Part p) {
        parts.add(p);
    }

    public void addPC(PC pc) {
        this.pc = pc;
    }

    public void removePC(PC pc) {
        this.pc = null;
    }

    public void deleteItem(Part p) {
        parts.remove(p);
    }

    public double getTotalPrice() {
        double price;
        if (pc != null) {
            price = pc.getTotalPrice();
        } else {
            price = 0;
        }

        for (Part p : parts) {
            price += p.getPrice();
        }

        return price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void saveCart() {
        String name = customer.getName();

        try {
            FileOutputStream f = new FileOutputStream("data/" + name + ".parts");
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(parts);
            o.close();

            if(pc != null) {
                f = new FileOutputStream("data/" + name + ".pc");
                o = new ObjectOutputStream(f);
                o.writeObject(pc);
                o.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Part> getParts() {
        return parts;
    }

    public void setParts(List<Part> parts) {
        this.parts = parts;
    }

    public void loadCart() {
        String name = customer.getName();

        try {
            FileInputStream f = new FileInputStream("data/" + name + ".parts");
            ObjectInputStream i = new ObjectInputStream(f);
            parts = (List<Part>) i.readObject();

            try {
                f = new FileInputStream("data/" + name + ".pc");
                i = new ObjectInputStream(f);
                pc = (PC) i.readObject();
            } catch (FileNotFoundException e) {
                System.out.println("No PC in the Cart");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
