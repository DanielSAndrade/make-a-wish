package com.ciandt.hackathon.service;

import java.util.List;

import com.ciandt.hackathon.dao.UsuarioDAO;
import com.ciandt.hackathon.entity.Usuario;
import com.google.inject.Inject;
import com.googlecode.objectify.Key;

public class UsuarioService {

	@Inject
	private UsuarioDAO usuarioDAO;
	
	public Usuario buscarUsuarioPorUserId(String userId) {
		return usuarioDAO.buscarUsuarioPorUserId(userId);
	}

	public boolean login(String userId, String password) {
		Usuario usuario = buscarUsuarioPorUserId(userId);
		
		if(usuario != null && password != null){
			return password.equals(usuario.getPassword());
		}
		else
			return false;
	}
	
	public List<Usuario> buscarUsuarios() {
		return usuarioDAO.buscarUsuarios();
	}
	
	public Usuario buscarUsuarioPorId(Key<Usuario> key) {
		return usuarioDAO.buscarUsuarioPorId(key);
	}
	
	public Usuario buscarUsuarioPorId(Long id) {
		return usuarioDAO.buscarUsuarioPorId(id);
	}
	
	public Long insert(Usuario usuario) {
		return usuarioDAO.insert(usuario);
	}
	
	public void update(Usuario usuario) {
		usuarioDAO.update(usuario);
	}
	
	public void delete(Usuario usuario) {
		usuarioDAO.delete(usuario);
	}	
}
