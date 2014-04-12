package com.ciandt.hackathon.comparator;

import java.util.Comparator;

import com.ciandt.hackathon.entity.Mesa;

/**
 * Classe utilizada para saber qual mesa tem mais ponto
 * @author roger
 *
 */
public class PontosMesaComparator implements Comparator<Mesa> {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Mesa mesa1, Mesa mesa2) {
		
		Long pontosMesa1=mesa1.getPontos();
		Long pontosMesa2=mesa2.getPontos();
		
		return pontosMesa1.compareTo(pontosMesa2);
	}

}
