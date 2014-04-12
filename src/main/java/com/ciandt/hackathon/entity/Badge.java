package com.ciandt.hackathon.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
 
@Entity
public class Badge {

	@Id
	private Long id;
	private String name; 

	public Badge() {

	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public String getName() {
		return name; 
	}


 
}
