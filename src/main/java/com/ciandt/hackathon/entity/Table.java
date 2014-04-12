package com.ciandt.hackathon.entity;

import java.util.List;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Table {


	@Id
	private String name;
	private String description;
	private Long score;
	private List<User> users;
	
	
}
