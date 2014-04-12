package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Sonho;

public interface SonhoDAO {
	public List<Sonho> findAll();
	public Long insert(Sonho sonho);
	public void delete(Sonho sonho);
	public Sonho findById(Long id);
}