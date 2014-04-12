package com.ciandt.hackathon.resources;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciandt.hackathon.dao.DonatorDAO;
import com.ciandt.hackathon.dao.TableDAO;
import com.ciandt.hackathon.entity.Donator;
import com.ciandt.hackathon.entity.Table;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("serial")
@Singleton
public class PopulateTablesServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private TableDAO dao;

	@Inject
	private DonatorDAO donatorDao;


	@Inject
    public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		insertTable(new Long(1), "Mesa 1", 12, 1);
		insertTable(new Long(2), "Mesa 2", 20, 5);
		insertTable(new Long(3), "Mesa 3", 17, 2);
		insertTable(new Long(4), "Mesa 4", 11, 0);

		insertDonator("donator1@gmail.com", "Doador 1", 12, 15, new Long(1));
		insertDonator("donator2@gmail.com", "Doador 2", 12, 15, new Long(1));
		insertDonator("donator3@gmail.com", "Doador 3", 12, 15, new Long(2));
		insertDonator("donator4@gmail.com", "Doador 4", 12, 15, new Long(2));		
	}
	
    private void insertTable(Long id, String name, int points, int badges) {
    	Table newtable = new Table(id, name, points, badges);
    	dao.insert(newtable);
    }
    
    private void insertDonator(String login, String name, int points, int badges, Long table) {
    	Donator donator = new Donator(login, name, points, badges, table);
    	donatorDao.insert(donator);
    }

	
}
