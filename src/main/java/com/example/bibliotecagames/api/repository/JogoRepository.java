package com.example.bibliotecagames.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bibliotecagames.api.model.Jogo;
import com.example.bibliotecagames.api.repository.jogo.JogoRepositoryQuery;

public interface JogoRepository extends JpaRepository<Jogo, Long>, JogoRepositoryQuery{

}
