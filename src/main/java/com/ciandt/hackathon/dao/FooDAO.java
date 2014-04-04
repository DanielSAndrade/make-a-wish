package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Foo;
import com.googlecode.objectify.Key;

public interface FooDAO {

	Key<Foo> put(final Foo foo);
	
	Foo get(final String webSafeKey);
	
	void delete(Foo foo);
	
	List<Foo> list();
	
		
	
}
