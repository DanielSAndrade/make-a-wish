package com.ciandt.hackathon.business;

import org.junit.Test;

import com.ciandt.hackathon.test.AbstractTestClass;

public abstract class VisualizadorTest extends AbstractTestClass {

	private Visualizador visualizador;

	@Override
	public void setup() {
		this.visualizador = new Visualizador();
	}

	@Test
	public void chechListItens() {
		this.visualizador.findItens();
	}

}
