CREATE TABLE usuario (
  id VARCHAR(255) NOT NULL,
   nome VARCHAR(255) NOT NULL,
   email VARCHAR(255) NOT NULL,
   data_cadastro date NOT NULL,
   idade int,
   CONSTRAINT pk_usuario PRIMARY KEY (id)
);