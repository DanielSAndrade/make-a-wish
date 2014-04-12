package com.ciandt.hackathon.dao;

import com.ciandt.hackathon.entity.Desafio;
import com.ciandt.hackathon.entity.Greeting;
import com.ciandt.hackathon.entity.Mesa;
import com.ciandt.hackathon.entity.MesaDoacao;
import com.ciandt.hackathon.entity.Participante;
import com.ciandt.hackathon.entity.Sonho;
import com.ciandt.hackathon.entity.TipoDoacao;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;

public class OfyService {

	static {
		factory().register(Greeting.class);
		factory().register(Desafio.class);
		factory().register(Mesa.class);
		factory().register(MesaDoacao.class);
		factory().register(Participante.class);
		factory().register(Sonho.class);
		factory().register(TipoDoacao.class);
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
