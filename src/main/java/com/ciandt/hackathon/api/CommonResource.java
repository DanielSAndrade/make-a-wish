package com.ciandt.hackathon.api;

import java.util.List;
import java.util.logging.Logger;

import javax.annotation.concurrent.ThreadSafe;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.ciandt.hackathon.dao.GreetingDAO;
import com.ciandt.hackathon.dao.TableDAO;
import com.ciandt.hackathon.dao.WishDAO;
import com.ciandt.hackathon.entity.Badge;
import com.ciandt.hackathon.entity.Donator;
import com.ciandt.hackathon.entity.Greeting;
import com.ciandt.hackathon.entity.Table;
import com.ciandt.hackathon.entity.Wish;
import com.ciandt.hackathon.entity.Wish.Status;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Path("/api")
@ThreadSafe
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Singleton
public class CommonResource {
	
	//parameters
	private final static String TABLE = "table";
	private final static String WISH_ID = "wish_id";	

	private final GreetingDAO greetingDAO;
	private final WishDAO wishDAO;
	private final TableDAO tableDAO;
	
	@Inject
	private Logger log;

	@Inject
	public CommonResource(GreetingDAO greetingDAO, WishDAO wishDAO, TableDAO tableDao) {
		super();
		this.greetingDAO = greetingDAO;
		this.wishDAO = wishDAO; 
		this.tableDAO = tableDao;
	}

	@GET
	@Path("/listGreetings")
	public List<Greeting> listGreetings(@Context HttpServletRequest request) {
		List<Greeting> listGreetings = greetingDAO.findGreetings();
		return listGreetings;
	}
	
	@GET
	@Path("/populateWishes")
    public void doGet(@Context HttpServletRequest request) {
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
    	wishDAO.insert(newwish);
    }

	@GET 
	@Path("/wishList")
	public List<Wish> wishList(@Context HttpServletRequest request) {
		// retornar a lista de wishes nao atendidos ate o momento
		// recebe opcionalmente a mesa e o tipo do wish que se deseja realizar
		
		Wish.Status status = Wish.Status.AVAILABLE;
		String tableName = request.getParameter(TABLE);
		
		List<Wish> wishList = null;
		
		if (tableName != null) {
			wishList = wishDAO.findWishes(tableName, status);
		}
		else {
			wishList = wishDAO.findWishes(status);
		}
		log.info("wishList:" + wishList);
			
		wishDAO.unmarkAsIntended(tableName);
		
		for (Wish wish : wishList) {
			wish.setTableName(tableName);
			wishDAO.markAsIntended(wish);
		}
		
		return wishList; 
	}

	@GET 
	@Path("/wishListRealized")
	public List<Wish> wishListRealized(@Context HttpServletRequest request) {
		// retornar a lista de wishes realizados
		// recebe como parametro a mesa (para poder ciclar os desejos)  
		
		Wish.Status status = Wish.Status.REALIZED;
		String tableName = request.getParameter(TABLE);
		
		List<Wish> wishList = null;
		
		if (tableName != null) {
			wishList = wishDAO.findWishes(tableName, status);
		}
		else {
			wishList = wishDAO.findWishes(status);
		}
		
		return wishList;  
	}

	@GET 
	@Path("/wishListIntended")
	public List<Wish> wishListIntended(@Context HttpServletRequest request) {
		// retornar a lista de wishes que tem a intencao de ser realizados (status=intencao)
		// se receber como parametro a mesa, retorna os wishes com esse estado para uma data mesa
		// senao retorna a lista de todos os wishes que sofreram algum estado de realizacao

		Wish.Status status = Wish.Status.INTENDED;
		String tableName = request.getParameter(TABLE);
		
		List<Wish> wishList = null;
		
		if (tableName != null) {
			wishList = wishDAO.findWishes(tableName, status);
		}
		else {
			wishList = wishDAO.findWishes(status);
		}
		
		return wishList; 
	}

	@POST 
	@Path("/makeWish")
	public void makeWish(@Context HttpServletRequest request) {
		// mudar o estado do wish para "intencao" recebendo como parametro do request
		
		Wish.Status status = Wish.Status.INTENDED;
		Long wishId = Long.valueOf(request.getParameter(WISH_ID));
		String tableName = request.getParameter(TABLE);
		
		Wish wish = wishDAO.getWishAvailableById(wishId);
		
		if (wish != null) {
			wish.setTableName(tableName);
			wish.setStatus(status);
			wishDAO.update(wish);
		}
		else {
			log.info("Failed to update wish.");
		}
		
		
	}
	
	@POST
	@Path("/realizeWish")
	public void realizeWish(@Context HttpServletRequest request) {
		// mudar o estado do wish para realizado (a compra foi efetivada pelo voluntario)
		// recebe como parametros, o WISH e o ID do VOLUNTARIO
		
		Wish.Status status = Wish.Status.REALIZED;
		Long wishId = Long.valueOf(request.getParameter(WISH_ID));
		String tableName = request.getParameter(TABLE);
		
		Wish wish = wishDAO.getWishAvailableById(wishId);
		
		if (wish != null) {
			wish.setTableName(tableName);
			wish.setStatus(status);
			wishDAO.update(wish);
		}
		else {
			log.info("Failed to update wish.");
		}
	}

	@POST
	@Path("/rejectWish")
	public void rejectWish(@Context HttpServletRequest request) {
		// mudar o estado do wish para disponivel porque a compra nao foi aprovada por algum motivo
		// recebe como parametros, o WISH e o ID do VOLUNTARIO
		
		Wish.Status status = Wish.Status.AVAILABLE;
		Long wishId = Long.valueOf(request.getParameter(WISH_ID));
		String tableName = request.getParameter(TABLE);
		
		Wish wish = wishDAO.getWishAvailableById(wishId);
		
		if (wish != null) {
			wish.setTableName(tableName);
			wish.setStatus(status);
			wishDAO.update(wish);
		}
		
	}

	@GET 
	@Path("/topBadges")
	public List<Badge> topBadges(@Context HttpServletRequest request) {
		// retornar a lista de badges que mais tem pontuacao / mais foram ganhos ate o momento 
		// a lista de retorno deve ser ordenada para trazer os top badges primeiro
		// se receber um parametro ele indica a quantidade de TOP Badges que deve ser retornado
		List<Badge> badgeList = null; 
		return badgeList; 
	}

	@GET 
	@Path("/lastDonator")
	public List<Donator> topTables(@Context HttpServletRequest request) {
		// retornar o ultimo doador / wish doado para ser apresentado no telao 
		List<Donator> list = null; 
		return list; 
	}

	@GET 
	@Path("/table")
	public Table tableInfo(@Context HttpServletRequest request) {
		// retorna a informacao detalhada sobre uma mesa
		// recebe como parametro a mesa
		Table t = null; 
		return t; 
	}
	
	@GET
	@Path("/listTables")
	public List<Table> listTables(@Context HttpServletRequest request) {
		List<Table> listTables = tableDAO.findTables();
		return listTables;
	}

	
//
//	@GET 
//	@Path("/tableBadges")
//	public List<Badge> tableBadges(@Context HttpServletRequest request) {
//		// retornar a lista de badges de uma mesa especifica
//		// recebe como parametro a mesa para retornar o badge
//		List<Badge> badgeList = null; 
//		return tbadgeList; 
//	}
//	
//	@GET 
//	@Path("/realizedWish")
//	public Wish getRealizedWish((@Context HttpServletRequest request) {
//		// retorna um wish que ja foi realizado
//		Wish w = null; 
//		return w; 
//	}
	
	
	
}
