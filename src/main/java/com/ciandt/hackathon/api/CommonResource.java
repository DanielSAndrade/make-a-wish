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
import javax.ws.rs.core.Response;

import com.ciandt.hackathon.dao.GreetingDAO;
import com.ciandt.hackathon.dao.ParticipanteDAO;
import com.ciandt.hackathon.entity.Compra;
import com.ciandt.hackathon.entity.Greeting;
import com.ciandt.hackathon.entity.Participante;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Path("/api")
@ThreadSafe
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Singleton
public class CommonResource {

	private final GreetingDAO greetingDAO;
	
	private final ParticipanteDAO participanteDAO;
	

	@Inject
	public CommonResource(GreetingDAO greetingDAO, ParticipanteDAO participanteDAO) {
		super();
		this.greetingDAO = greetingDAO;
		this.participanteDAO = participanteDAO;
	}

	@GET
	@Path("/listGreetings")
	public List<Greeting> listGreetings(@Context HttpServletRequest request) {
		List<Greeting> listGreetings = greetingDAO.findGreetings();
		return listGreetings;
	}
	
	@GET
	@Path("/rankingMesa")
	public List<Greeting> rankingMesa(@Context HttpServletRequest request) {
		List<Greeting> listGreetings = greetingDAO.findGreetings();
		return listGreetings;
	}
	
	@GET
	@Path("/rankingParticipante")
	public List<Participante> rankingParticipante(@Context HttpServletRequest request) {
		List<Participante> listParticipantes = participanteDAO.findParticipantes();
		return listParticipantes;
	}
	
	@GET
	@Path("/rankingMesaGeral")
	public List<Greeting> rankingMesaGeral(@Context HttpServletRequest request) {
		List<Greeting> listGreetings = greetingDAO.findGreetings();
		return listGreetings;
	}

	@GET
	@Path("/rankingPessoaGeral")
	public List<Greeting> rankingPessoaGeral(@Context HttpServletRequest request) {
		List<Greeting> listGreetings = greetingDAO.findGreetings();
		return listGreetings;
	}

	@POST
	@Path("/compra")
	public Response compra(@Context HttpServletRequest request) {
		
		String idProduto = (String)request.getAttribute("idProduto");
		String valorCompra = (String)request.getAttribute("valor");
		String idParticipante = (String)request.getAttribute("idParticipante");
		
		
		if (idProduto != null && valorCompra != null && idParticipante != null){
			System.out.println("Criando nova compra");
			
			Compra compra = new Compra();
			
			
		}else{
			System.err.println("##############Parametros nulos");
		}
		
		return Response.ok("OK").build();
	}


}
