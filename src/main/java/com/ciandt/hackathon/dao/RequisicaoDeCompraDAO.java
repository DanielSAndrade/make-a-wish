package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.RequisicaoDeCompra;

public interface RequisicaoDeCompraDAO {

	public abstract Long insert(RequisicaoDeCompra requisicao);
	
	public RequisicaoDeCompra get(Long id);

	public void delete(Long id);

	public List<RequisicaoDeCompra> list();
}