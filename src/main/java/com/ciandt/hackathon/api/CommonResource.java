package com.ciandt.hackathon.api;

import java.util.List;

import javax.annotation.concurrent.ThreadSafe;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.ciandt.hackathon.dao.DoadorDao;
import com.ciandt.hackathon.dao.GreetingDAO;
import com.ciandt.hackathon.dao.MesaDAO;
import com.ciandt.hackathon.dao.ProdutoDao;
import com.ciandt.hackathon.dao.SonhoDAO;
import com.ciandt.hackathon.entity.Doador;
import com.ciandt.hackathon.entity.Greeting;
import com.ciandt.hackathon.entity.ListaSonhos;
import com.ciandt.hackathon.entity.Mesa;
import com.ciandt.hackathon.entity.Sonho;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Path("/api")
@ThreadSafe
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Singleton
public class CommonResource {

	private final GreetingDAO greetingDAO;
	private final MesaDAO mesaDAO;
	private final SonhoDAO sonhoDao;
	private final DoadorDao doadorDao;
	private final ProdutoDao produtoDao;
	
	@Inject
	public CommonResource(GreetingDAO greetingDAO, MesaDAO mesaDAO, SonhoDAO sonhoDao, DoadorDao doadorDao, ProdutoDao produtoDao) {
		
		super();
		this.greetingDAO = greetingDAO;
		this.mesaDAO = mesaDAO;
		this.produtoDao = produtoDao;
		this.doadorDao = doadorDao;
		this.sonhoDao = sonhoDao;
		
	}

	@GET
	@Path("/listGreetings")
	public List<Greeting> listGreetings(@Context HttpServletRequest request) {
		List<Greeting> listGreetings = greetingDAO.findGreetings();
		return listGreetings;
	}

	@GET
	@Path("/mesas")
	public List<Mesa> listMesas(@Context HttpServletRequest request) {
		return mesaDAO.findAll();
	}
	
	@GET
	@Path("/sonhos")
	public ListaSonhos listsonhos(@Context HttpServletRequest request) {
		//read user context

		ListaSonhos result = new ListaSonhos();
		result.setSonhos(sonhoDao.findAll());
		
		UserService userService = UserServiceFactory.getUserService();
		User user = userService.getCurrentUser();
		if (user != null) {
			result.setDoador(doadorDao.findByEmail(user.getEmail()));
		}
		
		return result;
	}
	
	@POST
	@Path("/adotarsonho/{id}")
	public ListaSonhos adotarSonho(@Context HttpServletRequest request, @PathParam("id") Long id) {
		UserService userService = UserServiceFactory.getUserService();
		User user = userService.getCurrentUser();
		if (user != null) {
			Sonho sonho = sonhoDao.findById(id);
			sonho.setComprado(true);
			Doador doador = doadorDao.findByEmail(user.getEmail());
			doador.getSonhos().add(sonho);
			doadorDao.insert(doador); // atualizando o doador
			
			ListaSonhos result = new ListaSonhos();
			result.setSonhos(sonhoDao.findAll());
			result.setDoador(doador);
			
			return result;
		}
		
		return null;
	}
	
}