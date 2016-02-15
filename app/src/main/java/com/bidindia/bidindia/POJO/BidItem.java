package com.bidindia.bidindia.POJO;

/**
 * Created by Prateek on 15-02-2016.
 */
public class BidItem {

    private int bidAmount;
    private int bidPrice;
    private int currentNoOfBids;
    private String description;
    private String fivePointDescription;

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
}
