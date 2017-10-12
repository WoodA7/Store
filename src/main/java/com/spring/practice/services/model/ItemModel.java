package com.spring.practice.services.model;

import com.spring.practice.model.Category;
import com.spring.practice.model.ItemDescription;

public class ItemModel {
    private int id;
    private String name;
    private double price;
    private double discount;
    private Category category;
    private ItemDescription itemDescription;
    private double priceDiscount;

    public ItemModel() {
    }

    public ItemModel(int id, String name, double price, double discount, double priceDiscount, Category category, ItemDescription itemDescription) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.category = category;
        this.priceDiscount = priceDiscount;
        this.itemDescription = itemDescription;
    }

    public void setPriceDiscount(double priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    public double getPriceDiscount() {

        return priceDiscount;
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

    public double getDiscount() {
        return discount;
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

    public void setDiscount(double description) {
        this.discount = description;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setItemDescription(ItemDescription itemDescription) {
        this.itemDescription = itemDescription;
    }
}
