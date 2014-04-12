package com.ciandt.hackathon.entity;

import com.googlecode.objectify.annotation.Entity;

@Entity
public class MesaDoacao {

	private Long id;
	
	private Long idMesa;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdMesa() {
		return idMesa;
	}

	public void setIdMesa(Long idMesa) {
		this.idMesa = idMesa;
	}

	public Long getIdDoacao() {
		return idDoacao;
	}

	public void setIdDoacao(Long idDoacao) {
		this.idDoacao = idDoacao;
	}

	private Long idDoacao;
}
