CREATE TABLE jogo (
 codigo         BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
 nome           VARCHAR(50) NOT NULL,
 cod_plataforma BIGINT(20) NOT NULL,
 cod_produtora  BIGINT(20) NOT NULL,
 ano_lancamento VARCHAR(4) NOT NULL,
 tipo_midia     VARCHAR(10) NOT NULL,
 coop_local     BOOLEAN NOT NULL,
 coop_online    BOOLEAN NOT NULL,
 classificacao  VARCHAR(10) NOT NULL,
 FOREIGN KEY cod_plataforma REFERENCES plataforma(codigo),
 FOREIGN KEY cod_produtora REFERENCES produtora(codigo)
) ENGINE=innoDB DEFAULT CHARSET=utf8;

 INSERT INTO jogo (nome,cod_plataforma,cod_produtora,ano_lancamento,coop_local,coop_online, classificacao)
 values('DEMONs SOULS', 4, 2, '2009', false, true, '17+');