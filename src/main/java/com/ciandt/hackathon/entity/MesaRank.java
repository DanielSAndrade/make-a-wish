package com.ciandt.hackathon.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
public class MesaRank {

	@Id
	public Long numeroDaMesa;
	
	@Index
	public double valor = 0D;

	public Long getNumeroDaMesa() {
		return numeroDaMesa;
	}

	public void setNumeroDaMesa(Long numeroDaMesa) {
		this.numeroDaMesa = numeroDaMesa;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void acumulaValor(double valor) {
		this.valor += valor; 
	}
	
}
