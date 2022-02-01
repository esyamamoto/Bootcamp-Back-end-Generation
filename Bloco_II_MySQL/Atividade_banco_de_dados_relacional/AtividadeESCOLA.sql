create database db_escola;

use db_escola;

create table tb_alunes(   
-- Popule esta tabela com até 8 dados

	id_alune bigint (20) auto_increment,
    nome varchar (50) not null,
    dt_nasc date,
    turma enum("A", "B") not null,
    nota real ,
    
    primary key (id_alune)
    );
    

    -- registro dos alunos com 5 atributos
    INSERT INTO tb_alunes (nome, dt_nasc, turma, nota) 
    values("Mewpi",'1996-03-08', "A",  8.4 );
	INSERT INTO tb_alunes (nome, dt_nasc, turma, nota) 
    values  ("Dristroy",'1995-07-02', "A", 10.0 );
	INSERT INTO tb_alunes (nome, dt_nasc, turma, nota)	
    values	("LittleDoll",'1995-05-23', "B", 6.6 );
	INSERT INTO tb_alunes (nome, dt_nasc, turma, nota)	
    values	("Galaxyn",'1996-09-27', "A", 8.5);
	INSERT INTO tb_alunes (nome, dt_nasc, turma, nota)	
    values	("Kenai",'1995-03-08', "B", 9.6 );
	INSERT INTO tb_alunes (nome, dt_nasc, turma, nota)	
    values	("Made in Aracaju",'1995-05-04', "B", 4.5);
	
    select * from tb_alunes;
    -- Faça um select que retorne os alunos com nota menor que 7.    
	select * from tb_alunes where nota < 7;
     -- Faça um select que retorne os alunos com nota maior que 7. 
    select * from tb_alunes where nota > 7;
    -- Ao término atualize um dado desta tabela através de uma query de atualização.
	update tb_alunes set nota = 9.2 where (id_alune = 0);
	

  
    
    