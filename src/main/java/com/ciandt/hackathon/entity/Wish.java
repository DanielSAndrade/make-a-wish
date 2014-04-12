package com.ciandt.hackathon.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
 
@Entity
public class Wish {

	@Id
	private Long id;
	private String childName;
	private int childAge;
	private String disease;
	private String wish;
	private int status;
	private int donator; 

	public Wish() {

	}
	
	public Wish(String childName, int childAge, String disease, String wish) {
		setChildName(childName);
		setChildAge(childAge); 
		setDisease(disease);
		setWish(wish); 
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

	public int getChildAge() {
		return childAge;
	}

	public void setChildAge(int childAge) {
		this.childAge = childAge;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getWish() {
		return wish;
	}

	public void setWish(String wish) {
		this.wish = wish;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getDonator() {
		return donator;
	}

	public void setDonator(int donator) {
		this.donator = donator;
	}
 
}
