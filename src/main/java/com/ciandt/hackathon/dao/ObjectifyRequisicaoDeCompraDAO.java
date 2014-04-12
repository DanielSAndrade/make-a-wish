package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import com.ciandt.hackathon.entity.RequisicaoDeCompra;
import com.googlecode.objectify.Key;

public class ObjectifyRequisicaoDeCompraDAO implements RequisicaoDeCompraDAO {

	@Override
	public Long insert(RequisicaoDeCompra requisicao) {
		Key<RequisicaoDeCompra> key = ofy().save().entity(requisicao).now();
		return key.getId();
		
	}
}
