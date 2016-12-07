package com.chornyiya.myfin.data;

public class Category {
    private int id;
    private String name;
    private int parentId;

    public Category(int id, String name, int parentId) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
        parentId = 0;
    }

    public Category() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }
}
