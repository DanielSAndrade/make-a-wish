package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Participante;

public interface ParticipanteDAO {

	List<Participante> findParticipantes();

	Long insert(Participante participante);

	void delete(Participante participante);

	Participante find(Long id);

	void update(Participante participante);

}
