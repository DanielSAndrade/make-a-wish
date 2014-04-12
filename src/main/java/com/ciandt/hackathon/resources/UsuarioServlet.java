package com.ciandt.hackathon.resources;

import java.io.IOException;
import java.util.List;

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
	
	// Tratamento de errros
	// Validação
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		
		try {

			String action = req.getParameter("action");
			
			if(action == null || action.equals("")){
				List<Usuario> usuarios = usuarioService.buscarUsuarios();
				req.setAttribute("usuarios", usuarios);
				
				req.getRequestDispatcher("/usuario/list.jsp").forward(req, resp);
			}

			if(action != null && action.equals("novo"))
				req.getRequestDispatcher("/usuario/novo.jsp").forward(req, resp);

			if(action != null && action.equals("editar")){
				Long id = Long.parseLong(req.getParameter("id"));
				Usuario usuario = usuarioService.buscarUsuarioPorId(id);
				
				req.setAttribute("usuario", usuario);
				
				req.getRequestDispatcher("/usuario/editar.jsp").forward(req, resp);
			}
			
			if(action != null && action.equals("remover")){
				Long id = Long.parseLong(req.getParameter("id"));
				Usuario usuario = usuarioService.buscarUsuarioPorId(id);
				
				usuarioService.delete(usuario);

				resp.sendRedirect("/usuario");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		
		try {

			String action = req.getParameter("action");
			
			if(action != null && action.equals("criar")){
				Usuario usuario = new Usuario(); 
						
				BeanUtils.populate(usuario, req.getParameterMap());
				
				usuarioService.insert(usuario);
				
				List<Usuario> usuarios = usuarioService.buscarUsuarios();
				req.setAttribute("usuarios", usuarios);
				req.getRequestDispatcher("/usuario/list.jsp").forward(req, resp);
			}
			
			if(action != null && action.equals("salvar")){
				Usuario usuario = new Usuario(); 
						
				BeanUtils.populate(usuario, req.getParameterMap());
				
				usuarioService.update(usuario);
				
				List<Usuario> usuarios = usuarioService.buscarUsuarios();
				req.setAttribute("usuarios", usuarios);
				req.getRequestDispatcher("/usuario/list.jsp").forward(req, resp);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
