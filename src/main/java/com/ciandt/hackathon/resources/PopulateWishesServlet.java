package com.ciandt.hackathon.resources;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciandt.hackathon.dao.GreetingDAO;
import com.ciandt.hackathon.dao.WishDAO;
import com.google.inject.Inject;

public class PopulateWishesServlet extends HttpServlet {

	@Inject
	private WishDAO dao;


	
    public void doGet(HttpServletRequest req, HttpServletResponse resp) {
    	
    }

	
}
