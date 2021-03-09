package com.example.bibliotecagames.api.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Dlc.class)
public abstract class Dlc_ {

	public static volatile SingularAttribute<Dlc, Long> codigo;
	public static volatile SingularAttribute<Dlc, String> anoLancamento;
	public static volatile SingularAttribute<Dlc, String> nome;
	public static volatile SingularAttribute<Dlc, String> classificacao;
	public static volatile SingularAttribute<Dlc, Jogo> jogo;

	public static final String CODIGO = "codigo";
	public static final String ANO_LANCAMENTO = "anoLancamento";
	public static final String NOME = "nome";
	public static final String CLASSIFICACAO = "classificacao";
	public static final String JOGO = "jogo";

}

