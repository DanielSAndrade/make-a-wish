package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;

import com.ciandt.hackathon.entity.RequisicaoDeCompra;
import com.googlecode.objectify.Key;

public class ObjectifyRequisicaoDeCompraDAO implements RequisicaoDeCompraDAO {

	@Override
	public Long insert(RequisicaoDeCompra requisicao) {
		Key<RequisicaoDeCompra> key = ofy().save().entity(requisicao).now();
		return key.getId();
	}
	
	@Override
	public RequisicaoDeCompra get(Long id) {
		return (RequisicaoDeCompra) ofy().load().type(RequisicaoDeCompra.class).id(id).now();
	}
	
	@Override
	public void delete(Long id) {
		ofy().delete().type(RequisicaoDeCompra.class).id(id).now();
	}

	@Override
	public List<RequisicaoDeCompra> list() {
		return ofy().load().type(RequisicaoDeCompra.class).order("dataDoPedido").list();
	}
}
