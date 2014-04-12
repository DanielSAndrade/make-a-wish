/**
 * 
 */
package com.ciandt.hackathon.entity;

import java.util.List;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

/**
 * @author Amanda
 * 
 */
@Entity
public class Doador {

	@Id
	private Long id;

	private String nome;

	private List<Sonho> sonhos;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the sonhos
	 */
	public List<Sonho> getSonhos() {
		return sonhos;
	}

	/**
	 * @param sonhos
	 *            the sonhos to set
	 */
	public void setSonhos(List<Sonho> sonhos) {
		this.sonhos = sonhos;
	}

}
