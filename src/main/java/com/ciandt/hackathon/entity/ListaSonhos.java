package com.ciandt.hackathon.entity;

import java.util.List;

public class ListaSonhos {
	private Doador doador;
	private List<Sonho> sonhos;
	
	public Doador getDoador() {
		return doador;
	}
	public void setDoador(Doador doador) {
		this.doador = doador;
	}
	public List<Sonho> getSonhos() {
		return sonhos;
	}
	public void setSonhos(List<Sonho> sonhos) {
		this.sonhos = sonhos;
	}	
}
