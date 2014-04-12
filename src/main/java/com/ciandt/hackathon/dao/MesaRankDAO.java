package com.ciandt.hackathon.dao;

import com.ciandt.hackathon.entity.MesaRank;

public interface MesaRankDAO {

	public abstract MesaRank get(long id);
	public Long insert(MesaRank mesaRank);
}