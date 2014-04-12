package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.ciandt.hackathon.entity.Mesa;
import com.ciandt.hackathon.entity.Participante;
import com.ciandt.hackathon.entity.ParticipanteDoacao;
import com.ciandt.hackathon.entity.TipoDoacao;
import com.google.appengine.api.memcache.ErrorHandlers;
import com.google.appengine.api.memcache.MemcacheService;
import com.google.appengine.api.memcache.MemcacheServiceFactory;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.googlecode.objectify.Key;

@Singleton
public class ObjectifyMesaDAO implements MesaDAO {

	//@Inject
	//private Logger log;

	@Override
	public Hashtable<TipoDoacao, Integer> getDoacoes(Mesa mesa) {
		
		ParticipanteDAO participanteDAO = new ObjectifyParticipanteDAO();
		List<Participante> participantes = participanteDAO.findParticipantesMesa(mesa);
		
		ParticipanteDoacaoDAO participanteDoacaDAO = new ObjectifyParticipanteDoacaoDAO();
		List<ParticipanteDoacao> doacoes = participanteDoacaDAO.findDoacoes();
		
		TipoDoacaoDAO tipoDoacaoDAO = new ObjectifyTipoDoacaoDAO();
		List<TipoDoacao> tipoDoacoes = tipoDoacaoDAO.findTipoDoacoes();
		
		Hashtable<TipoDoacao, Integer> ret2 = new Hashtable<TipoDoacao, Integer>();
		
		for(TipoDoacao tipoDoacao: tipoDoacoes) {
			ret2.put(tipoDoacao, 0);
		}
		
		for(ParticipanteDoacao doacao: doacoes) {
			for(Participante participante: participantes) {
				if(doacao.getIdParticipante().longValue() == participante.getId().longValue()) {
				
					for(TipoDoacao tipoDoacao: tipoDoacoes) {
						if(tipoDoacao.getId().longValue() == doacao.getIdDoacao().longValue()) {
							Integer totalIdDoacao = ret2.get(tipoDoacao);
							totalIdDoacao += 1;
							ret2.put(tipoDoacao, totalIdDoacao);
						}
					}
					
					
					
					break;
				}
			}
		}
		
		
		
		
		return ret2;
	}
	
	@Override
	public List<Mesa> findMesas() {
		
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers
				.getConsistentLogAndContinue(Level.INFO));
		@SuppressWarnings("unchecked")
		List<Mesa> mesa = (List<Mesa>) syncCache.get("MESA");

		if (mesa == null) {
			mesa = ofy().load().type(Mesa.class).list();
		} else {
		}

		if (mesa != null) {
		}
		return mesa;
	}

	@Override
	public Mesa find(Long id) {
		
		Mesa mesa = ofy().load().type(Mesa.class).id(id).now();

		if (mesa != null) {
		}
		return mesa;
	}

	@Override
	public Long insert(Mesa mesa) {
		

		// invalidates the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers
				.getConsistentLogAndContinue(Level.INFO));
		syncCache.delete("MESA");

		Key<Mesa> key = ofy().save().entity(mesa).now();
		return key.getId();

	}

}
