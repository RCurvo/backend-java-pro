CREATE TABLE categoria_meme (
  id VARCHAR(255)  NOT NULL,
   nome VARCHAR(255) NOT NULL,
   descricao VARCHAR(255) NOT NULL,
   data_cadastro date NOT NULL,
   id_usuario VARCHAR(255),
   CONSTRAINT pk_categoriameme PRIMARY KEY (id)
);