DROP DATABASE ecommerce;
CREATE DATABASE ecommerce;
USE ecommerce;

CREATE TABLE servicos(
cod_servico int primary key,
nome_servico varchar(50)
);

CREATE TABLE prestadores(
cod_prestadores int primary key,
nome_prestadores varchar(50),
descricao_prestadores varchar(100),
valor_prestadores float,
telefone_prestadores varchar(11)
);

CREATE TABLE login(
cod_login int primary key,
login varchar(50),
senha varchar(50)
);
create table itenservico(
cod_itenservico int primary key,
servico_contratado varchar(50),
qtd_servico int,
cod_prestadores int,
cod_servico int,
foreign key (cod_prestadores) references prestadores (cod_prestadores),
foreign key (cod_servico) references servicos (cod_servico)
);
