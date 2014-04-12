package com.ciandt.hackathon.resources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciandt.hackathon.dao.ComprasDAO;
import com.ciandt.hackathon.entity.Compras;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("serial")
@Singleton
public class GuestbookServlet extends HttpServlet {

	@Inject
	private ComprasDAO comprasDao;

	@Inject
	private Logger logger;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {

		logger.info("Executing ComprasServlet");

		// read compras
		List<Compras> compras = comprasDao.findCompras();
		Double totalPreco = 0d;
		for(Compras c : compras){
			totalPreco = totalPreco + c.getValor();
		}
		req.setAttribute("totalCompras", totalPreco);
		req.setAttribute("compras", compras);
		
		List<TopTop> topMesas = getTopMesas(compras);
		
		req.setAttribute("topMesas", topMesas);
		req.setAttribute("topCompradores", getTopCompradores(compras));
		req.setAttribute("comprasSize", compras.size());
		logger.info("Putting " + compras.size() + " compras in memory");

		// read user context
		UserService userService = UserServiceFactory.getUserService();
		User user = userService.getCurrentUser();
		if (user != null) {
			req.setAttribute("userAuthenticated", "true");
			req.setAttribute("nickname", user.getNickname());
			req.setAttribute("logoutURL",
					userService.createLogoutURL(req.getRequestURI()));
			
			
			for(TopTop tt : topMesas){
				if(tt.getName().equalsIgnoreCase(user.getNickname())){
					req.setAttribute("mesaPontos", tt.getPontos());
					break;
				}
			}
		} else {
			req.setAttribute("userAuthenticated", "false");
			req.setAttribute("loginURL",
					userService.createLoginURL(req.getRequestURI()));
		}

		req.getRequestDispatcher("/compras.jsp").forward(req, resp);
	}

	private List<TopTop> getTopMesas(List<Compras> compras) {

		Map<String, TopTop> mapMesas = new HashMap<String, TopTop>();

		List<Integer> list = new ArrayList<Integer>();

		for (Compras compra : compras) {

			TopTop tt;
			tt = mapMesas.get(compra.getMesa().getNickname());

			if (tt == null) {
				tt = new TopTop();
				tt.setName(compra.getMesa().getNickname());
				tt.setValor(compra.getValor());
				tt.setPontos(compra.getValor().intValue());

				mapMesas.put(compra.getComprador(), tt);
			} else {
				int pontos = compra.getValor().intValue();
				tt.setPontos(tt.getPontos() + pontos);
				tt.setValor(tt.getValor() + compra.getValor());
			}
		}

		for (TopTop tt : mapMesas.values()) {
			if (tt.getPontos() > 5000) {
				tt.setPoder(Poder.nivel4);
			} else if (tt.getPontos() > 1500) {
				tt.setPoder(Poder.nivel3);
			} else if (tt.getPontos() > 500) {
				tt.setPoder(Poder.nivel2);
			} else if (tt.getPontos() > 100) {
				tt.setPoder(Poder.nivel1);
			}

			list.add(tt.getPontos());

		}

		Collections.sort(list);
		Collections.reverse(list);
		LinkedList<TopTop> listReturn = new LinkedList<TopTop>();

		for (int i = 0; i < 5; i++) {
			int valor = list.get(i);

			for (TopTop tt : mapMesas.values()) {
				if (valor == tt.getPontos()) {
					listReturn.add(tt);
				}
			}

		}

		return listReturn;

	}

	private List<TopTop> getTopCompradores(List<Compras> compras) {

		Map<String, TopTop> mapCompradores = new HashMap<String, TopTop>();

		List<Integer> list = new ArrayList<Integer>();

		for (Compras compra : compras) {

			TopTop tt;
			tt = mapCompradores.get(compra.getComprador());

			if (tt == null) {
				tt = new TopTop();
				tt.setName(compra.getComprador());
				tt.setValor(compra.getValor());
				tt.setPontos(compra.getValor().intValue());
			} else {
				int pontos = compra.getValor().intValue();
				tt.setPontos(tt.getPontos() + pontos);
				tt.setValor(tt.getValor() + compra.getValor());

				mapCompradores.put(compra.getComprador(), tt);
			}
		}

		for (TopTop tt : mapCompradores.values()) {
			if (tt.getPontos() > 5000) {
				tt.setPoder(Poder.nivel4);
			} else if (tt.getPontos() > 1500) {
				tt.setPoder(Poder.nivel3);
			} else if (tt.getPontos() > 500) {
				tt.setPoder(Poder.nivel2);
			} else if (tt.getPontos() > 100) {
				tt.setPoder(Poder.nivel1);
			}

			list.add(tt.getPontos());
		}

		Collections.sort(list);
		Collections.reverse(list);
		LinkedList<TopTop> listReturn = new LinkedList<TopTop>();

		for (int i = 0; i < 5; i++) {
			int valor = list.get(i);

			for (TopTop tt : mapCompradores.values()) {
				if (valor == tt.getPontos()) {
					listReturn.add(tt);
				}
			}

		}

		return listReturn;

	}
}
