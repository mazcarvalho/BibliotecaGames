package com.example.bibliotecagames.api.repository.jogo;

import java.util.List;

import com.example.bibliotecagames.api.model.Jogo;
import com.example.bibliotecagames.api.repository.filter.JogoFilter;

public interface JogoRepositoryQuery {
	
	public List<Jogo> filtrar(JogoFilter jogoFilter);

}
