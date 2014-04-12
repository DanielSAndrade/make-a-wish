package com.ciandt.hackathon.entity;

import java.net.URL;

/**
 * Created by rjfonseca on 12/04/14.
 */
public class Product {

    public URL getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(URL pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public URL getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(URL thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public enum Category {WISH, BALLOON, OTHER};

    private Float price;
    private Long points;
    private String description;
    private Category category;
    private URL pictureUrl;
    private URL thumbUrl;

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
