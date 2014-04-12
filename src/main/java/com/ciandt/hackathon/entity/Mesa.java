package com.ciandt.hackathon.entity;

import com.googlecode.objectify.annotation.Serialize;

@Serialize
public class Mesa {

	private Long id;
	private Double totalCompra;

	public Mesa() {
	}

	public Mesa(Long id, Double totalCompra) {
		this.id = id;
		this.totalCompra = totalCompra;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getTotalCompra() {
		return totalCompra;
	}

	public void setTotalCompra(Double totalCompra) {
		this.totalCompra = totalCompra;
	}

}
