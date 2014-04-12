package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Sonho;

public interface SonhoDAO {

	public List<Sonho> findSonhos();

	public Long insert(Sonho Sonho);
}
