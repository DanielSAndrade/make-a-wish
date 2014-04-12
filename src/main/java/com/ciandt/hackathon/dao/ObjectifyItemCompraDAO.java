package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;
import java.util.logging.Logger;

import com.ciandt.hackathon.entity.ItemCompra;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.googlecode.objectify.Key;

@Singleton
public class ObjectifyItemCompraDAO implements ItemCompraDAO {
	
	@Inject
	private Logger log;

	@Override
	public List<ItemCompra> findItemCompra() {
		log.info("Finding all greetings");
		
		List<ItemCompra> itemCompra = ofy().load().type(ItemCompra.class).list();
	    return itemCompra;
	}

	@Override
	public Long insert(ItemCompra itemCompra) {
		Key<ItemCompra> key = ofy().save().entity(itemCompra).now();
		return key.getId();
	}
	
	

}
