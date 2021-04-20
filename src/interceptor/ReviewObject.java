package interceptor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ReviewObject {
    private String itemID;
    private String itemType;
    private String userID;
    private String review;

    public ReviewObject(String itemID, String itemType, String userID, String review) {
        this.itemID = itemID;
        this.itemType = itemType;
        this.userID = userID;
        this.review = review;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "ReviewObject{" +
                "itemID='" + itemID + '\'' +
                ", itemType='" + itemType + '\'' +
                ", userID='" + userID + '\'' +
                ", review='" + review + '\'' +
                '}';
    }

    public String toStringForCSV() {
        return  itemID + "," +
                itemType + "," +
                userID + "," +
                review;
    }

    public static void writeReviews (ArrayList<ReviewObject> reviews) {

        try {
            File directoryOfReviews = new File("data/joe.review");
            if (!directoryOfReviews.exists()){directoryOfReviews.createNewFile();}

            FileWriter reviewsFileWriter = new FileWriter(directoryOfReviews);
            for(ReviewObject review: reviews){
                reviewsFileWriter.write(review.toStringForCSV() + "\n");
            }
            reviewsFileWriter.flush();
            reviewsFileWriter.close();
        }  catch (IOException e) {
            System.out.println("Error occurred while saving a reviews");
            e.printStackTrace();
        }
    }
}
