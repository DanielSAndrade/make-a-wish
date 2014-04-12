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
import com.ciandt.hackathon.dao.MesaDAO;
import com.ciandt.hackathon.dao.ParticipanteDAO;
import com.ciandt.hackathon.dao.ParticipanteDoacaoDAO;
import com.ciandt.hackathon.dao.SonhoDAO;
import com.ciandt.hackathon.dao.TipoDoacaoDAO;
import com.ciandt.hackathon.entity.Crianca;
import com.ciandt.hackathon.entity.Greeting;
import com.ciandt.hackathon.entity.Mesa;
import com.ciandt.hackathon.entity.Participante;
import com.ciandt.hackathon.entity.ParticipanteDoacao;
import com.ciandt.hackathon.entity.Sonho;
import com.ciandt.hackathon.entity.TipoDoacao;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Path("/api")
@ThreadSafe
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Singleton
public class CommonResource {

	private final GreetingDAO greetingDAO;

	private final SonhoDAO sonhoDAO;
	
	private final MesaDAO mesaDAO;
	
	private final ParticipanteDAO participanteDAO;
	
	private final TipoDoacaoDAO tipoDoacaoDAO;
	
	private final ParticipanteDoacaoDAO participanteDoacaoDAO;

	
	@Inject
	public CommonResource(GreetingDAO greetingDAO, SonhoDAO sonhoDAO,MesaDAO mesaDAO,ParticipanteDAO participanteDAO, TipoDoacaoDAO tipoDoacaoDAO, ParticipanteDoacaoDAO participanteDoacaoDAO) {
		super();
		this.greetingDAO = greetingDAO;
		this.sonhoDAO = sonhoDAO;
		this.mesaDAO = mesaDAO;
		this.participanteDAO = participanteDAO;
		this.tipoDoacaoDAO = tipoDoacaoDAO;
		this.participanteDoacaoDAO = participanteDoacaoDAO;
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
		loadMesas();
		loadTipoDoacao();
		loadParticipanteDoacao();
	}

	private void loadParticipanteDoacao() {
		participanteDoacaoDAO.insert(new ParticipanteDoacao(1L, 1L, 1L));
		participanteDoacaoDAO.insert(new ParticipanteDoacao(2L, 2L, 2L));
		participanteDoacaoDAO.insert(new ParticipanteDoacao(3L, 3L, 1L));
		participanteDoacaoDAO.insert(new ParticipanteDoacao(4L, 4L, 1L));
		participanteDoacaoDAO.insert(new ParticipanteDoacao(5L, 5L, 3L));
		participanteDoacaoDAO.insert(new ParticipanteDoacao(6L, 6L, 1L));
		participanteDoacaoDAO.insert(new ParticipanteDoacao(7L, 7L, 3L));
		participanteDoacaoDAO.insert(new ParticipanteDoacao(8L, 6L, 1L));
		participanteDoacaoDAO.insert(new ParticipanteDoacao(9L, 7L, 3L));
		
	}
	
	private void loadTipoDoacao() {
		tipoDoacaoDAO.insert(new TipoDoacao(1L, "Balão"));
		tipoDoacaoDAO.insert(new TipoDoacao(2L, "Sonho"));
		tipoDoacaoDAO.insert(new TipoDoacao(3L, "Leilão"));
	}

	private void loadSonhos() {
		sonhoDAO.insert(new Sonho(new Crianca("Caio Oliveira"), "Viagem para fernando de noronha"));
		sonhoDAO.insert(new Sonho(new Crianca("Rodrigo Dantas"), "Comprar uma BMW"));
		sonhoDAO.insert(new Sonho(new Crianca("Claudio Japa"), "Carrinho de controle remoto"));
		sonhoDAO.insert(new Sonho(new Crianca("Bruno Soares"), "Viagem para miami"));
	}
	
	private void loadMesas() {
		System.out.println("Inserindo os dados");
		Participante p = new Participante(1l, "Fulano da Silva", 1l);
		participanteDAO.insert(p);
		
		p = new Participante(2l, "Beltrano da Silva", 1l);
		participanteDAO.insert(p);

		p = new Participante(3l, "Ciclano da Silva", 1l);
		participanteDAO.insert(p);
		
		mesaDAO.insert(new Mesa(1l,"Esperanca"));
		
		p = new Participante(4l, "Jose", 2l);
		participanteDAO.insert(p);
		
		p = new Participante(5l, "Maria", 2l);
		participanteDAO.insert(p);
		
		p = new Participante(6l, "Joao", 2l);
		participanteDAO.insert(p);
		
		mesaDAO.insert(new Mesa(2l,"Fe"));
	}
	
	
	
}
