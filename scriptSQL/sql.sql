create table funcionario(
nome varchar(100) not null,
entrada date not null,
nascimento date not null,
endereco varchar(300) not null,
cpf varchar(14) not null,
primary key (cpf)
);

create table cliente(
nome varchar(100) not null,
endereco varchar(300) not null,
cpf varchar(14) not null,
telefone varchar(20),
email varchar(100),
primary key(cpf)
);

create table produto(
nome varchar(100) not null,
descricao varchar(500) not null,
preco float not null,
codigo varchar(5) not null,
primary key (codigo)
);

create table venda(
cpf_cliente varchar(14) not null,
cpf_vendedor varchar(14) not null,
cod_produto varchar(5) unique not null,
primary key (cod_produto),
CONSTRAINT cpf_c FOREIGN KEY (cpf_cliente) REFERENCES cliente (cpf),
CONSTRAINT cpf_v FOREIGN KEY (cpf_vendedor) REFERENCES funcionario (cpf),
CONSTRAINT cod FOREIGN KEY (cod_produto) REFERENCES produto (codigo)
)

