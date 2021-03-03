-- Criação da tabela de Consoles atuais
CREATE TABLE plataforma (
 codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
 nome   VARCHAR(50) NOT NULL
) ENGINE=innoDB DEFAULT CHARSET=utf8;
-- Inserindo os tipos de consoles disponiveis no momento
INSERT INTO plataforma (nome) values ('Xbox Classico');
INSERT INTO plataforma (nome) values ('Xbox 360');
INSERT INTO plataforma (nome) values ('Xbox One');
INSERT INTO plataforma (nome) values ('PlayStation 3');
INSERT INTO plataforma (nome) values ('PlayStation 4');
INSERT INTO plataforma (nome) values ('Nintendo Switch');
INSERT INTO plataforma (nome) values ('PC');

-- Criação da tabela de Categorias para os jogos 
CREATE TABLE categoria (
 codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
 nome   VARCHAR(50) NOT NULL
) ENGINE=innoDB DEFAULT CHARSET=utf8;

-- Inserindo as categorias inicias
INSERT INTO categoria (nome) values ('Aventura');
INSERT INTO categoria (nome) values ('RPG');
INSERT INTO categoria (nome) values ('Esporte');
INSERT INTO categoria (nome) values ('Ação');
INSERT INTO categoria (nome) values ('Terror');
