package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Compra;


public interface CompraDAO {

	Long insert(Compra Compra);

	List<Compra> findCompras();

	void delete(Compra Compra);


}
