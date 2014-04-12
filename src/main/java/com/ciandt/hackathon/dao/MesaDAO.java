package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Mesa;

public interface MesaDAO {

	List<Mesa> findMesas();

	Long insert(Mesa mesa);

	void delete(Mesa mesa);
	
	Mesa find(Long idMesa);

}
