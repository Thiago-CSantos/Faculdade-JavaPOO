create database aula02_10;

use aula02_10;

create table Cargo(
codCargo int primary key,
descricao varchar(100)
);

create table Funcionario(
matricula int primary key,
nome varchar(100),
codigoCargo int,
foreign key(codigoCargo) references Cargo(codCargo)
);

insert into Cargo values(1,"Vendedor");
insert into Cargo values(2,"Gerente");
insert into Cargo values(3,"Caixa");

insert into Funcionario values(100, "João", 1);
insert into Funcionario values(110, "Maria", 2);
insert into Funcionario values(120, "Carlos", 1);
insert into Funcionario(matricula, nome) values(130, "Tadeu");

select F.nome, C.descricao from Funcionario F, Cargo C where F.codigoCargo = C.codCargo;
select F.nome, C.descricao from Funcionario F inner join Cargo C on F.codigoCargo = C.codCargo;

select F.nome from Funcionario F, Cargo C where F.codigoCargo = C.codCargo and C.descricao = "Vendedor";
select F.nome from Funcionario F inner join Cargo C on F.codigoCargo = C.codCargo where C.descricao = "Vendedor";