package com.example.bibliotecagames.api.repository.jogo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.util.StringUtils;

import com.example.bibliotecagames.api.model.Jogo;
import com.example.bibliotecagames.api.model.Jogo_;
import com.example.bibliotecagames.api.repository.filter.JogoFilter;

public class JogoRepositoryImpl implements JogoRepositoryQuery{
	
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<Jogo> filtrar(JogoFilter jogoFilter){
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Jogo> criteria = builder.createQuery(Jogo.class);
		Root<Jogo> root = criteria.from(Jogo.class);
		
		//criando as restrições
		Predicate[] predicates = criarRestricoes(jogoFilter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<Jogo> query = manager.createQuery(criteria);
		return query.getResultList();
	}

	@SuppressWarnings("deprecation")
	private Predicate[] criarRestricoes(JogoFilter jogoFilter, CriteriaBuilder builder, Root<Jogo> root) {
		
		List<Predicate> predicates = new ArrayList<>();
		
		if(!StringUtils.isEmpty(jogoFilter.getNome())) {
			predicates.add(builder.like(
					builder.lower(root.get(Jogo_.nome)), "%" + jogoFilter.getNome().toLowerCase() + "%"));
		}
		
		if(!StringUtils.isEmpty(jogoFilter.getAnoLancamento())) {
			predicates.add(builder.like(
					builder.lower(root.get(Jogo_.anoLancamento)), "%" + jogoFilter.getAnoLancamento().toLowerCase() + "%"));
		}
		
		if(!StringUtils.isEmpty(jogoFilter.getClassificacao())) {
			predicates.add(builder.like(
					builder.lower(root.get(Jogo_.classificacao)), "%" + jogoFilter.getClassificacao().toLowerCase() + "%"));
		}
		
		return predicates.toArray(new Predicate[predicates.size()]);
	}

}
