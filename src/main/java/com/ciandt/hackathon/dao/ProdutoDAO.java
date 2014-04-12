package com.ciandt.hackathon.dao;

import com.ciandt.hackathon.entity.Produto;

public interface ProdutoDAO {
	
	public Produto findById(Long id);
	public Long insert(Produto produto);

}
