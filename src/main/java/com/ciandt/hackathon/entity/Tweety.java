package com.ciandt.hackathon.entity;

public class Tweety {

	private Long id;
	private String message;
	private String table;
	
	public Tweety(){
		super();
	}
	
	
	
	
	public Tweety(Long id, String message, String table) {
		super();
		this.id = id;
		this.message = message;
		this.table = table;
	}




	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTable() {
		return table;
	}
	public void setTable(String table) {
		this.table = table;
	}
	
}
