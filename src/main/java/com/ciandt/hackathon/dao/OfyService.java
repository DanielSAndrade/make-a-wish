package com.ciandt.hackathon.dao;

import com.ciandt.hackathon.entity.Greeting;
import com.ciandt.hackathon.entity.Produto;
import com.ciandt.hackathon.entity.Usuario;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;

public class OfyService {

	static {
		factory().register(Greeting.class);
		factory().register(Produto.class); 
		factory().register(Usuario.class);  
	}

	/**
	 * Return the ofy correct transaction context.
	 * 
	 * @return Objectify
	 */
	public static Objectify ofy() {
		return ObjectifyService.ofy();
	}

	/**
	 * Return the ofy factory.
	 * 
	 * @return ObjectifyFactory
	 */
	public static ObjectifyFactory factory() {
		return ObjectifyService.factory();
	}
}
