package com.ciandt.hackathon.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
public class Table {

	@Id
	private Long id;
	private String name;
    
	@Index
	private int points;
	private int badges;

	public Table() {
		
	}

	public Table(Long id, String name, int points, int badges) {
		super();
		this.id = id;
		this.name = name;
		this.points = points;
		this.badges = badges;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getBadges() {
		return badges;
	}

	public void setBadges(int badges) {
		this.badges = badges;
	}
	
	
}
