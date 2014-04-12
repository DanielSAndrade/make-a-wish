package com.ciandt.hackathon.resources;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciandt.hackathon.dao.ParticipanteDoacaoDAO;
import com.ciandt.hackathon.entity.ParticipanteDoacao;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("serial")
@Singleton
public class NovaDoacaoServlet extends HttpServlet {

	@Inject
	private ParticipanteDoacaoDAO participanteDoacaoDao;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String strIdParticipante = req.getParameter("idParticipante");
		String strIdSonho = req.getParameter("idSonho");
		Long idParticipante = Long.parseLong(strIdParticipante);
		Long idSonho = Long.parseLong(strIdSonho);
		
		ParticipanteDoacao participanteDoacao = new ParticipanteDoacao(null,idParticipante,idSonho);
		participanteDoacaoDao.insert(participanteDoacao);
		
		req.getRequestDispatcher("/voluntario.jsp").forward(req, resp);
	}
}
