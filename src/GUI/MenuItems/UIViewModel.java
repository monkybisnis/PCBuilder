package GUI.MenuItems;

import Components.Component;
import Components.Part.Part;
import GUI.CheckoutDialog;
import GUI.LoginDialog;
import GUI.ReviewDialog;
import discount.Customer;
import javafx.scene.Node;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public interface UIViewModel {
    default void displayCheckoutDialog() {
        CheckoutDialog.runDialog();
    }

    default void displayLoginDialog() {
        LoginDialog.runDialog();
    }

    default void displayReviewDialog(Part item) {
        ReviewDialog.runDialog(item);
        /* TemporaryReviewWindow temp = new TemporaryReviewWindow();
        temp.execute(); */
        //review.execute();
    }

    default void displayPayNowDialog(Customer customer) {
        // PayNowDialog.runDialog(customer);
        /* TemporaryReviewWindow temp = new TemporaryReviewWindow();
        temp.execute(); */
        //review.execute();
    }


    default void setClickEvent(Label label, Part c) {
        ContextMenu contextMenu = new ContextMenu();
        ItemActionButton item = new ItemActionButton("Add to Cart", c);
        ReviewButton review = new ReviewButton("Review Item", c);
        ShowReviewsButton showReviews = new ShowReviewsButton("Show Reviews", c);
        contextMenu.getItems().addAll(item, review, showReviews);
        label.setOnContextMenuRequested(event -> contextMenu.show(label, event.getScreenX(), event.getScreenY()));
    }

    default Node[] displayParts(Component component) {
        Node[] parts= new Node[component.size()];
        for (int i = 0; i < component.size(); i++) {
            Part c = (Part)component.extract(i);
            String display = c.toString();
            String path = "/resources/" + c.getIcon();

            ImageView v = new ImageView(new Image(path));
            v.setFitHeight(10);
            v.setFitWidth(10);
            Label label = new Label(display, v);
            label.setOnMouseClicked(event -> setClickEvent((Label)event.getSource(), c));
            label.setContentDisplay(ContentDisplay.TOP);
            label.setTextFill(Color.WHITE);
            parts[i]=label;
        }
        return parts;
    }

}
