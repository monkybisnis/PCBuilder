package discount;

import Components.Part.Part;
import GUI.UI;
import PCBuilder.PC;
import javafx.scene.Node;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

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
        double price=0;


        for (Part p : parts) {
            price += p.getPrice();
        }

        return price;
    }

    public int getTotalItems() {
        return parts.size();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void saveCart() {
        System.out.println("Save cart");
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

    public void clearCart(){
        parts = new ArrayList<Part>() ;
        setUICart();
    }

    public void loadCart() {
        System.out.println("Load cart");
        String name = customer.getName();

        try {
            FileInputStream f = new FileInputStream("data/" + name + ".parts");
            ObjectInputStream i = new ObjectInputStream(f);
            parts = (List<Part>) i.readObject();

            setUICart() ;

            try {
                f = new FileInputStream("data/" + name + ".pc");
                i = new ObjectInputStream(f);
                pc = (PC) i.readObject();
            } catch (FileNotFoundException e) {
                System.out.println("No PC in the Cart");
            }

        } catch (FileNotFoundException e) {
            System.out.println("No Cart");
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public void printParts(){
//        System.out.println("Content of the cart");
//        for(Part p : parts){
//            System.out.println(p.toString());
//        }
//    }

    public void setUICart(){
        System.out.println("setUICart()");
        // Cart cart = LoginService.currentCustomer.getCart();
        Node[] nodes = getNodes4CartParts() ;
        UI.cartPane.getChildren().clear();
        UI.cartPane.getChildren().addAll(nodes);
    }

    public void addToUICart(Part item){
        // Cart cart = LoginService.currentCustomer.getCart();
        // cart.addItem(item);
        addItem(item) ;
        Node[] nodes = getNodes4CartParts() ;
        UI.cartPane.getChildren().clear();
        UI.cartPane.getChildren().addAll(nodes);
    }

    public Node[] getNodes4CartParts() {
        System.out.println("getNodes4CartParts()");
        // List<Part> parts = LoginService.currentCustomer.getCart().getParts();
        Node[] nodes = new Node[parts.size()];
        int i = 0 ;
        for (Part p: parts) {
            String display = p.toString();
            System.out.println(display);
            String path = "/resources/" + p.getIcon();
            System.out.println("path" + path);
            Label label = new Label(display, new ImageView(new Image(path)));
            //label.setOnMouseClicked(event -> setClickEvent((Label)event.getSource(), p));
            label.setContentDisplay(ContentDisplay.TOP);
            label.setTextFill(Color.WHITE);
            nodes[i] = label ;
            i++ ;
        }
        return nodes;
    }

}
