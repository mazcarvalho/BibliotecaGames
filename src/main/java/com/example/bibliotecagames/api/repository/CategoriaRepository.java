package com.example.bibliotecagames.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bibliotecagames.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
