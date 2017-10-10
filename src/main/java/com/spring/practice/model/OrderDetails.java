package com.spring.practice.model;

/**
 * Created by Sit on 03.10.2017.
 */
public class OrderDetails {
    private int id;
    private Item item;
    private String userName;

    public OrderDetails() {
    }

    public OrderDetails(int id, Item item, String userName) {
        this.id = id;
        this.item = item;
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public Item getItem() {
        return item;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
