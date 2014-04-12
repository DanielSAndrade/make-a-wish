package com.ciandt.hackathon.resources;

import java.io.IOException;
import java.util.Date;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciandt.hackathon.dao.ComprasDAO;
import com.ciandt.hackathon.entity.Compras;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class SignGuestbookServlet extends HttpServlet {
    
	private static final long serialVersionUID = 2800778962458456034L;
	
	@Inject
	private Logger log;
	
	@Inject
	private ComprasDAO dao;

    public void doPost(HttpServletRequest req, HttpServletResponse resp)
                throws IOException {
        UserService userService = UserServiceFactory.getUserService();
        User user = userService.getCurrentUser();

        String produto = req.getParameter("produto");
        String valor = req.getParameter("valor");
        if (produto == null) {
        	produto = "Viagem";
        }
        if (valor == null) {
        	valor = "20.000";
        }
        if (user == null) {
        	resp.sendRedirect("/_ah/login?continue=%2Fcompras");
        }
        
        Date date = new Date();
        Double valorDouble = new Double(valor);
        Compras compras = new Compras(user, produto, date, valorDouble);
        dao.insert(compras);
        
        resp.sendRedirect("/compras");
    }
}