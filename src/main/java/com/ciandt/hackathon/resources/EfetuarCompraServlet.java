package com.ciandt.hackathon.resources;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciandt.hackathon.dao.CompraDAO;
import com.ciandt.hackathon.entity.Compra;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class EfetuarCompraServlet extends HttpServlet {
    
	private static final long serialVersionUID = 2800778962458456034L;
	
	@Inject
	private Logger log;
	
	@Inject
	private CompraDAO dao;

    public void doPost(HttpServletRequest req, HttpServletResponse resp)
                throws IOException {
    	
    	String idProduto = (String)req.getParameter("idProduto");
		String valorCompra = (String)req.getParameter("valor");
		String idParticipante = (String)req.getParameter("idParticipante");
		
		System.out.println(idProduto);
		System.out.println(valorCompra);
		System.out.println(idParticipante);
		
		if (idProduto != null && valorCompra != null && idParticipante != null){
			System.out.println("Criando nova compra");
			Compra compra = new Compra();
			dao.insert(compra);
			
			System.out.println("COMPRA inserida !!");
			
		}else{
			System.err.println("##############Parametros nulos");
		}
        
        resp.sendRedirect("/guestbook");
    }
}