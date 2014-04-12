package com.ciandt.hackathon.api;

import java.util.List;

import javax.annotation.concurrent.ThreadSafe;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.ciandt.hackathon.dao.ComprasDAO;
import com.ciandt.hackathon.entity.Compras;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Path("/api")
@ThreadSafe
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Singleton
public class CommonResource {

	private final ComprasDAO comprasDAO;

	@Inject
	public CommonResource(ComprasDAO comprasDAO) {
		super();
		this.comprasDAO = comprasDAO;
	}

	@GET
	@Path("/listCompras")
	public List<Compras> listGreetings(@Context HttpServletRequest request) {
		List<Compras> listGreetings = comprasDAO.findCompras();
		return listGreetings;
	}

}
