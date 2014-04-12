package com.ciandt.hackathon.business;

import java.util.ArrayList;
import java.util.List;

import com.ciandt.hackathon.entity.Badge;
import com.ciandt.hackathon.entity.Mesa;
import com.ciandt.hackathon.entity.Pontuacao;
import com.ciandt.hackathon.entity.enumx.BadgeEnum;
import com.google.inject.Singleton;

@Singleton
public class ContabilBadge {

	public List<Badge> calcularBadge(Pontuacao pontuacao) {
		List<Badge> badgeConquistados = new ArrayList<>();
		Mesa mesa = pontuacao.getMesa();

		badgeConquistados.addAll(this.contabilizarBadgePorPontos(mesa, pontuacao));

		return badgeConquistados;
	}

	private List<Badge> contabilizarBadgePorPontos(Mesa mesa, Pontuacao pontuacao) {
		Long numeroPontos = pontuacao.getNumeroPontos();
		List<Badge> badgesConquistados = new ArrayList<Badge>();
		if (numeroPontos > 100) {
			badgesConquistados.add(this.findBadgeConquistado(BadgeEnum.BRONZE));
		}
		if (numeroPontos > 200) {
			badgesConquistados.add(this.findBadgeConquistado(BadgeEnum.PRATA));
		}
		if (numeroPontos > 300) {
			badgesConquistados.add(this.findBadgeConquistado(BadgeEnum.OURO));
		}
		return badgesConquistados;
	}

	private Badge findBadgeConquistado(BadgeEnum badgeEnum) {
		// XXX Aqui retorna o Badge da base.
		Badge badge = new Badge();
		badge.setId(badgeEnum.getId());
		return badge;
	}
}
