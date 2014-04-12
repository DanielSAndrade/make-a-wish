package com.ciandt.hackathon.entity;

import java.util.List;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class User {

	@Id
	private String name;
	private Long score;
	private com.google.appengine.api.users.User googleUser;
	private List<Product> salesList;

	public User() {
		super();
	}

	public User(String name, String description, Long score,
			List<Product> salesList) {
		super();
		this.name = name;
		this.salesList = salesList;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getSalesList() {
		return salesList;
	}

	public void setSalesList(List<Product> salesList) {
		this.salesList = salesList;
	}

	public Long getScore() {
		return score;
	}

	public void setScore(Long score) {
		this.score += score;
	}

	public com.google.appengine.api.users.User getGoogleUser() {
		return googleUser;
	}

	public void setGoogleUser(com.google.appengine.api.users.User googleUser) {
		this.googleUser = googleUser;
	}

}