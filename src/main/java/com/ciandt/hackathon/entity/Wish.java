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
	private Status status;
	private String tableName;
	private int donator; 
	
	public enum Status {
		REALIZED,
		AVAILABLE,
		PRESENTED,
		INTENDED
	}
	
	public Wish() {

	}


	
	public Wish(Long id, String childName, int childAge, String disease,
			String wish, Status status, String intendedTable, int donator) {
		super();
		this.id = id;
		this.childName = childName;
		this.childAge = childAge;
		this.disease = disease;
		this.wish = wish;
		this.status = status;
		this.tableName = intendedTable;
		this.donator = donator;
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
	
	public String getStatusString() {
		return status.name();
	}
	public Status getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = Status.valueOf(status);
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getTableName() {
		return tableName;
	}
	
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
	public int getDonator() {
		return donator;
	}

	public void setDonator(int donator) {
		this.donator = donator;
	}
 
}
