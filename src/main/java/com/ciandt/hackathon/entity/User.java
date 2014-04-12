package com.ciandt.hackathon.entity;

import java.util.Collection;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class User {

	@Id
	private Long id;
	private Table table;
	private Long tableId;
	private Collection<PurchaseProduct> products;
	private Collection<Long> purchaseProductIds;
	
	public User(){
		//No-op
	}
	
	public User(Long id, Table table, Collection<PurchaseProduct> products){
		this.id = id;
		this.table = table;
		this.products = products;
	}
	
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
	
	
	public Collection<Long> getPurchaseProductIds() {
		return purchaseProductIds;
	}
	public void setPurchaseProductIds(Collection<Long> purchaseProductIds) {
		this.purchaseProductIds = purchaseProductIds;
	}
	public Long getTableId() {
		return tableId;
	}
	public void setTableId(Long tableId) {
		this.tableId = tableId;
	}
}
