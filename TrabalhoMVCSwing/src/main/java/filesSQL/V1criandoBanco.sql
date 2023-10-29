create database TrabalhoJavaSwing;
use TrabalhoJavaSwing;

Create table Usuario(
	id int primary key auto_increment,
	email varchar(100),
    senha varchar(100)
);

insert Usuario(email, senha) values('thiago.santos@sou.fae.br', '123456');
insert into Usuario(email, senha) values('joao@sou.fae.br', '123456');

select * from Usuario;
select email, senha from Usuario;