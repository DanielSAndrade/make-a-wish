package com.ciandt.hackathon.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class TipoDoacao {

	@Id
	private Long id;
	
	
	public Long getId() {
		return id;
	}

	public TipoDoacao() {}
	
	public TipoDoacao(Long id, String nome) {
		setId(id);
		setNome(nome);
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	private String nome;
}
