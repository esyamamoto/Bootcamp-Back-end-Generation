create database db_farmacia_do_bem;

use db_farmacia_do_bem;

-- O sistema trabalhará com 2 tabelas tb_produto e tb_categoria.
-- determine 3 atributos relevantes do tb_categoria
create table tb_categoria (
	id_categoria bigint auto_increment,
    tarja varchar(50) not null,
	receita boolean, 
    
    primary key (id_categoria)
);
-- determine 5 atributos relevantes dos tb_produto
create table tb_produto (
	id_produto bigint auto_increment,
    nome varchar (50) not null,
	fabricante varchar(50) not null,
	preco real,
	estoque int (100),
    
    key_categoria bigint,
    primary key (id_produto),
    foreign key (key_categoria) references tb_categoria(id_categoria)    
);

select * from tb_categoria;
-- Popule esta tabela Categoria com até 5 dados.
insert into tb_categoria (tarja, receita) 
		values 
				("Tarja Vermelha com retenção", true),
                ("Tarja Vermelha sem retenção", true),
                ("Tarja Amarela", null),	
                ("Tarja Preta", True),
				("Não Tarjados", false);

select * from tb_produto;
-- Popule esta tabela Produto com até 8 dados.
insert into tb_produto (nome, fabricante, preco, estoque, key_categoria)
	values  ("Dorflex", "Sanofi", 2.00, 85, 1),
			("Glifage xr", "Merck", 52.00, 105, 5),
			("Ivermectina mg", "Vitamedic", 12.25, 25, 4),
            ("Ozempic", "Novo Nordisk", 53.00, 50, 2),
            ("Neosaldina", "Takeda Pharma", 15.00, 62, 4),
            ("Torsilax", "Neo Quimica", 20.00 ,56, 3),
            ("Xarelto", "Bayer Pharma", 75.00 ,2, 5),
			("Jardiance", "Boehringer ing", 44.00, 65, 2);

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.
select * from tb_produto where preco > 50.00;

-- Faça um select trazendo os Produtos com valor entre 3 e 60 reais.
select * from tb_produto where preco between 3 and 60;

-- Faça um select utilizando LIKE buscando os Produtos com a letra B.
select * from tb_produto where nome like "B%";

-- Faça um um select com Inner join entre tabela categoria e produto.
select * from tb_categoria inner join tb_produto on tb_categoria.id_categoria = tb_produto.key_categoria 
	order by tb_produto.nome;

select * from tb_categoria inner join tb_produto on tb_categoria.id_categoria = tb_produto.key_categoria 
	where tb_categoria.tarja = "Tarja Preta";

select * from tb_categoria inner join tb_produto on tb_categoria.id_categoria = tb_produto.key_categoria 
	where tb_categoria.tarja = "Tarja Vermelha com Retenção";

select * from tb_categoria inner join tb_produto on tb_categoria.id_categoria = tb_produto.key_categoria 
	where tb_categoria.tarja = "Tarja Vermelha sem Retenção";
    
select * from tb_categoria inner join tb_produto on tb_categoria.id_categoria = tb_produto.key_categoria 
	where tb_categoria.tarja like "Não tarjados";

            
         