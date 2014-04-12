package com.ciandt.hackathon.api;

import java.util.List;

import javax.annotation.concurrent.ThreadSafe;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.ciandt.hackathon.dao.DoadorDao;
import com.ciandt.hackathon.entity.Doador;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Path("/api2")
@ThreadSafe
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Singleton
public class CommonResource1 {

	private final DoadorDao doadorDao;
	
	@Inject
	public CommonResource1(DoadorDao doadorDao) {
		super();
		this.doadorDao = doadorDao;
	}

	@GET
	@Path("/listdoadores")
	public List<Doador> listDoadores(@Context HttpServletRequest request) {
		List<Doador> listDoadores = doadorDao.findDoadores();
		return listDoadores;
	}

}
