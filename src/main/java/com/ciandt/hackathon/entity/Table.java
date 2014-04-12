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
	private Collection<Badge> badges;
	
	
}
