package com.ciandt.hackathon.entity;

import java.io.Serializable;
import java.net.URL;

/**
 * Created by rjfonseca on 12/04/14.
 */
public class Product implements Serializable {

    public enum Category {WISH, BALLOON, OTHER};

    private Long id;
    private Double price;
    private Long points;
    private String description;
    private Category category;
    private URL pictureUrl;
    private URL thumbUrl;

    public Product(Long id, Double price, Long points, String desc, Category category, URL pictureUrl, URL thumbUrl) {
        this.id = id;
        this.price = price;
        this.points = points;
        this.description = desc;
        this.category = category;
        this.pictureUrl = pictureUrl;
        this.thumbUrl = thumbUrl;
    }

    public Product(){
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
