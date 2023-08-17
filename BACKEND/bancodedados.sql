create database pizzaria;
use pizzaria;



create table cliente(
idCliente int not null primary key auto_increment,
nome varchar(30) not null,
senha varchar(30) not null,
sobrenome varchar(30) not null,
email varchar(500)not null,
telefone varchar(11)not null,
cpf varchar (11) not null,
cep varchar (8) not null,
endereço varchar(150)not null);



desc cliente



create table pizza(
idPizza int not null primary key auto_increment,
sabor varchar(30) not null,
preço float(10));



insert into pizza (sabor, preço)
value ("Mussarela",30);



insert into pizza (sabor, preço)
value ("Calabresa",42);



insert into pizza (sabor, preço)
value ("Brocólis",35);



insert into pizza (sabor, preço)
value ("Bacon",40);



insert into pizza (sabor, preço)
value ("Peperoni",42);



insert into pizza (sabor, preço)
value ("Vegetariana",40);



insert into pizza (sabor, preço)
value ("Portuguesa",36);



insert into pizza (sabor, preço)
value ("Quatro queijos",39);



insert into pizza (sabor, preço)
value ("Chocolate",33);



insert into pizza (sabor, preço)
value ("Chocolate com fruta",37);



insert into pizza (sabor, preço)
value ("Sensação",36);



select * from pizza



desc pizza



create table pedido(
idPedido int not null primary key auto_increment,
dia date not null,
hora time not null);



desc pedido



create table qtde(
idQtde int not null primary key auto_increment,
quantidade varchar (2) not null);



desc qtde



create table pagamento(
idPagamento int not null primary key auto_increment,
valor varchar (5) not null);



desc pagamento



show tables