/**
 * 
 */
package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;

import com.ciandt.hackathon.entity.Doador;
import com.ciandt.hackathon.entity.DoadorProduto;

/**
 * @author Amanda
 * 
 */
public class ObjectifyDoadorProdutoDao implements DoadorProdutoDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ciandt.hackathon.dao.DoadorProdutoDao#findDoadorProdutos()
	 */
	@Override
	public List<DoadorProduto> findDoadorProdutos() {
		return ofy().load().type(DoadorProduto.class).list();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ciandt.hackathon.dao.DoadorProdutoDao#insert(com.ciandt.hackathon
	 * .entity.DoadorProduto)
	 */
	@Override
	public void insert(DoadorProduto doadorProduto) {
		ofy().save().entity(doadorProduto).now();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ciandt.hackathon.dao.DoadorProdutoDao#delete(com.ciandt.hackathon
	 * .entity.DoadorProduto)
	 */
	@Override
	public void delete(DoadorProduto doadorProduto) {
		ofy().delete().entity(doadorProduto).now();

	}

	@Override
	public List<DoadorProduto> findByDoador(Doador doador) {
		return ofy().load().type(DoadorProduto.class)
				.filter("doador.id", doador.getId()).list();
	}

}
