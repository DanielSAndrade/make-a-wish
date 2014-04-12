package com.ciandt.hackathon.entity;

import java.util.Collection;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Table {

	@Id
	private Long id;
	private int number;
	private int points;
	private Collection<User> users;
	private Collection<Badge> badges;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public Collection<Badge> getBadge() {
		return badges;
	}
	public void setBadges(Collection<Badge> badges) {
		this.badges = badges;
	}
	public Collection<User> getUsers() {
		return users;
	}
	public void setUsers(Collection<User> users) {
		this.users = users;
	}
}
