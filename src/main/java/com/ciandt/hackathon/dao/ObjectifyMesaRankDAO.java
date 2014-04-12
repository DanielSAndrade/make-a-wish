package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import com.ciandt.hackathon.entity.MesaRank;
import com.googlecode.objectify.Key;

public class ObjectifyMesaRankDAO implements MesaRankDAO {

	/* (non-Javadoc)
	 * @see com.ciandt.hackathon.dao.MesaRankDAO#get(long)
	 */
	@Override
	public MesaRank get(long id) {
		return (MesaRank) ofy().load().type(MesaRank.class).id(id).now();
	}
	
	@Override
	public Long insert(MesaRank mesaRank) {
		Key<MesaRank> key = ofy().save().entity(mesaRank).now();
		return key.getId();
	}
}
