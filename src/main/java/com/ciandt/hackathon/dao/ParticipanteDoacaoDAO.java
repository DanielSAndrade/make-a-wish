package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.ParticipanteDoacao;

public interface ParticipanteDoacaoDAO {

	public List<ParticipanteDoacao> findDoacoes();

	public Long insert(ParticipanteDoacao doacao);
}
