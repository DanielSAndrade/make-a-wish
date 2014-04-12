package com.ciandt.hackathon.api;

import java.util.List;

import javax.annotation.concurrent.ThreadSafe;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.ciandt.hackathon.dao.VendaDAO;
import com.ciandt.hackathon.entity.Greeting;
import com.ciandt.hackathon.entity.Venda;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Path("/api")
@ThreadSafe
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Singleton
public class VendaResource {

	private VendaDAO vendaDAO;
	
	@Inject
	public VendaResource(VendaDAO vendaDAO) {
		super();
		this.vendaDAO = vendaDAO;
	}
	
	@POST
	@Path("/insertVenda")
	public Venda insertVenda(@Context HttpServletRequest request) {
		//id produto
		//numero Mesa
		//id comprador
		
		return null;
//		Venda venda = new Venda();
		
	}
	
}
