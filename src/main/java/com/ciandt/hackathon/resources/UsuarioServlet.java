package com.ciandt.hackathon.resources;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.ciandt.hackathon.entity.Usuario;
import com.ciandt.hackathon.service.UsuarioService;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("serial")
@Singleton
public class UsuarioServlet extends HttpServlet {
	
	@Inject
	private UsuarioService usuarioService;
	
	@Inject
	private Logger logger;
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		
		try {

			String action = req.getParameter("action");
			
			if(action == null || action.equals(""))
				req.getRequestDispatcher("/usuario/list.jsp").forward(req, resp);

			if(action != null && action.equals("novo"))
				req.getRequestDispatcher("/usuario/novo.jsp").forward(req, resp);
			
			if(action != null && action.equals("criar")){
				Usuario usuario = new Usuario(); 
						
				BeanUtils.populate(usuario, req.getParameterMap());
				System.out.println("UsuarioServlet.doGet()" + BeanUtils.describe(usuario));
				
				req.getRequestDispatcher("/usuario/list.jsp").forward(req, resp);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
