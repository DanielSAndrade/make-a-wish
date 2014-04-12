package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import com.ciandt.hackathon.entity.Produto;

public class ObjectifyProdutoDAO implements ProdutoDAO {

	@Override
	public Produto findById(Long id) {
		Produto produto = new Produto();
		produto = ofy().load().type(Produto.class).id(id).now();
		return produto; 
	}

}
