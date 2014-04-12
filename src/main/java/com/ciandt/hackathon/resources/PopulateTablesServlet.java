package com.ciandt.hackathon.resources;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciandt.hackathon.dao.WishDAO;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("serial")
@Singleton
public class PopulateTablesServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Inject

    public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		
	}

	
}
