/**
 * 
 */
package com.ciandt.hackathon.entity;

import java.util.List;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

/**
 * @author Amanda
 * 
 */
@Entity
public class Doador {

	@Id
	private Long id;

	@Index
	private String nome;

	@Index
	private Mesa mesa;

	private List<Sonho> sonhos;

	private List<Badge> bagdes;

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
	 * @return the mesa
	 */
	public Mesa getMesa() {
		return mesa;
	}

	/**
	 * @param mesa
	 *            the mesa to set
	 */
	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
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

	/**
	 * @return the bagdes
	 */
	public List<Badge> getBagdes() {
		return bagdes;
	}

	/**
	 * @param bagdes
	 *            the bagdes to set
	 */
	public void setBagdes(List<Badge> bagdes) {
		this.bagdes = bagdes;
	}

}
