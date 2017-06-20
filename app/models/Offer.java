package models;

import java.sql.Date;


public class Offer {

    public int offerId;
    public int reqId;
    public String dueDate;
    public double price;
    public String message;
    public String userId;


    public Offer(int offerId, int reqId, String dueDate, double price, String message, String userId) {
        this.offerId = offerId;
        this.reqId = reqId;
        this.dueDate = dueDate;
        this.price = price;
        this.message = message;
        this.userId = userId;
    }

    public Offer() {}




}



