package com.ciandt.hackathon.resources;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Singleton;

@SuppressWarnings("serial")
@Singleton
public class RecompensaServlet extends HttpServlet {
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		
		req.getRequestDispatcher("/recompensa/index3.jsp").forward(req, resp);
	}
}
