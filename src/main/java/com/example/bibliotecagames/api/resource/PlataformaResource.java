package com.example.bibliotecagames.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bibliotecagames.api.model.Plataforma;
import com.example.bibliotecagames.api.repository.PlataformaRepository;

@RestController
@RequestMapping("/plataformas")
public class PlataformaResource {
	
	@Autowired
	private PlataformaRepository plataformaRepository;
	
	@GetMapping
	public List<Plataforma> listarTodos(){
		return plataformaRepository.findAll();
	}

}
