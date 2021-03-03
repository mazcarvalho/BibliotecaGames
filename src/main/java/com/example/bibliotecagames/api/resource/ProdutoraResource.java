package com.example.bibliotecagames.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bibliotecagames.api.model.Produtora;
import com.example.bibliotecagames.api.repository.ProdutoraRepository;

@RestController
@RequestMapping("/produtoras")
public class ProdutoraResource {
	
	@Autowired
	private ProdutoraRepository produtoraRepository;
	
	@GetMapping
	public List<Produtora> listarTodas(){
		return produtoraRepository.findAll();
	}

}
