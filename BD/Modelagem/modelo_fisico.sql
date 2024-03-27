create database teste;
use teste

/* modelo_logico: */

CREATE TABLE Fornecedor (
    ID_Fornecedor INTEGER PRIMARY KEY not null,
    cnpj VARCHAR UNIQUE not null,
    endereco VARCHAR,
    email VARCHAR not null,
    telefone_Principal VARCHAR not null,
    telefone_Secundario VARCHAR
);

CREATE TABLE Produto (
    ID_Produto INTEGER PRIMARY KEY not null,
    ID_Categoria INTEGER not null,
    cod_Barras NUMERIC not null,
    peso float,
    valor float not null,
    descricao VARCHAR not null,
    data_Validade VARCHAR,
    data_Fabricacao VARCHAR,
    ID_Fornecedor INTEGER not null
);

CREATE TABLE Categoria (
    ID_Categoria INTEGER PRIMARY KEY not null,
    descricao VARCHAR not null
);

CREATE TABLE Estoque (
    ID_Estoque INTEGER PRIMARY KEY not null,
    ID_Produto INTEGER not null,
    quantidade INTEGER not null
);

CREATE TABLE Cargo (
    ID_Cargo INTEGER PRIMARY KEY not null,
    salario INTEGER not null,
    descricao VARCHAR not null
);

CREATE TABLE Cliente (
    ID_Cliente INTEGER PRIMARY KEY not null,
    nome VARCHAR not null,
    cpf VARCHAR UNIQUE not null,
    endereco VARCHAR,
    telefone_principal VARCHAR,
    telefone_secundario VARCHAR
);

CREATE TABLE Venda (
    ID_Venda INTEGER PRIMARY KEY not null,
    ID_Produto INTEGER not null,
    ID_Cliente INTEGER not null,
    ID_Pagamento INTEGER not null,
    valor_Total FLOAT not null
);

CREATE TABLE Pagamento (
    ID_Pagamento INTEGER PRIMARY KEY not null,
    tipo_Pagamento VARCHAR not null
);

CREATE TABLE Funcionario (
    ID_Funcionario INTEGER PRIMARY KEY not null,
    ID_Cargo INTEGER not null,
    cpf VARCHAR UNIQUE not null,
    endereco VARCHAR,
    telefone_Principal VARCHAR,
    telefone_Secundario VARCHAR,
);

CREATE TABLE Login (
    ID_Login INTEGER PRIMARY KEY not null,
    usuario VARCHAR UNIQUE not null,
    senha VARCHAR UNIQUE not null,
);
 
 SELECT*FROM Fornecedor;


ALTER TABLE Fornecedor ADD CONSTRAINT FK_Fornecedor_2
    FOREIGN KEY (fk_Produto_ID_Produto)
    REFERENCES Produto (ID_Produto)
    ON DELETE RESTRICT;
