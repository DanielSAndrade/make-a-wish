package com.ciandt.hackathon.vo;

import com.ciandt.hackathon.entity.Mesa;

public class Ranking {

	private long posicao;
	
	private Mesa mesa;

	public long getPosicao() {
		return posicao;
	}

	public void setPosicao(long posicao) {
		this.posicao = posicao;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
	
}
