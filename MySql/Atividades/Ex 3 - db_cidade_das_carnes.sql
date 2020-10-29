CREATE DATABASE db_cidade_das_carnes;
USE  db_cidade_das_carnes;

CREATE TABLE tb_categoria
( id_categoria int not null auto_increment primary key,
nome varchar(30),
marca varchar(30)
);

CREATE TABLE tb_produto
( id_produto int not null auto_increment primary key,
nome varchar(30),
valor double(9,2),
id_categoria int,
validade date,
constraint fk_produto_categoria foreign key(id_categoria) references tb_categoria(id_categoria)
);

INSERT INTO tb_categoria (nome, marca)
VALUES ('carne bovina', 'Sadia'),
('carne suína', 'Perdigão'),
('carne aviária', 'Seara'),
('carvão', 'Roots'),
('Linguiça', 'Sadia');

INSERT INTO tb_produto (nome, valor, id_categoria, validade)
VALUES ('Picanha', 60.00, 1, '2020-12-25'),
('Asinha', 9.00, 3, '2020-11-25'),
('Lombo', 20.00, 2, '2020-10-30'),
('Carvão Vegetal', 15.00, 4, '2025-12-30'),
('Linguiça Suína', 20.00, 5, '2020-12-30'),
('Linguiça de Frango', 25.00, 5, '2020-12-30'),
('Peito de Frango', 12.00, 3, '2020-11-25'),
('Maminha', 30.00, 1, '2020-12-25');

select * from tb_produto where valor > 50.00;

select * from tb_produto where valor < 60.00 and valor > 3.00;

select * from tb_produto where nome like "%CO%";

select * from tb_produto p INNER JOIN tb_categoria c ON p.id_categoria = c.id_categoria;

select * from tb_produto p INNER JOIN tb_categoria c ON p.id_categoria = c.id_categoria where c.id_categoria=5; 



