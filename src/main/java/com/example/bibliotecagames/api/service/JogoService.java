package com.example.bibliotecagames.api.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bibliotecagames.api.model.Jogo;
import com.example.bibliotecagames.api.repository.JogoRepository;

@Service
public class JogoService {
	
	@Autowired
	private JogoRepository jogoRepository;
	
	public Jogo salvar(Jogo jogo) {
		return jogoRepository.save(jogo);
	}
	
	public void deletar(Jogo jogo) {
		jogoRepository.delete(jogo);
	}
	
	public Jogo atualizar(Long codigo , Jogo jogo) {
		Jogo jogoSalvo = buscarJogoPorCodigo(codigo);		
		BeanUtils.copyProperties(jogo, jogoSalvo, "codigo");
		return jogoRepository.save(jogoSalvo);
	}

	private Jogo buscarJogoPorCodigo(Long codigo) {
		Optional<Jogo> jogoSalvo = jogoRepository.findById(codigo);
		if(jogoSalvo.isEmpty()) {
			throw new java.util.NoSuchElementException();			
		}
		return jogoSalvo.get();
	}


}
