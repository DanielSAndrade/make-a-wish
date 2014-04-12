package com.ciandt.hackathon.dao;

import com.ciandt.hackathon.entity.RequisicaoDeCompra;

public interface RequisicaoDeCompraDAO {

	public abstract Long insert(RequisicaoDeCompra requisicao);
	
	public RequisicaoDeCompra get(Long id);

	public void delete(Long id);
}