package com.ciandt.hackathon.resources;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciandt.hackathon.dao.GreetingDAO;
import com.ciandt.hackathon.entity.Greeting;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("serial")
@Singleton
public class GuestbookServlet extends HttpServlet {
	
	@Inject
	private GreetingDAO greetingDao;
	
	@Inject
	private Logger logger;
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		
		logger.info( "Executing GuestbookServlet" );
		
	    List<Greeting> greetings = greetingDao.findGreetings();
		req.setAttribute( "greetings", greetings );
		
		logger.info( "Putting " + greetings.size() + " greetings in memory" );
		
		req.getRequestDispatcher("/guestbook.jsp").forward(req, resp);
	}
}
