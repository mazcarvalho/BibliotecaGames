CREATE TABLE produtora (
 codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
 nome   VARCHAR(50) NOT NULL
) ENGINE=innoDB DEFAULT CHARSET=utf8;

INSERT INTO produtora (nome) values ('Microsoft Studios');
INSERT INTO produtora (nome) values ('FromSoftware');
INSERT INTO produtora (nome) values ('Eletronic Arts');
INSERT INTO produtora (nome) values ('Capcom');
INSERT INTO produtora (nome) values ('Square Enix');