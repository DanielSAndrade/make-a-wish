package com.ciandt.hackathon.business;

import static com.ciandt.hackathon.entity.enumx.BadgeEnum.BRONZE;
import static com.ciandt.hackathon.entity.enumx.BadgeEnum.OURO;
import static com.ciandt.hackathon.entity.enumx.BadgeEnum.PRATA;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ciandt.hackathon.entity.Badge;
import com.ciandt.hackathon.entity.Mesa;
import com.ciandt.hackathon.entity.Pontuacao;
import com.ciandt.hackathon.entity.enumx.BadgeEnum;

public class ContabilBadgeTest {

	private ContabilBadge contabilBadge;

	@Before
	public void setUp() {
		this.contabilBadge = new ContabilBadge();
	}

	@Test
	public void verificarBadgeComPontosInsuficientes() {
		Mesa mesaTest = new Mesa();
		Pontuacao pontuacao = this.createPontuacao(mesaTest, 60L);

		List<Badge> badgesConquistados = this.contabilBadge
				.calcularBadge(pontuacao);

		assertThat(badgesConquistados.size(), is(0));
	}

	@Test
	public void verificarBadgeOuro() {
		Mesa mesaTest = new Mesa();
		Pontuacao pontuacao = this.createPontuacao(mesaTest, 310L);

		List<Badge> badgesConquistados = this.contabilBadge
				.calcularBadge(pontuacao);

		assertThat(badgesConquistados.size(), is(3));
		assertThat(badgesConquistados.get(0).getId(), is(BRONZE.getId()));
		assertThat(badgesConquistados.get(1).getId(), is(PRATA.getId()));
		assertThat(badgesConquistados.get(2).getId(), is(OURO.getId()));
	}

	@Test
	public void verificarBadgePrata() {
		Mesa mesaTest = new Mesa();
		Pontuacao pontuacao = this.createPontuacao(mesaTest, 242L);

		List<Badge> badgesConquistados = this.contabilBadge
				.calcularBadge(pontuacao);

		assertThat(badgesConquistados.size(), is(2));
		assertThat(badgesConquistados.get(0).getId(), is(BRONZE.getId()));
		assertThat(badgesConquistados.get(1).getId(), is(PRATA.getId()));
	}

	@Test
	public void verificarBadgeBronze() {
		Mesa mesaTest = new Mesa();
		Pontuacao pontuacao = this.createPontuacao(mesaTest, 120L);

		List<Badge> badgesConquistados = this.contabilBadge
				.calcularBadge(pontuacao);

		assertThat(badgesConquistados.size(), is(1));
		assertThat(badgesConquistados.get(0).getId(), is(BRONZE.getId()));
	}

	private Pontuacao createPontuacao(Mesa mesa, Long numeroPontos) {
		Pontuacao pontuacao = new Pontuacao();
		pontuacao.setNumeroPontos(numeroPontos);
		pontuacao.setMesa(mesa);
		return pontuacao;
	}
}
