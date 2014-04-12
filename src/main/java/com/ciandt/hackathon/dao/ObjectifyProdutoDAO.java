package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import com.ciandt.hackathon.entity.Produto;
import com.googlecode.objectify.Key;

public class ObjectifyProdutoDAO implements ProdutoDAO {

	@Override
	public Produto findById(Long id) {
		  
		Produto produto = ofy().load().type(Produto.class).id(id).now();
		return produto; 
	}

	@Override
	public Long insert(Produto produto) {
		Key<Produto> key = ofy().save().entity(produto).now();
		return key.getId();
		
	}

}
