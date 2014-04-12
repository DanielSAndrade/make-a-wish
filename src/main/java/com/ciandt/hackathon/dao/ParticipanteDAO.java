package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Mesa;
import com.ciandt.hackathon.entity.Participante;

public interface ParticipanteDAO {
	
	public List<Participante> findParticipantes();
	
	public List<Participante> findParticipantesMesa(Mesa mesa);
	
	public Long insert( Participante participante );
	
}
