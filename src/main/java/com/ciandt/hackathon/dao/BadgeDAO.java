package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Badge;

public interface BadgeDAO {
	public Long insert(Badge badge);
	public void delete(Badge badge);
	public List<Badge> findByPontuacao(Long pontuacao);
	public List<Badge> findAll();
}
