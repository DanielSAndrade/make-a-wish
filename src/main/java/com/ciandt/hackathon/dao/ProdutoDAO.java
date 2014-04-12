package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Produto;

public interface ProdutoDAO {

	List<Produto> findProdutos();

	Long insert(Produto produto);

	void delete(Produto produto);

}
