create database gestao_Vendas
default character set utf8
default collate utf8_general_ci;

use gestao_vendas;

create table usuario(
id bigint primary key not null,
nome varchar(100) not null,
usuario varchar(100) not null unique,
senha varchar(100) not null,
perfil varchar(10) not null default 'Usuario',
situacao boolean not null default true,
data_hora_criacao datetime default current_timestamp,
ultimo_login datetime default '0001-01-01 00:00:00'
);

create table cliente(
id int primary key not null ,
nome varchar(100) not null,
telefone varchar(15),
morada varchar(100)
);

create table venda(
id int primary key not null auto_increment,
total_venda decimal(10,2) not null,
valor_pago decimal(10,2) not null,
troco decimal(10,2) not null,
desconto decimal(10,2) not null,
cliente_id int not null,
usuario_id bigint not null,
data_hora_criacao datetime default current_timestamp,
constraint fk_venda_cliente foreign key(cliente_id) references
cliente(id),
constraint fk_venda_usuario foreign key(usuario_id) references 
usuario(id)
);

create table produto(
id bigint primary key auto_increment not null,
nome varchar(1000) not null,
descricao text(100000) not null,
valor decimal(10,2),
valid datetime default '0000-01-01 00:00:00'
);

create table venda_item(
venda_id int not null,
produto_id bigint not null,
quantidade int not null,
total decimal(10,2) not null,
desconto decimal(10,2) not null,
constraint fk_venda_item_venda foreign key(venda_id) references venda(id),
constraint fk_venda_item_produto foreign key(produto_id) references produto(id)

);

