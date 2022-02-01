create database db_ecommerce;

use db_ecommerce;

create table tb_produto(
id_produto bigint auto_increment,
nome varchar(50)  not null,
marca varchar(50)  not null,
departamento varchar(50)  not null,
quantidade_estoque varchar(50)  not null,
preco decimal(7,2)  not null,

primary key (id_produto)
);

select * from tb_produto;
-- determine 5 atributos
-- Popule esta tabela com até 8 dados
insert into tb_produto (nome, marca, departamento, quantidade_estoque , preco)
	values("Coca-Cola Zero", "The Coca-Coca Company", "Bebida", "50" , 5.99);
insert into tb_produto (nome, marca, departamento, quantidade_estoque , preco)
	values("Proteína de soja", "Camil", "Grãos e Mercearia", "10" , 15.00);
insert into tb_produto (nome, marca, departamento, quantidade_estoque , preco)
	values("Macarrão", "Renata", "Masssas", "30", 3.59);
insert into tb_produto (nome, marca, departamento, quantidade_estoque , preco)
	values("Molho de tomate", "Heinz", "Molhos", "40", 3.79);
insert into tb_produto (nome, marca, departamento, quantidade_estoque , preco)
	values("Café", "Maratá", "Bebida", "30", 16.25);
insert into tb_produto (nome, marca, departamento, quantidade_estoque , preco)
	values("Farinha de milho", "Yoki", "Farináceos", "20" , 7.50);
insert into tb_produto (nome, marca, departamento, quantidade_estoque , preco)
	values("Água sanitária", "Ype" , "Material de limpeza", "10" , 2.00);
insert into tb_produto (nome, marca, departamento, quantidade_estoque , preco)
	values("Shampoo", "Elseve", "Higiene pessoal" , "10" , 13.00);

-- Faça um select que retorne os produtos com o valor maior do que 500.
select * from tb_produto where preco > 500.00;

-- Faça um select que retorne os produtos com o valor menor do que 500.
select * from tb_produto where preco < 500.00;

-- Ao término atualize um dado desta tabela através de uma query de atualização.
update tb_produto set preco = 10000.00 where (id_produto = 2);