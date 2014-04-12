package com.ciandt.hackathon.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Table {

	@Id
	private Long id;
	private int number;
	private int points;
	
	private Collection<Long> userIds;
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
	public Collection<Badge> getBadges() {
		return badges;
	}
	public Collection<User> getUsers() {
		return users;
	}
	public void setUsers(Collection<User> users) {
		this.users = users;
	}
	
	public Collection<Long> getUserIds() {
		return userIds;
	}
	
	public void setUserIds(Collection<Long> userIds) {
		this.userIds = userIds;
	}
	
	public void addPoints(int points){
		this.points += points;
	}
	
	public void addBadge(Badge badge){
		if(badge != null){
			if(this.badges == null){
				this.badges = new HashSet<Badge>();
			}
			
			this.badges.add(badge);
		}
	}
	
}
