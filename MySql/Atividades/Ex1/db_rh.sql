CREATE DATABASE db_rh;

use db_rh;

CREATE TABLE funcionarios (
	registro int not null auto_increment,
    nome varchar(30) not null,
    nascimento date not null,
    salario double not null,
    setor varchar(30) not null,
    primary key (registro)
    )engine=innodb;
    
INSERT INTO funcionarios (nome, nascimento, salario, setor) VALUES 
		('Lysandro', '1992-02-18', 5000, 'Tecnologia'),
		('Renato', '1997-01-12', 3000, 'Projetos'),
		('Lucas', '1965-02-05', 1900, 'Operação'),
		('Renata', '1982-03-04', 9000, 'Gerencia'),
		('Rodrigo', '1993-05-03', 1700, 'Recursos Humanos');
        
 SELECT * FROM funcionarios WHERE salario > 2000;
 SELECT * FROM funcionarios WHERE salario < 2000;