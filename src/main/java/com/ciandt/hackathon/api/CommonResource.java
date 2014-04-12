package com.ciandt.hackathon.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.concurrent.ThreadSafe;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.lang.StringUtils;

import com.ciandt.hackathon.dao.CompraDAO;
import com.ciandt.hackathon.dao.GreetingDAO;
import com.ciandt.hackathon.dao.MesaDAO;
import com.ciandt.hackathon.dao.ParticipanteDAO;
import com.ciandt.hackathon.entity.Badge;
import com.ciandt.hackathon.entity.Compra;
import com.ciandt.hackathon.entity.Greeting;
import com.ciandt.hackathon.entity.Mesa;
import com.ciandt.hackathon.entity.Participante;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Path("/api")
@ThreadSafe
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Singleton
public class CommonResource {

	private final GreetingDAO greetingDAO;
	
	private final ParticipanteDAO participanteDAO;
	
	private final MesaDAO mesaDAO;
	
	private final CompraDAO compraDAO;
	

	@Inject
	public CommonResource(GreetingDAO greetingDAO, ParticipanteDAO participanteDAO, MesaDAO mesaDAO,CompraDAO compraDAO) {
	
		super();
		this.greetingDAO = greetingDAO;
		this.participanteDAO = participanteDAO;
		this.mesaDAO = mesaDAO;
		this.compraDAO = compraDAO;
	}

	@GET
	@Path("/listGreetings")
	public List<Greeting> listGreetings(@Context HttpServletRequest request) {
		List<Greeting> listGreetings = greetingDAO.findGreetings();
		return listGreetings;
	}
	
	@GET
	@Path("/rankingMesa")
	public List<Greeting> rankingMesa(@Context HttpServletRequest request) {
		List<Greeting> listGreetings = greetingDAO.findGreetings();
		return listGreetings;
	}
	
	@GET
	@Path("/rankingParticipante")
	public List<Participante> rankingParticipante(@Context HttpServletRequest request) {
		List<Participante> listParticipantes = participanteDAO.findParticipantes();
		return listParticipantes;
	}
	
	@GET
	@Path("/rankingMesaGeral")
	public List<Mesa> rankingMesaGeral(@Context HttpServletRequest request) {
		List<Mesa> listMesa = mesaDAO.findMesas();
		return listMesa;
	}

	@GET
	@Path("/rankingPessoaGeral")
	public List<Greeting> rankingPessoaGeral(@Context HttpServletRequest request) {
		List<Greeting> listGreetings = greetingDAO.findGreetings();
		return listGreetings;
	}

	@POST
	@Path("/compra")
	public Response compra(
			@FormParam(value = "idParticipante") String idParticipante,
			@FormParam(value = "idProduto") String idProduto,
			@FormParam(value = "valor") String valor,
			@FormParam(value = "idParticipante") String idMesa) {

		if (StringUtils.isNotEmpty(idProduto) && StringUtils.isNotEmpty(valor)
				&& StringUtils.isNotEmpty(idParticipante)) {
			System.out.println("Criando nova compra");
			Compra compra = new Compra();
			compra.setIdParticipante(Long.valueOf(idParticipante));
			compra.setUrlImagem("");
			compra.setIdProduto(Long.valueOf(idProduto));
			compra.setIdMesa(Long.valueOf(idMesa));

			compraDAO.insert(compra);

			System.out.println("COMPRA inserida !!");

		} else {
			System.err.println("##############Parametros nulos");
		}

		return Response.ok("OK").build();
	}

	
	@GET
	@Path("/compras")
	public List<Compra> compras(@Context HttpServletRequest request) {
		List<Compra> findCompras = compraDAO.findCompras();
		return findCompras;
	}
	
	@GET
	@Path("/carga-inicial-participante")
	public Response cargaInicialParticipante(@Context HttpServletRequest request) {
		List<Participante> participantes = participanteDAO.findParticipantes();
		if(participantes.isEmpty()){
			List<Participante> listaParticipante = new ArrayList<Participante>();
			Random randomRanking = new Random();

			List<Badge> listaBadge = new ArrayList<>();
			for(int j=1;j<6;j++){
				Badge badge = new Badge();
				badge.setNome("badge-"+j);
				badge.setUrlImagem("/static/img/badges/badge-"+j+".png");
				listaBadge.add(badge);
			}
			
			
			for(int i=0; i<50;i++){
							
				Participante participante = new Participante();
				participante.setNome("Participante-"+i);
				participante.setRank(randomRanking.nextInt(50));
				participante.setUrlImagem("/static/img/participantes/billgates.png");
				
				Random randomDelta = new Random();
				participante.setDelta(randomDelta.nextInt(3));
				
				Random randomBadge = new Random();
				for(int j=0 ;j<4;j++){
					participante.getBadge().add(listaBadge.get(randomBadge.nextInt(4)));
				}
				
				participanteDAO.insert(participante);
			}
			return Response.ok("Banco carregado!").build();
		}else{
			return Response.ok("Carga já realizada").build();
		}
	}

	@GET
	@Path("/carga-inicial-mesa")
	public Response cargaInicialMesa(@Context HttpServletRequest request) {
		List<Participante> participantes = participanteDAO.findParticipantes();
		List<Mesa> mesas = mesaDAO.findMesas();
		if(mesas.isEmpty()){
			if(participantes.isEmpty()){
				cargaInicialParticipante(null);
			}
			mesas = new ArrayList<>();
			Random randomRankMesa = new Random();
			for (int i=0; i<participantes.size();i++) {
				Random randomMesa = new Random();
				Mesa mesa = new Mesa();
				mesa.setDelta(randomMesa.nextInt(3));
				mesa.setNome("Mesa");
				mesa.setRank(randomRankMesa.nextInt(10));
				mesa.setUrlImagem("/static/img/mesas/mesa.jpg");
				for(int j=0;j<5;j++){
					mesa.getListaIdParticipantes().add(participantes.get(i).getId());
					i++;
				}
				mesaDAO.insert(mesa);
				mesas.add(mesa);
			}
			
			return Response.ok("Carga realizada com sucesso").build();
		}else{
			return Response.ok("Carga já realizada").build();
		}
	}
	

}
