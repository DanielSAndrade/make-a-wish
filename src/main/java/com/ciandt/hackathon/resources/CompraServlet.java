package com.ciandt.hackathon.resources;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciandt.hackathon.dao.CompraDAO;
import com.ciandt.hackathon.entity.Compra;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("serial")
@Singleton
public class CompraServlet extends HttpServlet {
	
	@Inject 
	private CompraDAO compraDao;
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		
		Compra compra = new Compra();
		
		compraDao.insert(compra);
		
	}
	
}
