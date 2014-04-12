package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Participante;

public interface ParticipanteDAO {
	
	public List<Participante> findParticipantes();
	
	public Long insert( Participante participante );
	
}
