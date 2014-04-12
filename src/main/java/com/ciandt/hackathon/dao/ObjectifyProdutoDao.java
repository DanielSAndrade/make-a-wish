/**
 * 
 */
package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;

import com.ciandt.hackathon.entity.Produto;

/**
 * @author Amanda
 * 
 */
public class ObjectifyProdutoDao implements ProdutoDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ciandt.hackathon.dao.ProdutoDao#findProdutos()
	 */
	@Override
	public List<Produto> findProdutos() {
		return ofy().load().type(Produto.class).list();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ciandt.hackathon.dao.ProdutoDao#insert(com.ciandt.hackathon.entity
	 * .Produto)
	 */
	@Override
	public void insert(Produto produto) {
		ofy().save().entity(produto).now();
	}

	@Override
	public void delete(Produto produto) {
		ofy().delete().entity(produto).now();
	}

}
