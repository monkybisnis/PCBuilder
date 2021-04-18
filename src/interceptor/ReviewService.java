package interceptor;

import Components.Part.Part;
import loginService.LoginService;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class ReviewService {
    static Hashtable<String, List<String>> reviewsTable = new Hashtable<String,List<String>>();

    public static void addReview(Part item, String review) {
        review = LoginService.currentCustomer.getName() + ": " + review ;
        System.out.println("Adding Review");
        List<String> reviews = reviewsTable.get(item.getSerialNumber()) ;
        if (reviews == null) {
            //System.out.println("First review");
            List<String> newReviews = new ArrayList<String>() ;
            newReviews.add(review) ;
            reviewsTable.put(item.getSerialNumber(), newReviews) ;
        }
        else {
            //System.out.println("Another Review");
            reviews.add(review) ;
            reviewsTable.put(item.getSerialNumber(), reviews) ;
        }
    }

    public static void printReviews(Part item) {
        System.out.println("Reviews for "+ item.getSerialNumber());
        List<String> reviews = reviewsTable.get(item.getSerialNumber()) ;
        if (reviews == null) {
            System.out.println("No reviews");
        }
        else {
            System.out.println(reviews);
        }
    }

    public void saveReview(String review){
        String name = LoginService.currentCustomer.getName();
        FileOutputStream f = null;
        try {
             f = new FileOutputStream("data/" + name + ".review",true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        PrintWriter p = new PrintWriter(f);
        p.println(review);
        p.close();
    }
}
