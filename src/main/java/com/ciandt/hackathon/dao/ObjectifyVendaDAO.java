package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.ArrayList;
import java.util.List;

import com.ciandt.hackathon.entity.Venda;
import com.googlecode.objectify.Key;

public class ObjectifyVendaDAO implements VendaDAO{

	@Override
	public List<Venda> findVendas() {
		return new ArrayList<>();
	}

	@Override
	public Long insert(Venda venda) {
		Key<Venda> key = ofy().save().entity(venda).now();
		return key.getId();
	}

}
