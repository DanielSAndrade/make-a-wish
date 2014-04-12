package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;

import com.ciandt.hackathon.entity.Produto;
import com.googlecode.objectify.Key;

public class ProdutoDAO {  

	public List<Produto> findAll() {
		List<Produto> produtos = ofy().load().type(Produto.class).list();
		return produtos;
	}

	public Produto findByName(String name) {
		return ofy().load().type(Produto.class).filter("nome", name).first().now();
	}

	public Long insert(Produto produto) {
		Key<Produto> key = ofy().save().entity(produto).now();
		return key.getId();
	}

	public void delete(Produto produto) {
		ofy().delete().entity(produto).now();
	}

}
