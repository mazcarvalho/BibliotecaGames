package com.example.bibliotecagames.api.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Jogo.class)
public abstract class Jogo_ {

	public static volatile SingularAttribute<Jogo, Boolean> coopLocal;
	public static volatile SingularAttribute<Jogo, Boolean> coopOnLine;
	public static volatile SingularAttribute<Jogo, String> anoLancamento;
	public static volatile SingularAttribute<Jogo, TipoMidia> tipoMidia;
	public static volatile SingularAttribute<Jogo, Plataforma> plataforma;
	public static volatile SingularAttribute<Jogo, String> nome;
	public static volatile SingularAttribute<Jogo, String> classificacao;
	public static volatile SingularAttribute<Jogo, Produtora> produtora;

	public static final String COOP_LOCAL = "coopLocal";
	public static final String COOP_ON_LINE = "coopOnLine";
	public static final String ANO_LANCAMENTO = "anoLancamento";
	public static final String TIPO_MIDIA = "tipoMidia";
	public static final String PLATAFORMA = "plataforma";
	public static final String NOME = "nome";
	public static final String CLASSIFICACAO = "classificacao";
	public static final String PRODUTORA = "produtora";

}

