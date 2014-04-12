package com.ciandt.hackathon.resources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
import com.ciandt.hackathon.entity.Doador;
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

		// limpa a base primeiro
		clearDatastore();

		// carregando os dados da aplicacao
		loadBadges();
		loadMesas();
		loadSonhos();
		loadDoadores();

		resp.setContentType("text/plain");
		resp.getWriter().println("database loaded. \n\n");

	}

	private void clearDatastore() {
		List<Badge> badges = badgeDao.findAll();
		for (Badge b : badges)
			badgeDao.delete(b);

		List<Mesa> mesas = mesaDao.findAll();
		for (Mesa mesa : mesas)
			mesaDao.delete(mesa);

		List<Sonho> sonhos = sonhoDao.findAll();
		for (Sonho sonho : sonhos)
			sonhoDao.delete(sonho);
	}

	private void loadSonhos() {
		sonhoDao.insert(new Sonho("Delorian",
				"Quero ganhar um delorian e viajar no tempo", "Pequeno Brown",
				false));
		sonhoDao.insert(new Sonho("Voight", "Quero uma maquina voight kampff",
				"Ford", false));
		sonhoDao.insert(new Sonho("Boneca",
				"Quero uma boneca controle remoto com Arduino", "Ada Byron",
				false));
	}

	private void loadMesas() {
		for (int i = 0; i < 10; i++)
			mesaDao.insert(new Mesa(i, 0));
	}

	private void loadBadges() {
		badgeDao.insert(new Badge("Coracao de bronze", 10L));
		badgeDao.insert(new Badge("Coracao de prata", 100L));
		badgeDao.insert(new Badge("Coracao de ouro", 1000L));
		badgeDao.insert(new Badge("Black diamond", 10000L));
	}

	private void loadDoadores() {
		List<Mesa> mesas = mesaDao.findAll();
		doadorDao.insert(new Doador("Mark Zuckerberg", mesas.get(0),
				new ArrayList<Sonho>(), new ArrayList<Badge>(), "mark@facebook.com"));
		doadorDao.insert(new Doador("Bill Gates", mesas.get(1),
				new ArrayList<Sonho>(), new ArrayList<Badge>(), "bill@gmail.com"));
		doadorDao.insert(new Doador("Carmen Miranda", mesas.get(2),
				new ArrayList<Sonho>(), new ArrayList<Badge>(), "cmiranda@gmail.com"));
		doadorDao.insert(new Doador("Tony Ramos", mesas.get(3),
				new ArrayList<Sonho>(), new ArrayList<Badge>(), "tony@hotmail.com"));
		doadorDao.insert(new Doador("Lilian Cabral", mesas.get(4),
				new ArrayList<Sonho>(), new ArrayList<Badge>(), "lily@gmail.com"));
		doadorDao.insert(new Doador("Silvio Santos", mesas.get(2),
				new ArrayList<Sonho>(), new ArrayList<Badge>(), "silvinho@sbt.com"));
	}

}
