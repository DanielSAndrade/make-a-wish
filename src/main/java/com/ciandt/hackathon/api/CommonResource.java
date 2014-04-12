package com.ciandt.hackathon.api;

import java.util.List;

import javax.annotation.concurrent.ThreadSafe;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.ciandt.hackathon.dao.GreetingDAO;
import com.ciandt.hackathon.dao.SonhoDAO;
import com.ciandt.hackathon.entity.Crianca;
import com.ciandt.hackathon.entity.Greeting;
import com.ciandt.hackathon.entity.Sonho;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Path("/api")
@ThreadSafe
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Singleton
public class CommonResource {

	private final GreetingDAO greetingDAO;

	private  SonhoDAO sonhoDAO;

	
	@Inject
	public CommonResource(GreetingDAO greetingDAO, SonhoDAO sonhoDAO) {
		super();
		this.greetingDAO = greetingDAO;
		this.sonhoDAO = sonhoDAO;
	}

	@GET
	@Path("/listGreetings")
	public List<Greeting> listGreetings(@Context HttpServletRequest request) {
		List<Greeting> listGreetings = greetingDAO.findGreetings();
		return listGreetings;
	}

	
	@GET
	@Path("/loadDefaultData")
	public void loadDefaultData(@Context HttpServletRequest request) {
		loadSonhos();
	}

	private void loadSonhos() {
		sonhoDAO.insert(new Sonho(new Crianca("Caio Oliveira"), "Viagem para fernando de noronha"));
		sonhoDAO.insert(new Sonho(new Crianca("Rodrigo Dantas"), "Comprar uma BMW"));
		sonhoDAO.insert(new Sonho(new Crianca("Caio Oliveira"), "Viagem para fernando de noronha"));
		sonhoDAO.insert(new Sonho(new Crianca("Rodrigo Dantas"), "Comprar uma BMW"));
	}
}
