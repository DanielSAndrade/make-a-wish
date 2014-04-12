package com.ciandt.hackathon.resources;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciandt.hackathon.dao.MesaDAO;
import com.ciandt.hackathon.dao.SonhoDAO;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("serial")
@Singleton
public class VoluntarioServlet extends HttpServlet {

	@Inject
	private MesaDAO mesaDao;

	@Inject
	private SonhoDAO sonhoDao;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {

		req.setAttribute("mesas", mesaDao.findMesas());
		req.setAttribute("sonhos", sonhoDao.findSonhos());

		req.getRequestDispatcher("/voluntario/voluntario.jsp").forward(req,
				resp);
	}
}
