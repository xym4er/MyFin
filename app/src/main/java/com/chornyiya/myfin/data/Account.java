package com.chornyiya.myfin.data;

public class Account {
    private int id;
    private String type;
    private String name;
    private int amount;
    private String lastUpdate;

    public Account(int id, String type, String name, int amount, String lastUpdate) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.amount = amount;
        this.lastUpdate = lastUpdate;
    }

    public Account() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
