package com.ciandt.hackathon.dao;

import java.util.Hashtable;
import java.util.List;

import com.ciandt.hackathon.entity.Mesa;

public interface MesaDAO {

	public Hashtable<Long, Integer> getDoacoes(Mesa mesa);
	
	public List<Mesa> findMesas();

	public Mesa find(Long id);

	public Long insert(Mesa mesa);

}
