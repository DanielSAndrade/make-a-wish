package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;

import com.ciandt.hackathon.entity.Mesa;
import com.googlecode.objectify.Key;

public class ObjectifyMesaDAO implements MesaDAO {

	@Override
	public List<Mesa> findAll() {
		return ofy().load().type(Mesa.class).list();
	}

	@Override
	public Mesa findById(Long id) {
		 return ofy().load().type(Mesa.class).id(id).now();
	}

	@Override
	public Long insert(Mesa mesa) {
		Key<Mesa> key = ofy().save().entity(mesa).now();
		return key.getId();
	}

	@Override
	public void delete(Mesa mesa) {
		ofy().delete().entities(mesa).now();
	}

}
