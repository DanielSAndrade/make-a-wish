package com.ciandt.hackathon.entity;

import java.util.Collection;

import com.googlecode.objectify.annotation.Id;

public class User {

	@Id
	private Long id;
	private Table table;
	private Collection<Product> products;
	
}
