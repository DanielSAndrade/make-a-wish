package com.ciandt.hackathon.domain.model;

import java.util.List;

import com.googlecode.objectify.Key;

public interface FooRepository {

	Key<Foo> put(final Foo foo);
	
	Foo get(final String webSafeKey);
	
	void delete(Foo foo);
	
	List<Foo> list();
	
		
	
}
