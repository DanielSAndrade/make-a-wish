package com.ciandt.hackathon.entity;

import com.googlecode.objectify.annotation.Serialize;

@Serialize
public class Mesa {

	private Integer id;
	private Double totalCompra;

	public Mesa() {
	}

	public Mesa(Integer id, Double totalCompra) {
		this.id = id;
		this.totalCompra = totalCompra;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getTotalCompra() {
		return totalCompra;
	}

	public void setTotalCompra(Double totalCompra) {
		this.totalCompra = totalCompra;
	}

}
