package com.ciandt.hackathon.entity;

import com.google.appengine.repackaged.org.joda.time.DateTime;

import java.io.Serializable;

/**
 * Created by rjfonseca on 12/04/14.
 */
public class Purchase implements Serializable {

    private Table table;
    private Product product;
    private DateTime dateTime;
    private Long points;

    public Purchase (Table table, Product product, DateTime dateTime, Long points){
        this.table = table;
        this.product = product;
        this.dateTime = dateTime;
        this.points = points;

    }

    public Purchase (Table table, Product product) {
        this(table, product, DateTime.now(), product.getPoints());
    }

    public Purchase(Table table, Product product, Long points){
        this(table, product, DateTime.now(), points);
    }

    public Purchase(){};

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }

    public DateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }
}
