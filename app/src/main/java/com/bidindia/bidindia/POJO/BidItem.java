package com.bidindia.bidindia.POJO;

/**
 * Created by Prateek on 15-02-2016.
 */
public class BidItem {

    private int bidWiningAmount;
    private int bidPrice;
    private int currentNoOfBids;
    private String title;
    private String description;
    private String fivePointDescription;

    public BidItem() {
    }

    public BidItem(int bidWiningAmount, int currentNoOfBids, String des, String fpDesc) {
        this.bidWiningAmount = bidWiningAmount;
        this.bidPrice = bidPrice;
        this.currentNoOfBids = currentNoOfBids;
        this.description = des;
        this.fivePointDescription = fpDesc;
    }

    public int getBidWiningAmount() {
        return bidWiningAmount;
    }

    public void setBidWiningAmount(int bidWiningAmount) {
        this.bidWiningAmount = bidWiningAmount;
    }

    public int getBidPrice() {
        return bidWiningAmount/100;
    }

//    public void setBidPrice(int bidPrice) {
//        this.bidPrice = bidPrice;
//    }

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
        return "PayTm "+bidWiningAmount;
    }

    /*public void setTitle(String title) {
        this.title = title;
    }*/
}
