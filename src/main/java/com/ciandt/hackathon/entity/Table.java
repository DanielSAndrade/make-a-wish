package com.ciandt.hackathon.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by rjfonseca on 12/04/14.
 */
public class Table implements Serializable {

    private Integer number;
    private Long score;
    private Integer level;

    public Table(Integer number, Long score, Integer level) {
        this.number = number;
        this.score = score;
        this.level = level;

    }

    public Table (Integer number){
        this(number, 0L, 0);
    }

    public Table(){};

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

    public Long incrementScore(Long points){
        this.score += points;
        this.level /= 100; // Update level as score goes up by X
        return score;
    }
}
