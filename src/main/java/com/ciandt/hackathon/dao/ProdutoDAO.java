package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Produto;

public interface ProdutoDAO {
	public List<Produto> obterProdutos();
	public List<Produto> obterProdutosMesa(int numeroMesa);
	public Produto obterProduto(int numero);
}
