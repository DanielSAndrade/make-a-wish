package com.ciandt.hackathon.api;

import java.util.List;
import java.util.logging.Logger;

import javax.annotation.concurrent.ThreadSafe;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.ciandt.hackathon.dao.DonatorDAO;
import com.ciandt.hackathon.dao.TableDAO;
import com.ciandt.hackathon.entity.Table;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Path("/ranking")
@ThreadSafe
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Singleton
public class RankingResource {

	@Inject
	private Logger log;
	
	private final DonatorDAO donatorDAO;
	private final TableDAO tableDAO;

	@Inject
	public RankingResource(TableDAO tableDAO, DonatorDAO donatorDAO) {
		super();
		this.tableDAO = tableDAO;
		this.donatorDAO = donatorDAO; 
	}

	@GET
	@Path("/listTables")
	public List<Table> listTables(@Context HttpServletRequest request) {
		List<Table> listTables = tableDAO.findTables();
		return listTables;
	}

}
