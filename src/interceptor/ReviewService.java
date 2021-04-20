package interceptor;

import Components.Part.Part;
import loginService.LoginService;

import java.io.*;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class ReviewService {
    public static Hashtable<String, List<String>> reviewsTable ;

    public static void saveReviews2File() {
        try {
            FileOutputStream f = new FileOutputStream("data/reviews.txt");
            ObjectOutputStream out = new ObjectOutputStream(f);
            out.writeObject(reviewsTable) ;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readReviewsFromFile() {
        try {
            FileInputStream f = new FileInputStream("data/reviews.txt");
            ObjectInputStream in = new ObjectInputStream(f);
            reviewsTable = (Hashtable<String, List<String>>) in.readObject();
        } catch (FileNotFoundException e) {
            reviewsTable = new Hashtable<String,List<String>>();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
        saveReviews2File();
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
