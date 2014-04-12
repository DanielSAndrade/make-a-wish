package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Mesa;

public interface MesaDAO {
	
	public List<Mesa> findMesas();
	
	public Long insert( Mesa mesa );
	
}
