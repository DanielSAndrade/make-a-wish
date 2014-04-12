package com.ciandt.hackathon.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Donator {
	
	@Id
	private String login;
	private String name;
	private int points;
	private int badges;
	private Long table;

	public Donator() {
		
	}

	public Donator(String login, String name, int points, int badges, Long table) {
		super();
		this.login = login;
		this.name = name;
		this.points = points;
		this.badges = badges;
		this.table = table;
	}



	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
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

	public Long getTable() {
		return table;
	}

	public void setTable(Long table) {
		this.table = table;
	}

	
	
}
