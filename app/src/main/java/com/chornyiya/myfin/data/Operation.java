package com.chornyiya.myfin.data;

/**
 * Created by y.chornyi on 21.10.2016.
 */

public class Operation {
    private int id;
    private int accountId;
    private int catedoryId;
    private int amount;
    private String date;

    public Operation(){}

    public Operation(int accountId,int catedoryId, int amount, String date) {
        this.accountId = accountId;
        this.catedoryId = catedoryId;
        this.amount = amount;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getCatedoryId() {
        return catedoryId;
    }

    public void setCatedoryId(int catedoryId) {
        this.catedoryId = catedoryId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
