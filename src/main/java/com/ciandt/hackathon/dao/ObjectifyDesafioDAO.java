package com.ciandt.hackathon.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.ciandt.hackathon.entity.Desafio;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class ObjectifyDesafioDAO implements DesafioDAO {

	private static final List<Desafio> DESAFIOS = createMock();

	@Inject
	private Logger log;

	@Override
	public List<Desafio> findDesafios() {
		log.info("Finding all Desafio");
		return DESAFIOS;
	}

	@Override
	public Desafio find(Long id) {
		log.info("Finding desafio");
		Desafio desafio = null;
		for (Desafio d : DESAFIOS) {
			if (d.getId() == id) {
				desafio = d;
				break;
			}
		}

		if (desafio != null) {
			log.info("Returning desafio [" + desafio.getNome() + "]");
		}
		return desafio;
	}

	private static List<Desafio> createMock() {
		List<Desafio> desafios = new ArrayList<Desafio>();

		desafios.add(createDesafio(
				1L,
				"Balao de prata",
				"Balao de prata",
				"http://www.valedasfestas.com.br/media/catalog/product/cache/1/image/5e06319eda06f020e43594a9c230972d/b/a/balao_estrela_prata.jpg"));
		desafios.add(createDesafio(
				2L,
				"Balao de ouro",
				"Balao de ouro",
				"http://www.mcamicado.com/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/o/u/ouro_2_1.jpg"));
		desafios.add(createDesafio(
				3L,
				"Balao de natal",
				"Balao de prata",
				"https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcR98pJUdFwgM1ZseTVNuz-ZJKnwWTRF_tOOT3nPMZeFEMweqrVm"));

		return desafios;
	}

	private static Desafio createDesafio(Long id, String nome,
			String descricao, String foto) {
		Desafio desafio = new Desafio();

		desafio.setId(id);
		desafio.setNome(nome);
		desafio.setDescricao(descricao);
		desafio.setFoto(foto);

		return desafio;
	}
}
