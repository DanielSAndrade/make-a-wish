package com.ciandt.hackathon.resources;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciandt.hackathon.dao.ParticipanteDAO;
import com.ciandt.hackathon.dao.SonhoDAO;
import com.ciandt.hackathon.entity.Mesa;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("serial")
@Singleton
public class DesafioServlet extends HttpServlet {
	
	@Inject
	private SonhoDAO sonhoDAO;
	
	@Inject
	private ParticipanteDAO participanteDAO;
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		req.setAttribute("sonhos", sonhoDAO.findSonhos());
		req.setAttribute("participantes", participanteDAO.findParticipantesMesa(new Mesa(2L)));
		req.getRequestDispatcher("/mesa/desafio.jsp").forward(req, resp);
	}

}
