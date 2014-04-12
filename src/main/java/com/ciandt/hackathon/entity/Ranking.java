package com.ciandt.hackathon.entity;

import java.util.List;

public class Ranking implements Comparable<Ranking>{
	
	private Long mesa;
	private Double pontos;
	private List<Badge> badges;

	public Long getMesa() {
		return mesa;
	}
	
	public void setMesa(Long mesa) {
		this.mesa = mesa;
	}
	
	public Double getPontos() {
		return pontos;
	}
	
	public void setPontos(Double pontos) {
		this.pontos = pontos;
	}
	
	public List<Badge> getBadges() {
		return badges;
	}
	
	public void setBadges(List<Badge> badges) {
		this.badges = badges;
	}
	
	@Override
	public int compareTo(Ranking o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
