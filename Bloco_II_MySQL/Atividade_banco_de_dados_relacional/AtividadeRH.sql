create database db_rh;
use db_rh;

create table tb_funcionarie(
id_funcionarie bigint  auto_increment,
nome varchar (50) not null,
data_nasc date,
email varchar(50) not null,
cargo varchar(50) not null,
salario decimal(10,2) not null,

primary key (id_funcionarie)
);

-- Popule esta tabela com até 5 dados;
insert into tb_funcionarie(nome, data_nasc, email, cargo, salario) 
	values ("Mewpi",'1996-03-08',"mewpi@email.com", "Estagiário", 800.00);
insert into tb_funcionarie(nome, data_nasc, email, cargo, salario) 
	values ("Dristroy",'1995-07-02', "dristroy@email.com", "Atendente", 1200.00);
insert into tb_funcionarie(nome, data_nasc, email, cargo, salario) 
	values ("Galaxyn",'1996-09-27',  "galaxyn@email.com","Gerente", 3000.00);
insert into tb_funcionarie(nome, data_nasc, email, cargo, salario)  
	values ("Kenai", '1995-03-08',  "kenai@email.com", "Dono da empresa", 900000.00);
insert into tb_funcionarie(nome, data_nasc, email, cargo, salario)  
	values("LittleDoll",'1995-05-23', "littledoll@email.com", "Atendente", 1200.00);
 
select * from tb_funcionarie;
 -- Faça um select que retorne os funcionaries com o salário maior do que 2000.
select * from tb_funcionarie where salario > 2000.00;
-- Faça um select que retorne os funcionaries com o salário menor do que 2000.
select * from tb_funcionarie where salario < 2000.00;

update tb_funcionarie set salario = 1000.00 where (id_funcionarie = 5);

