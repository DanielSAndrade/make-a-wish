package com.ciandt.hackathon.entity;

import java.util.Collection;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class User {

	@Id
	private Long id;
	
	private Long tableId;
	
	private Collection<PurchaseProduct> products;
	
	private Collection<Long> purchaseProductIds;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
