package com.example.bibliotecagames.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="jogo")
public class Jogo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column(name="nome")
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="cod_plataforma")
	private Plataforma plataforma;
	
	@ManyToOne
	@JoinColumn(name="cod_produtora")
	private Produtora produtora;
	
	@Column(name="ano_lancamento")
	private String anoLancamento;
	
	@Enumerated(EnumType.STRING)
	@Column(name="tipo_midia")
	private TipoMidia tipoMidia;
	
	@Column(name="coop_local")
	private Boolean coopLocal;
	
	@Column(name="coop_online")
	private Boolean coopOnLine;
	
	@Column(name="classificacao")
	private String classificacao;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public void setCod_produtora(Produtora produtora) {
		this.produtora = produtora;
	}

	public String getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public TipoMidia getTipoMidia() {
		return tipoMidia;
	}

	public void setTipoMidia(TipoMidia tipoMidia) {
		this.tipoMidia = tipoMidia;
	}

	public Boolean getCoopLocal() {
		return coopLocal;
	}

	public void setCoopLocal(Boolean coopLocal) {
		this.coopLocal = coopLocal;
	}

	public Boolean getCoopOnLine() {
		return coopOnLine;
	}

	public void setCoopOnLine(Boolean coopOnLine) {
		this.coopOnLine = coopOnLine;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogo other = (Jogo) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
}
