package com.ciandt.hackathon.entity;

import java.util.Collection;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class User {

	@Id
	private Long id;
	private Table table;
	private Collection<PurchaseProduct> products;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Table getTable() {
		return table;
	}
	public void setTable(Table table) {
		this.table = table;
	}
	public Collection<PurchaseProduct> getProducts() {
		return products;
	}
	public void setProducts(Collection<PurchaseProduct> products) {
		this.products = products;
	}
	
}
