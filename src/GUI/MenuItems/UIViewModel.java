package GUI.MenuItems;

import Components.Component;
import Components.Part.Part;
import GUI.Loginpage;
import GUI.ReviewPage;
import GUI.UI;
import discount.Cart;
import javafx.scene.Node;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import loginService.LoginService;

import java.util.List;

public interface UIViewModel
{

    default void addToCart(Part item){
        Cart cart = LoginService.currentCustomer.getCart();
        cart.addItem(item);
        Node[] nodes = displayCartParts() ;
        UI.cartPane.getChildren().clear();
        UI.cartPane.getChildren().addAll(nodes);
    }

    default void displayLoginDialog() {
        Loginpage login= new Loginpage();
        login.execute();
    }

    default void displayReviewDialog() {
        ReviewPage review = new ReviewPage();
        /* TemporaryReviewWindow temp = new TemporaryReviewWindow();
        temp.execute(); */
        review.execute();
    }

    public default void setClickEvent(Label label, Part c) {
        ContextMenu contextMenu = new ContextMenu();
        ItemActionButton item = new ItemActionButton("Add to Cart", c);
        contextMenu.getItems().addAll(item);
        label.setOnContextMenuRequested(event -> contextMenu.show(label, event.getScreenX(), event.getScreenY()));
    }

    public default Node[] displayCartParts() {
        List<Part> parts = LoginService.currentCustomer.getCart().getParts();
        Node[] nodes = new Node[parts.size()];
        for (Part p: parts) {
            String display = p.toString();
            System.out.println(display);
            String path = "/resources/" + p.getIcon();
            Label label = new Label(display, new ImageView(new Image(path)));
            label.setOnMouseClicked(event -> setClickEvent((Label)event.getSource(), p));
            label.setContentDisplay(ContentDisplay.TOP);
            label.setTextFill(Color.WHITE);
        }
        return nodes;
    }

    public default Node[] displayParts(Component component) {
        Node[] parts= new Node[component.size()];
        for (int i = 0; i < component.size(); i++) {
            Part c = (Part)component.extract(i);
            String display = c.toString();
            String path = "/resources/" + c.getIcon();
            Label label = new Label(display, new ImageView(new Image(path)));
            label.setOnMouseClicked(event -> setClickEvent((Label)event.getSource(), c));
            label.setContentDisplay(ContentDisplay.TOP);
            label.setTextFill(Color.WHITE);
            parts[i]=label;
        }
        return parts;
    }

}
