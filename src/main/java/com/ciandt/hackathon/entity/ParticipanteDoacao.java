package com.ciandt.hackathon.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class ParticipanteDoacao {

	@Id
	private Long id;
	
	private Long idParticipante;
	
	private Long idDoacao;
	
	public ParticipanteDoacao(Long id, Long idParticipante, Long idDoacao) {
		super();
		this.id = id;
		this.idParticipante = idParticipante;
		this.idDoacao = idDoacao;
	}
	
	public ParticipanteDoacao(){}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdParticipante() {
		return idParticipante;
	}

	public void setIdParticipante(Long Participante) {
		this.idParticipante = Participante;
	}

	public Long getIdDoacao() {
		return idDoacao;
	}

	public void setIdDoacao(Long idDoacao) {
		this.idDoacao = idDoacao;
	}

}
