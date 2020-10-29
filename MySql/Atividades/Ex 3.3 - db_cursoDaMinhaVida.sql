CREATE DATABASE db_cursoDaMinhaVida;
USE db_cursoDaMinhaVida;

CREATE TABLE tb_categoria
( id_categoria int not null auto_increment primary key,
nome varchar(30),
nota_corte int
);

CREATE TABLE tb_curso
( id_produto int not null auto_increment primary key,
nome varchar(30),
preço double (9,2),
id_categoria int,
vagas varchar(30),
constraint fk_produto_categoria foreign key(id_categoria) references tb_categoria(id_categoria)
);

INSERT INTO tb_categoria (nome, nota_corte) VALUES
("tecnologia", "7"),
("culinária", "6"),
("edificações", "5"),
("contábil", "6"),
("elétrica", "7"),
("admnistação", "6");

INSERT INTO tb_curso (nome, preço, id_categoria, vagas) VALUES
("Java", 200.00, 1, 80),
("Python", 400.00, 1, 80),
("Html", 100.00, 1, 50),
("Culinária Asiática", 100.00, 2, 60),
("Culinária Árabe", 120.00, 2, 30),
("Construção Civil", 80.00, 3, 70),
("Microeletrônica", 100.00, 5, 80),
("Recursos Humanos", 100.00, 6, 100);

select * from tb_categoria;
select * from tb_curso;

select * from tb_curso where preço > 50.00;

select * from tb_curso where preço < 60.00 and preço > 3.00;

select * from tb_curso where nome like "%JAV%";

select * from tb_curso p INNER JOIN tb_categoria c ON p.id_categoria = c.id_categoria;

select * from tb_curso p INNER JOIN tb_categoria c ON p.id_categoria = c.id_categoria where c.nome="tecnologia"; 