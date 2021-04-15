package GUI.MenuItems;

import Components.Component;
import Components.Part.Part;
import GUI.Loginpage;
import discount.Cart;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Pair;
import loginService.LoginService;

import java.util.Optional;

public interface UIViewModel


{

    default void AddtoCart(Part item){
        Cart cart = LoginService.currentCustomer.getCart();
        cart.addItem(item);
    }

    default void displayLoginDialog() {

        Loginpage login= new Loginpage();
        login.execute();


//
//    }
    }

    public default void setClickEvent(Label label, Part c) {
        ContextMenu contextMenu = new ContextMenu();
        ItemActionButton item = new ItemActionButton("Add to Cart", c);
        contextMenu.getItems().addAll(item);
        label.setOnContextMenuRequested(event -> contextMenu.show(label, event.getScreenX(), event.getScreenY()));
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
