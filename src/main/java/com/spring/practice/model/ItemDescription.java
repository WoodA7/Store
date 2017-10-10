package com.spring.practice.model;


public class ItemDescription {

    private int id;
    private String description;
    private String manufactory;
    private String photo;

    public ItemDescription() {
    }

    public ItemDescription(int id, String description, String manufactory, String photo) {
        this.id = id;
        this.description = description;
        this.manufactory = manufactory;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getManufactory() {
        return manufactory;
    }

    public String getPhoto() {
        return photo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setManufactory(String manufactory) {
        this.manufactory = manufactory;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
