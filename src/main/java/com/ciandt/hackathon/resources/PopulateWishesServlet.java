package com.ciandt.hackathon.resources;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciandt.hackathon.dao.WishDAO;
import com.ciandt.hackathon.entity.Wish;
import com.ciandt.hackathon.entity.Wish.Status;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("serial")
@Singleton
public class PopulateWishesServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private WishDAO dao;
	
    public void doGet(HttpServletRequest req, HttpServletResponse resp) {
    	insertWish(new Long(1), "Maria",    10, "Doença 1", "Televisão", Status.AVAILABLE, "Mesa " + 1, 0);
    	insertWish(new Long(2), "João",     9,  "Doença 2", "Guitarra",  Status.AVAILABLE, "Mesa " + 2, 0);
    	insertWish(new Long(3), "Marcelo",  11, "Doença 3", "Guitarra",  Status.AVAILABLE, "Mesa " + 3, 0);
    	insertWish(new Long(4), "Luciana",  13, "Doença 4", "Guitarra",  Status.AVAILABLE, "Mesa " + 4, 0);
    	
    	insertWish(new Long(1), "Maria",    10, "Doença 1", "Computador", Status.REALIZED, "Mesa " + 1, 0);
    	insertWish(new Long(2), "João",     9,  "Doença 2", "Viagem para a Praia",  Status.REALIZED, "Mesa " + 2, 0);
    	insertWish(new Long(3), "Marcelo",  11, "Doença 3", "Violao",  Status.REALIZED, "Mesa " + 3, 0);
    	insertWish(new Long(4), "Luciana",  13, "Doença 4", "Conhecer jogador de futebol",  Status.REALIZED, "Mesa " + 4, 0);
    	
    	insertWish(new Long(1), "Maria",    10, "Doença 1", "Televisão", Status.INTENDED, "Mesa " + 1, 0);
    	insertWish(new Long(2), "João",     9,  "Doença 2", "Guitarra",  Status.INTENDED, "Mesa " + 2, 0);
    	insertWish(new Long(3), "Marcelo",  11, "Doença 3", "Computador",  Status.INTENDED, "Mesa " + 3, 0);
    	insertWish(new Long(4), "Luciana",  13, "Doença 4", "Celular",  Status.INTENDED, "Mesa " + 4, 0);
    	
    	insertWish(new Long(1), "Maria",    10, "Doença 1", "Conhecer ator", Status.PRESENTED, "Mesa " + 1, 0);
    	insertWish(new Long(2), "João",     9,  "Doença 2", "Ir para a disney",  Status.PRESENTED, "Mesa " + 2, 0);
    	insertWish(new Long(3), "Marcelo",  11, "Doença 3", "Roupas",  Status.PRESENTED, "Mesa " + 3, 0);
    	insertWish(new Long(4), "Luciana",  13, "Doença 4", "Maquiagem",  Status.PRESENTED, "Mesa " + 4, 0);
    }
    
    private void insertWish(Long id, String childName, int childAge, String disease,
			String wish, Status status, String intendedTable, int donator) {
    	Wish newwish = new Wish(id, childName, childAge, disease,
    			wish, status, intendedTable, donator);
    	dao.insert(newwish);
    }

}
