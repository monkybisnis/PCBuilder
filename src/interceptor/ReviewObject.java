package interceptor;

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
}
