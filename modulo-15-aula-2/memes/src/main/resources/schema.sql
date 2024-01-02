CREATE TABLE meme (
  id VARCHAR(255) NOT NULL,
   nome VARCHAR(255) NOT NULL,
   descricao VARCHAR(255) NOT NULL,
   data_cadastro date NOT NULL,
   url VARCHAR(255) NOT NULL,
   categoria_meme_id VARCHAR(255),
   usuario_id VARCHAR(255),
   CONSTRAINT pk_meme PRIMARY KEY (id)
);