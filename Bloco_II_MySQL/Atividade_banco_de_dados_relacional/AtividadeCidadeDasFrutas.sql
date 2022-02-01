create database db_cidade_das_frutas;

use db_cidade_das_frutas;

create table tb_categoria(
id bigint auto_increment,
horta varchar(50) not null,
agrotoxico boolean, 

primary key (id)
);
create table tb_produto(
id_produto bigint auto_increment,
tipo varchar(50) not null,
peso decimal (10,2) check (peso > 0),
preco decimal (10,2) check (preco >0),


fk_categoria bigint,
primary key (id_produto),
foreign key (fk_categoria) references tb_categoria (id)
);

select * from tb_categoria;
insert into tb_categoria (horta , agrotoxico) 
values ( "Legumes" , false),
		("Verduras" , false),
        ("Frutas" , true);

select * from tb_produto;
insert into tb_produto(tipo, peso, preco, fk_categoria)
	values
    ( "Alface" ,  1 , 3.00 , 2) ,               
    ( " Ameixa" , 30 , 58.00 , 3 ),    
    ( "Abóbora" ,  15, 21.00, 1),  
    ( "Carambola", 25 , 16.00 , 3),      
    ( "Agrião", 5 , 2.00 , 2),               
    ( "Cenoura", 0.5 , 2.00 , 1);      


-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.
select * from tb_produto where preco > 50;
-- Faça um select trazendo os Produtos com valor entre 3 e 60 reais.
select * from tb_produto where preco between 3 and 60;
-- Faça um select utilizando LIKE buscando os Produtos com a letra C.
select * from tb_produto where tipo like "C%";
-- Faça um um select com Inner join entre tabela categoria e produto.
select * from tb_categoria inner join tb_produto on tb_categoria.id = tb_produto.fk_categoria
	order by tb_produto.fk_categoria;
-- Faça um select onde traga todos os Produtos de uma categoria específica
select * from tb_categoria inner join tb_produto on tb_categoria.id = tb_produto.fk_categoria
	where tb_categoria.animal = "Frutas";