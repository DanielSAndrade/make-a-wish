package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Compra;

public interface CompraDAO {

	public List<Compra> findCompras();
	
	public Long insert(Compra compra);
	
}
