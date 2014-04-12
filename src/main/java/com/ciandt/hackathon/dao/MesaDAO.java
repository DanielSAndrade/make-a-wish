package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Mesa;

public interface MesaDAO {
	
	public List<Mesa> findAll();

	public Mesa findById(Long id);

	public Long insert(Mesa mesa);

	public void delete(Mesa mesa);

	public Mesa findByNumero(Integer numero);

}