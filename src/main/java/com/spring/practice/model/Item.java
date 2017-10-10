package com.spring.practice.model;

/**
 * Created by Sit on 03.10.2017.
 */
public class Item {

    private int id;
    private String name;
    private double price;
    private double description;
    private Category category;
    private ItemDescription itemDescription;

    public Item() {
    }

    public Item(int id, String name, double price, double description, Category category, ItemDescription itemDescription) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.itemDescription = itemDescription;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }

    public ItemDescription getItemDescription() {
        return itemDescription;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(double description) {
        this.description = description;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setItemDescription(ItemDescription itemDescription) {
        this.itemDescription = itemDescription;
    }
}
