package com.ciandt.hackathon.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Mesa {

	@Id
	private Long id;
	
	private String nome;
	
	public Mesa(){}

	public Mesa(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Mesa(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
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

}
