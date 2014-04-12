package com.ciandt.hackathon.resources;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciandt.hackathon.dao.BadgeDAO;
import com.ciandt.hackathon.dao.DoadorDao;
import com.ciandt.hackathon.dao.DoadorProdutoDao;
import com.ciandt.hackathon.dao.MesaDAO;
import com.ciandt.hackathon.dao.ProdutoDao;
import com.ciandt.hackathon.dao.SonhoDAO;
import com.ciandt.hackathon.entity.Badge;
import com.ciandt.hackathon.entity.Mesa;
import com.ciandt.hackathon.entity.Sonho;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("serial")
@Singleton
public class LoadServlet extends HttpServlet {

	@Inject
	private Logger log;

	@Inject
	private ProdutoDao produtoDao;
	@Inject
	private SonhoDAO sonhoDao;
	@Inject
	private BadgeDAO badgeDao;
	@Inject
	private MesaDAO mesaDao;
	@Inject
	private DoadorDao doadorDao;
	@Inject
	private DoadorProdutoDao doadorProdutoDao;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {

		// carregando os dados da aplicacao
		loadBadges();
		loadMesas();
		loadSonhos();
		
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, this is a testing servlet. \n\n");

	}

	private void loadSonhos() {
		sonhoDao.insert(new Sonho("delorian", "quero ganhar um delorian e viajar no tempo", "Pequeno Brown", false));
		sonhoDao.insert(new Sonho("voight", "quero uma maquina voight kampff", "Ford", false));
		sonhoDao.insert(new Sonho("boneca", "quero uma boneca controle remoto com arduino", "Ada Byron", false));
	}

	private void loadMesas() {
		for (int i = 0; i < 10; i++) 
			mesaDao.insert(new Mesa(i, 0));
	}

	private void loadBadges() {
		badgeDao.insert(new Badge("coracao de bronze", 10L));
		badgeDao.insert(new Badge("coracao de prata", 100L));
		badgeDao.insert(new Badge("coracao de ouro", 1000L));
		badgeDao.insert(new Badge("black diamond", 10000L));
	}

}
