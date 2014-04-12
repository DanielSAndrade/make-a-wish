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
	
	public User(){
		//No-op
	}
	
	public User(Long id, Table table, Collection<PurchaseProduct> products){
		this.id = id;
		this.table = table;
		this.products = products;
	}
	
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
