package com.ciandt.hackathon.api;

import java.util.List;

import javax.annotation.concurrent.ThreadSafe;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.ciandt.hackathon.dao.GreetingDAO;
import com.ciandt.hackathon.entity.Greeting;

import com.ciandt.hackathon.entity.Wish;
import com.ciandt.hackathon.entity.Table;
import com.ciandt.hackathon.entity.Badge;
import com.ciandt.hackathon.entity.Donator;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Path("/api")
@ThreadSafe
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Singleton
public class CommonResource {
	
	//parameters
	private final static String TABLE = "table";
	private final static String CATEGORY = "category";
	private final static String WISH_ID = "wish_id";
	private final static String WISH_STATUS = "wish_status";
	

	private final GreetingDAO greetingDAO;

	@Inject
	public CommonResource(GreetingDAO greetingDAO) {
		super();
		this.greetingDAO = greetingDAO;
	}

	@GET
	@Path("/listGreetings")
	public List<Greeting> listGreetings(@Context HttpServletRequest request) {
		List<Greeting> listGreetings = greetingDAO.findGreetings();
		return listGreetings;
	}

	@GET 
	@Path("/wishList")
	public List<Wish> wishList(@Context HttpServletRequest request) {
		// retornar a lista de wishes nao atendidos ate o momento
		// recebe opcionalmente a mesa e o tipo do wish que se deseja realizar
		
		Wish.Status status = Wish.Status.AVAILABLE;
		String tableName = request.getParameter(TABLE);
		String category = request.getParameter(CATEGORY);
		
		if (tableName != null) {
			if (category != null) {
				//busca por mesa e categoria
			}
			else {
				//busca por mesa
			}
		}
		else {
			if (category != null) {
				//busca somente por categoria
			}
		}
		
		List<Wish> wishList = null;
		
		for (Wish wish : wishList) {
			wish.setStatus(Wish.Status.INTENDED);
			wish.setIntendedTable(tableName);
			//persistir objeto wish
		}
		
		return wishList; 
	}

	@GET 
	@Path("/wishListRealized")
	public List<Wish> wishListRealized(@Context HttpServletRequest request) {
		// retornar a lista de wishes realizados
		// recebe como parametro a mesa (para poder ciclar os desejos)  
		
		List<Wish> wishList = null; 
		return wishList; 
	}

	@GET 
	@Path("/wishListIntended")
	public List<Wish> wishListIntended(@Context HttpServletRequest request) {
		// retornar a lista de wishes que tem a intencao de ser realizados (status=intencao)
		// se receber como parametro a mesa, retorna os wishes com esse estado para uma data mesa
		// senao retorna a lista de todos os wishes que sofreram algum estado de realizacao
		List<Wish> wishList = null; 
		return wishList; 
	}

	@POST 
	@Path("/makeWish")
	public void makeWish(@Context HttpServletRequest request) {
		// mudar o estado do wish para "intencao" recebendo como parametro do request
		
	}
	
	@POST
	@Path("/realizeWish")
	public void realizeWish(@Context HttpServletRequest request) {
		// mudar o estado do wish para realizado (a compra foi efetivada pelo voluntario)
		// recebe como parametros, o WISH e o ID do VOLUNTARIO
		
	}

	@POST
	@Path("/rejectWish")
	public void rejectWish(@Context HttpServletRequest request) {
		// mudar o estado do wish para disponivel porque a compra nao foi aprovada por algum motivo
		// recebe como parametros, o WISH e o ID do VOLUNTARIO
		
	}

	@GET 
	@Path("/topTables")
	public List<Table> topTables(@Context HttpServletRequest request) {
		// retornar a lista de mesas que estao com a maior pontuacao, recebendo como parametro a quantidade 
		// de mesas que deve retornar ... se nao receber nenhum parametro retorna a lista inteira ordenada
		// por quem mais tem pontuacao
		List<Table> tableList = null; 
		return tableList; 
	}

	@GET 
	@Path("/topBadges")
	public List<Badge> topBadges(@Context HttpServletRequest request) {
		// retornar a lista de badges que mais tem pontuacao / mais foram ganhos ate o momento 
		// a lista de retorno deve ser ordenada para trazer os top badges primeiro
		// se receber um parametro ele indica a quantidade de TOP Badges que deve ser retornado
		List<Badge> badgeList = null; 
		return tbadgeList; 
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
	@Path("/tableBadges")
	public List<Badge> tableBadges(@Context HttpServletRequest request) {
		// retornar a lista de badges de uma mesa especifica
		// recebe como parametro a mesa para retornar o badge
		List<Badge> badgeList = null; 
		return tbadgeList; 
	}
	
	@GET 
	@Path("")
	public Wish getRealizedWish((@Context HttpServletRequest request) {
		// retorna um wish que ja foi realizado
		Wish w = null; 
		return w; 
	}
	
	
	
}
