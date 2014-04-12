package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Desafio;

public interface DesafioDAO {

	public List<Desafio> findDesafios();

	public Desafio find(Long id);

}
