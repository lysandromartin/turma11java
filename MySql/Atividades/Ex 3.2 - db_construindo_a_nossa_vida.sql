CREATE DATABASE db_construindo_a_nossa_vida;
USE  db_construindo_a_nossa_vida;

CREATE TABLE tb_categoria
( id_categoria int not null auto_increment primary key,
nome varchar(30),
marca varchar(30)
);

CREATE TABLE tb_produto
( id_produto int not null auto_increment primary key,
nome varchar(30),
preço double (9,2),
id_categoria int,
cor varchar(30),
constraint fk_produto_categoria foreign key(id_categoria) references tb_categoria(id_categoria)
);

INSERT INTO tb_categoria (nome, marca) VALUES
("hidráulica", "Amanco"),
("hidráulica", "Tigre"),
("tinta", "Suvinil"),
("elétrica", "Sil"),
("iluminação", "Osram"),
("estrutural", "Votorantin");

INSERT INTO tb_produto (nome, preço, id_categoria, cor) VALUES
("tubos e conexões", "3.00", 2, "branco"),
("tubos e conexões", "3.00", 1, "branco"),
("cimento", "40.00", 6, "cinza"),
("tinta acrilica", "100.00", 3, "branco"),
("tinta seca", "120.00", 3, "vermelha"),
("cabos de aço", "80.00", 6, "-"),
("lampada led", "9.00", 5, "quente"),
("lampada led", "9.00", 5, "fria");

select * from tb_categoria;
select * from tb_produto;

select * from tb_produto where preço > 50.00;

select * from tb_produto where preço < 60.00 and preço > 3.00;

select * from tb_produto where nome like "%CI%";

select * from tb_produto p INNER JOIN tb_categoria c ON p.id_categoria = c.id_categoria;

select * from tb_produto p INNER JOIN tb_categoria c ON p.id_categoria = c.id_categoria where c.nome="hidráulica"; 
