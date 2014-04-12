package com.ciandt.hackathon.resources;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("serial")
@Singleton
public class MesaServlet extends HttpServlet {

	@Inject
	private Logger logger;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {

		req.getRequestDispatcher("/mesas.jsp").forward(req, resp);
	}

}
