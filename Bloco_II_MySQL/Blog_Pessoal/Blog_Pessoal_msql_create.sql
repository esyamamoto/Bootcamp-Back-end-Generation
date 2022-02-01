create database blog_pessoal;
use blog_pessoal;
CREATE TABLE `tb_temas` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`descricao` varchar(255) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `tb_usuarios` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`nome` varchar(500) NOT NULL,
	`usuario` varchar(500) NOT NULL,
	`senha` varchar(500) NOT NULL,
	`foto` varchar(500) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `tb_postagens` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`titulo` varchar(500) NOT NULL,
	`texto` varchar(500) NOT NULL,
	`data` TIMESTAMP(6) NOT NULL,
	`id_tema` bigint(50) NOT NULL,
	`id_usuario` bigint(50) NOT NULL,
	PRIMARY KEY (`id`)
);

ALTER TABLE `tb_postagens` ADD CONSTRAINT `tb_postagens_fk0` FOREIGN KEY (`id_tema`) REFERENCES `tb_temas`(`id`);

ALTER TABLE `tb_postagens` ADD CONSTRAINT `tb_postagens_fk1` FOREIGN KEY (`id_usuario`) REFERENCES `tb_usuarios`(`id`);



