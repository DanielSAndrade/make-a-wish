package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;
import java.util.logging.Logger;

import com.ciandt.hackathon.entity.Usuario;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.googlecode.objectify.Key;

@Singleton
public class UsuarioDAO {

	@Inject
	private Logger log;

	public List<Usuario> buscarUsuarios() {
		log.info("Buscando todos os usuarios");

		List<Usuario> usuarios = ofy().load().type(Usuario.class).list();
		
		return usuarios;
	}

	public Usuario buscarUsuarioPorId(Key<Usuario> key) {
		log.info("Buscando usuario por id");

		Usuario usuario = ofy().load().key(key).now();

		return usuario;
	}

	public Usuario buscarUsuarioPorId(Long id) {

		return buscarUsuarioPorId(Key.create(Usuario.class, id));
	}

	public Usuario buscarUsuarioPorUserId(String userId) {
		return ofy().load().type(Usuario.class).filter("userId", userId)
				.first().now();
	}

	public Long insert(Usuario usuario) {
		log.info("Inserindo novo usuario");

		Key<Usuario> key = ofy().save().entity(usuario).now();
		return key.getId();
	}

	public void update(Usuario usuario) {
		log.info("Atualizando novo usuario");

		ofy().save().entity(usuario).now();
	}

	public void delete(Usuario usuario) {
		log.info("Deletando usuario");
		ofy().delete().entity(usuario).now();
	}

}
