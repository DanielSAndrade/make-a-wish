package com.ciandt.hackathon.entity;

/**
 * Created by rjfonseca on 12/04/14.
 */
public class Product {

    public enum Category {WISH, BALLOON, OTHER};

    private Float price;
    private Long points;
    private String description;
    private Category category;

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
