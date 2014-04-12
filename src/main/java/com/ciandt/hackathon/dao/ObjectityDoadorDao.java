/**
 * 
 */
package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;

import com.ciandt.hackathon.entity.Doador;
import com.ciandt.hackathon.entity.Mesa;

/**
 * @author Amanda
 * 
 */
public class ObjectityDoadorDao implements DoadorDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ciandt.hackathon.dao.DoadorDao#findDoadores()
	 */
	@Override
	public List<Doador> findDoadores() {
		return ofy().load().type(Doador.class).list();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ciandt.hackathon.dao.DoadorDao#insert(com.ciandt.hackathon.entity
	 * .Doador)
	 */
	@Override
	public void insert(Doador doador) {
		ofy().save().entity(doador).now();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ciandt.hackathon.dao.DoadorDao#delete(com.ciandt.hackathon.entity
	 * .Doador)
	 */
	@Override
	public void delete(Doador doador) {
		ofy().delete().entity(doador).now();
	}

	@Override
	public Doador findDoador(String nome) {
		return ofy().load().type(Doador.class).filter("nome", nome).first()
				.now();
	}

	@Override
	public List<Doador> findByMesa(Mesa mesa) {
		return ofy().load().type(Doador.class).filter("mesa.id", mesa.getId())
				.list();
	}

}
