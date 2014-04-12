package com.ciandt.hackathon.resources;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.ServletException;
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

@SuppressWarnings("serial")
@Singleton
public class GuestbookServlet extends HttpServlet {
	
	@Inject
	private ComprasDAO comprasDao;
	
	@Inject
	private Logger logger;
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		
		logger.info( "Executing ComprasServlet" );
		
		//read compras
	    List<Compras> compras = comprasDao.findCompras();
		req.setAttribute( "compras", compras );
		req.setAttribute( "comprasSize", compras.size() );
		logger.info( "Putting " + compras.size() + " compras in memory" );
		
		//read user context
		UserService userService = UserServiceFactory.getUserService();
	    User user = userService.getCurrentUser();
	    if (user != null) {
	    	req.setAttribute("userAuthenticated", "true");
	    	req.setAttribute("nickname", user.getNickname());
	    	req.setAttribute("logoutURL", userService.createLogoutURL(req.getRequestURI()));	    	
	    } else {
	    	req.setAttribute("userAuthenticated", "false");
	    	req.setAttribute("loginURL", userService.createLoginURL(req.getRequestURI()));
	    }
		
		req.getRequestDispatcher("/compras.jsp").forward(req, resp);
	}
	
	
	private List<TopTop> getTopMesas(List<Compras> compras){
		
		Map<String, TopTop> mapMesas = new HashMap<String, TopTop>();
		
		for (Compras compra : compras) {
			
			TopTop tt;
			tt = mapMesas.get(compra.getMesa().getNickname());
			
			if(tt == null){
				tt = new TopTop();
				tt.setName(compra.getMesa().getNickname());
				tt.setValor(compra.getValor());
				tt.setPontos(compra.getValor().intValue());
			}else{
				int pontos = compra.getValor().intValue();
				tt.setPontos(tt.getPontos() + pontos);
				tt.setValor(tt.getValor() + compra.getValor());
			}
		}
		
		for (TopTop tt : mapMesas.values()) {
			if(tt.getPontos() > 5000){
				tt.setPoder(Poder.nivel4);
			}else if(tt.getPontos() > 1500){
				tt.setPoder(Poder.nivel3);
			}else if(tt.getPontos() > 500){
				tt.setPoder(Poder.nivel2);
			}else if(tt.getPontos() > 100){
				tt.setPoder(Poder.nivel1);
			}
			
			
			
		}
		//iterar em todas as compras
		//agrupar por mesas e qtde
		//ordenar 
		
		return null;
		
	}
}
