package com.example.bibliotecagames.api.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bibliotecagames.api.model.Categoria;
import com.example.bibliotecagames.api.repository.CategoriaRepository;


@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria atualizar(Long codigo , Categoria categoria) {
		Optional<Categoria> categoriaSalva = buscarCategoriaPorCodigo(codigo);
		BeanUtils.copyProperties(categoria, categoriaSalva, "codigo");
		return categoriaRepository.save(categoriaSalva.get());
	}

	private Optional<Categoria> buscarCategoriaPorCodigo(Long codigo) {
		Optional<Categoria> categoriaSalva = categoriaRepository.findById(codigo);
		if(categoriaSalva.isEmpty()) {
			throw new java.util.NoSuchElementException();			
		}
		return categoriaSalva;
	}

}
