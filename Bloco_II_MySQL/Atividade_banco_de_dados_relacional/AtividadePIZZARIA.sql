create database db_pizzaria_legal;

use db_pizzaria_legal;

-- O sistema trabalhará com 2 tabelas tb_pizza e tb_categoria.
-- determine 3 atributos relevantes do tb_categoria
create table tb_categoria(
	id bigint auto_increment,
	tamanho enum ("P", "M", "G"),
    tipo enum ("Doce", "Salgada"),
	id_pizza bigint,
     
	primary key(id)
    );
    
-- determine 5 atributos relevantes dos tb_produto
-- (não esqueça de criar a foreign key de tb_categoria nesta tabela).
create table tb_pizza(
	id_pizza bigint auto_increment,
    sabor_pizza varchar(50) not null,
    preco decimal(10,5) check (preco > 0),
    borda enum ("Cheddar", "Catupiry", "Cream Cheese", "Queijo Vegano", "Nenhum"),
    stt boolean,
    id_categoria bigint,
        
    primary key (id_pizza),
    foreign key(id_categoria) references tb_categoria(id)
);

-- Popule esta tabela Categoria com até 5 dados.
select * from tb_categoria;

insert into tb_categoria (tamanho, tipo) 
	values  ("P", "Salgada"),
			("M", "Salgada"),
		    ("G", "Salgada"),
            ("P", "Doce"),
			("M", "Doce"),
            ("G", "Doce");

select * from tb_pizza;         
-- Popule esta tabela pizza com até 8 dados.
insert into tb_pizza (sabor_pizza, preco, borda, stt, id_categoria) 
	values  ("Alface", 49.99, "Queijo Vegano", true, 3),
			("Mussarela", 42.00, "Cream Cheese", true, 2),
            ("Tomate seco, rúcula e mussarela", 62.99, "Cheddar", false, 3),
            ("Nutella com Morango", 59.99, "Nenhum", true, 5),
            ("Calabrase", 34.00, "Nenhum", true, 1);
                   
-- Faça um select que retorne os Produtos com o valor maior do que 45 reais.
select * from tb_pizza where preco < 45.00;

-- Faça um select trazendo os Produtos com valor entre 29 e 60 reais.
select * from tb_pizza where preco between 29.00 and 60.00;

-- Faça um select utilizando LIKE buscando os Produtos com a letra C.
select * from tb_pizza where sabor_pizza like "C%";

-- Faça um um select com Inner join entre tabela categoria e pizza.
select * from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.id_categoria
	and tb_pizza.stt = true
	order by tb_pizza.id_pizza;
    
-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são pizza doce).
select * from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.id_categoria 
	and tb_categoria.tipo = "Doce";
