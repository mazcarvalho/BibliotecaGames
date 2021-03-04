package com.example.bibliotecagames.api.resource;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bibliotecagames.api.event.RecursoCriadoEvent;
import com.example.bibliotecagames.api.model.Jogo;
import com.example.bibliotecagames.api.repository.JogoRepository;

@RestController
@RequestMapping("/jogos")
public class JogoResource {
	
	@Autowired
	private JogoRepository jogoRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@GetMapping
	public List<Jogo> listarTodos(){
		return jogoRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Jogo> salvar(@Valid @RequestBody Jogo jogo, HttpServletResponse response) {		
		Jogo novoJogo = jogoRepository.save(jogo);	
		publisher.publishEvent(new RecursoCriadoEvent(this, response, novoJogo.getCodigo()));		
		return ResponseEntity.status(HttpStatus.CREATED).body(novoJogo);		
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Optional<Jogo>> buscarPeloCodigo(@PathVariable Long codigo) {			
		Optional<Jogo> jogo = jogoRepository.findById(codigo);		
		return(!jogo.isEmpty()) ? ResponseEntity.ok().body(jogo) : ResponseEntity.notFound().build();		 
	}

}
