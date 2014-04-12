package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;

import com.ciandt.hackathon.entity.Sonho;
import com.googlecode.objectify.Key;

public class ObjectifySonhoDAO implements SonhoDAO {

	@Override
	public List<Sonho> findAll() {
		return ofy().load().type(Sonho.class).order("comprado").list();
	}

	@Override
	public Long insert(Sonho sonho) {
		Key<Sonho> key = ofy().save().entity(sonho).now();
		return key.getId();
	}

	@Override
	public void delete(Sonho sonho) {
		ofy().delete().entity(sonho).now();
	}

	@Override
	public Sonho findById(Long id) {
		 return ofy().load().type(Sonho.class).id(id).now();
	}

}
