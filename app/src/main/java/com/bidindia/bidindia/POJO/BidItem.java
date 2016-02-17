package com.bidindia.bidindia.POJO;

/**
 * Created by Prateek on 15-02-2016.
 */
public class BidItem {

    private int bidAmount;
    private int bidPrice;
    private int currentNoOfBids;
    private String title;
    private String description;
    private String fivePointDescription;

    public BidItem() {
    }

    public BidItem(int amount, int bidPrice, int currentNoOfBids, String title, String des, String fpDesc) {
        this.bidAmount = amount;
        this.bidPrice = bidPrice;
        this.currentNoOfBids = currentNoOfBids;
        this.description = des;
        this.fivePointDescription = fpDesc;
    }

    public int getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(int bidAmount) {
        this.bidAmount = bidAmount;
    }

    public int getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(int bidPrice) {
        this.bidPrice = bidPrice;
    }

    public int getCurrentNoOfBids() {
        return currentNoOfBids;
    }

    public void setCurrentNoOfBids(int currentNoOfBids) {
        this.currentNoOfBids = currentNoOfBids;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFivePointDescription() {
        return fivePointDescription;
    }

    public void setFivePointDescription(String fivePointDescription) {
        this.fivePointDescription = fivePointDescription;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
