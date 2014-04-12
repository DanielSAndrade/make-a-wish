package com.ciandt.hackathon.resources;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EfetuarCompraServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int codigo = Integer.parseInt(request.getParameter("codigo"));
		int quantidade = Integer.parseInt(request.getParameter("quantidade"));
		
		System.out.println("Codigo: " + codigo);
		System.out.println("Quantidade: " + quantidade);
		
	}

}
