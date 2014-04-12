package com.ciandt.hackathon.entity;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by rjfonseca on 12/04/14.
 */
public class Table {

    private Integer number;
    private Long score;
    private Integer level;
    private Collection<Purchase> purchases;

    public Table(Integer number, Long score, Integer level, Collection<Purchase> purchases) {
        this.number = number;
        this.score = score;
        this.level = level;

        if (purchases == null) {
            this.purchases = new ArrayList<>();
        }
    }

    public Table (Integer number){
        this(number, 0L, 0, null);
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Collection<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(Collection<Purchase> purchases) {
        this.purchases = purchases;
    }

    public Long incrementScore(Long points){
        this.score += points;
        this.level /= 100; // Update level as score goes up by X
        return score;
    }

    public Long registerPurchase(Purchase purchase, Long points) {
        purchases.add(purchase);
        return incrementScore(points);
    }

    public Long registerPurchase(Purchase purchase) {
        return registerPurchase(purchase, purchase.getPoints());
    }
}
