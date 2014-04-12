package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import com.ciandt.hackathon.entity.Table;
import com.google.inject.Singleton;

@Singleton
public class ObjectifyTableDAO implements TableDAO {

	@Override
	public void saveOrUpdate(Table table) {
		ofy().save().entities(table);
	}

	@Override
	public void deleteAll() {
		ofy().delete().entities(ofy().load().type(Table.class).list());
	}
}
