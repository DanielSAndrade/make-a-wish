package com.ciandt.hackathon.api;

import java.util.List;

import javax.annotation.concurrent.ThreadSafe;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.ciandt.hackathon.dao.MesaDAO;
import com.ciandt.hackathon.entity.Mesa;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Path("/api_1")
@ThreadSafe
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Singleton
public class MakeAWishResouce {
	
	private final MesaDAO mesaDAO;

	@Inject
	public MakeAWishResouce(MesaDAO mesaDAO) {
		super();
		this.mesaDAO = mesaDAO;
	}
	
	@GET
	@Path("/listMesas")
	public List<Mesa> listMesas(@Context HttpServletRequest request){
		List<Mesa> lstMesas = mesaDAO.obterMesas();
		return lstMesas;
	}
}
