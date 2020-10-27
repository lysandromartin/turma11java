create database db_rh2;
use db_rh2;

CREATE TABLE IF NOT EXISTS `tb_cargo` (
  `id_cargo` INT NOT NULL AUTO_INCREMENT,
  `descrição cargo` VARCHAR(45) NOT NULL,
  `classificação cargo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_cargo`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `db_rh2`.`tb_funcionario` (
  `id_func` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `sexo` ENUM("M", "F", "Outros") NOT NULL,
  `idade` INT NOT NULL,
  `salário` DOUBLE(9,2) NOT NULL,
  `tb_cargo_id_cargo` INT NOT NULL,
  PRIMARY KEY (`id_func`),
  CONSTRAINT `fk_tb_funcionario_tb_cargo1`
    FOREIGN KEY (`tb_cargo_id_cargo`)
    REFERENCES `db_rh2`.`tb_cargo` (`id_cargo`))
ENGINE = InnoDB;

select * from tb_cargo;
select * from tb_funcionario;

INSERT INTO `tb_cargo` VALUES (default, 'analista', 'junior');
INSERT INTO `tb_cargo` VALUES (default, 'analista', 'pleno');
INSERT INTO `tb_cargo` VALUES (default,  'analista', 'senior');
INSERT INTO `tb_cargo` VALUES (default, 'consultor', 'junior');
INSERT INTO `tb_cargo` VALUES (default, 'consultor', 'pleno');
INSERT INTO `tb_cargo` VALUES (default, 'consultor', 'senior');

INSERT INTO `tb_funcionario` VALUES (default, 'Lysandro M', 'M', 28, 5000.00, 6);
INSERT INTO `tb_funcionario` VALUES (default, 'Renata M', 'F', 19, 2000.00, 3);
INSERT INTO `tb_funcionario` VALUES (default, 'Stuart Jr.', 'M', 28, 3000.00, 4);
INSERT INTO `tb_funcionario` VALUES (default, 'Gabriel R', 'M', 28, 4000.00, 5);
INSERT INTO `tb_funcionario` VALUES (default, 'Bruna M', 'F', 28, 6000.00, 7);
INSERT INTO `tb_funcionario` VALUES (default, 'Debora M', 'F', 28, 7000.00, 8);

select nome from tb_funcionario where salário > 2000;
select nome from tb_funcionario where salário > 1000 and salário < 2000;
select nome from tb_funcionario where nome like "C%";
select * from tb_funcionario f inner join tb_cargo c on f.tb_cargo_id_cargo = id_cargo;



