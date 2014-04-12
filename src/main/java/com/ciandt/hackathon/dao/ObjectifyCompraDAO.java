package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;

import com.ciandt.hackathon.entity.Compra;
import com.googlecode.objectify.Key;

public class ObjectifyCompraDAO implements CompraDAO {

	@Override
	public List<Compra> findCompras() {
		List<Compra> compras = ofy().load().type(Compra.class).list();
		return compras;
	}

	@Override
	public Long insert(Compra compra) {
		Key<Compra> key = ofy().save().entity(compra).now();
		return key.getId();
	}
	
}
