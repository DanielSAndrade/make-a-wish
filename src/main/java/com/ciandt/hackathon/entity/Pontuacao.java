package com.ciandt.hackathon.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pontuacao {

	private Long id;

	private Mesa mesa;

	private Long numeroPontos;

	@Id
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Long getNumeroPontos() {
		return numeroPontos;
	}

	public void setNumeroPontos(Long numeroPontos) {
		this.numeroPontos = numeroPontos;
	}

}
