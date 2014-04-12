package com.ciandt.hackathon.resources;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciandt.hackathon.dao.SonhoDAO;
import com.ciandt.hackathon.entity.Crianca;
import com.ciandt.hackathon.entity.Sonho;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("serial")
@Singleton
public class MesaServlet extends HttpServlet {
	
	@Inject
	private Logger log;
	
	@Inject
	private SonhoDAO sonhoDAO;
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		List<Sonho> sonhos = sonhoDAO.findSonhos();
		
		if(sonhos.isEmpty()){
			loadSonhos();
			sonhos = sonhoDAO.findSonhos();
		}
		
		req.setAttribute("sonhos", sonhos);
		req.getRequestDispatcher("/mesa/index.jsp").forward(req, resp);
	}

	private void loadSonhos() {
		log.fine("loadSonhos a new Sonho");
		sonhoDAO.insert(new Sonho(new Crianca("Caio Oliveira"), "Viagem para fernando de noronha"));
		sonhoDAO.insert(new Sonho(new Crianca("Rodrigo Dantas"), "Comprar uma BMW"));
		sonhoDAO.insert(new Sonho(new Crianca("Caio Oliveira"), "Viagem para fernando de noronha"));
		sonhoDAO.insert(new Sonho(new Crianca("Rodrigo Dantas"), "Comprar uma BMW"));
	}
}
