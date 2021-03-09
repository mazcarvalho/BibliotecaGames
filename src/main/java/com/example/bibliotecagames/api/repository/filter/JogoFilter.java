package com.example.bibliotecagames.api.repository.filter;

import com.example.bibliotecagames.api.model.Plataforma;
import com.example.bibliotecagames.api.model.Produtora;

public class JogoFilter {
	
	private String nome;
	
	private String anoLancamento;
	
	private String classificacao;
	
    private Plataforma plataforma;
 	
    private Produtora produtora;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public Plataforma getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}

	public Produtora getProdutora() {
		return produtora;
	}

	public void setProdutora(Produtora produtora) {
		this.produtora = produtora;
	}
    
}
