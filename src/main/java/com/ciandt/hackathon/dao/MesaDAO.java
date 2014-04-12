package com.ciandt.hackathon.dao;

import java.util.Hashtable;
import java.util.List;

import com.ciandt.hackathon.entity.Mesa;
import com.ciandt.hackathon.entity.TipoDoacao;

public interface MesaDAO {

	public Hashtable<TipoDoacao, Integer> getDoacoes(Mesa mesa);
	
	public List<Mesa> findMesas();

	public Mesa find(Long id);

	public Long insert(Mesa mesa);

}
