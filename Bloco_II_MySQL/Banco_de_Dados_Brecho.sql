-- Criando o Banco de Dados
CREATE DATABASE db_brecho;

-- Seleciona o Banco de dados para uso
USE db_brecho;

-- Cria a primeira tabelaa
CREATE TABLE tb_produtos(
	id bigint auto_increment,
    nome varchar(255) not null,
    quantidade int not null,
    preco decimal not null,
    tamanho enum('pequeno','médio','grande'),
    primary key (id)
);

-- Insere dados na tabela
INSERT INTO tb_produtos(nome, quantidade, preco, tamanho) VALUES ("Camisa", 10, 79.99, 'pequeno');
INSERT INTO tb_produtos(nome, quantidade, preco, tamanho) VALUES ("Calça", 20, 120.45, 'médio');
INSERT INTO tb_produtos(nome, quantidade, preco, tamanho) VALUES ("Shorts", 45, 40.00, 'grande');

-- Visualizar todos os dados
SELECT * FROM tb_produtos;

-- Visualiza somente o nome e o preço
SELECT nome, preco FROM tb_produtos;

-- Visualiza somente o nome e o preço com Alias/Apelido(AS)
SELECT nome AS Nome_Produto, preco AS Preço_Produto FROM tb_produtos;

-- Visualizar todos os dados usando uma coluna como critério 
SELECT * FROM tb_produtos WHERE id = 1;

SELECT * FROM tb_produtos WHERE nome = "Shorts";

-- Visualizar todos os dados usando Operador Relacional
SELECT * FROM tb_produtos WHERE preco > 50;

-- Visualizar todos os dados usando Operador Lógico
SELECT * FROM tb_produtos WHERE preco > 50 AND quantidade < 30;

-- Alterações na Estrutura da Tabela
-- Modificando uma coluna
ALTER TABLE tb_produtos MODIFY preco decimal(6,2); -- 0000,00

-- Adiciona uma coluna
ALTER TABLE tb_produtos ADD descricao varchar(200);

-- Exclui uma coluna
ALTER TABLE tb_produtos DROP descricao;

-- Alterações nos Dados da Tabela
-- Atualiza o atributo preço na tabela, cujo id seja igual a 1
UPDATE tb_produtos SET preco = 8.50 WHERE id = 1;

-- Apaga todos os dados da tabela (Não é possível desfazer)
DELETE FROM tb_produtos;

-- Apaga o registro da tabela, cujo id seja igual a 2
DELETE FROM tb_produtos WHERE id = 2;

-- Apaga todos os dados da tabela liberando as linhas usadas(Não é possível desfazer)
TRUNCATE TABLE tb_produtos;

-- Apaga a Tabela (não pode ser desfeito)
DROP TABLE tb_produtos;

-- Apaga o BD (não pode ser desfeito)
DROP DATABASE db_brecho;

-- BÔNUS

-- Esqueceu de definir a chave primária da tabela
ALTER TABLE tb_produtos ADD PRIMARY KEY (id);

-- Modifica o nome de um Atributo da Tabela
ALTER TABLE tb_produtos CHANGE nome nome_produto integer;