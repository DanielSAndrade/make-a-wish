package com.ciandt.hackathon.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;


@Entity
public class Product {
	
	@Id
	private Long id;
	private String description;
	private String name;
	private Long weight;
	private Long value;
	
	
	
	
	public Product() {
		super();		
	}
	public Product(Long id, String description, String name, Long weight,
			Long value) {
		super();
		this.id = id;
		this.description = description;
		this.name = name;
		this.weight = weight;
		this.value = value;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getWeight() {
		return weight;
	}
	public void setWeight(Long weight) {
		this.weight = weight;
	}
	public Long getValue() {
		return value;
	}
	public void setValue(Long value) {
		this.value = value;
	}

}
