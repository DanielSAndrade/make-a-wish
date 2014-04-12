package com.ciandt.hackathon.dao;

import com.ciandt.hackathon.entity.Badge;
import com.ciandt.hackathon.entity.Donator;
import com.ciandt.hackathon.entity.Greeting;
import com.ciandt.hackathon.entity.Table;
import com.ciandt.hackathon.entity.Wish;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;

public class OfyService {

	static {
		factory().register(Badge.class);
		factory().register(Donator.class);
		factory().register(Greeting.class);
		factory().register(Table.class);
		factory().register(Wish.class);
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
