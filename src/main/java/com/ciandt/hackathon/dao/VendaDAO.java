package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Venda;

public interface VendaDAO {

	public List<Venda> findVendas();

	public Long insert(Venda venda);


}
