create database GerenciaAtendimento;
use GerenciaAtendimento;

# colunas começando com 'es' são foreign key

create table Medico(
	idMedico int auto_increment,
    CRM varchar(20),
    nome varchar(300),
    rg varchar(20),
    cpf varchar(20),
    dataNascimento date,
    foto varchar(1000),
    especialidade varchar(20),
    primary key(idMedico,CRM)
);

create table Paciente(
	idPacientePaciente int auto_increment,
    es_senhaAtendimento int, 
    nome varchar(300),
    rg varchar(20),
    sexo varchar(10),
    dataNascimento date,
    primary key(idPacientePaciente)
);

create table Senha(
	idSenha int auto_increment,
    es_idPaciente int,
    dataGeracao datetime,
    especialidade varchar(20),
	primary key(idSenha,es_idPaciente)    
);

alter table Paciente add foreign key(es_senhaAtendimento) references Senha(idSenha);
alter table Senha add foreign key(es_idPaciente) references Paciente(idPacientePaciente);

CREATE INDEX idx_crm ON Medico(CRM);

create table Diagnostico(
	idDiagnostico int auto_increment,
    es_idSenha int, 
    es_CRMmedico varchar(20),
    data_hora datetime,
    diagnostico varchar(500),
    tratamento varchar(500),
    primary key(idDiagnostico,es_idSenha,es_CRMmedico),
    foreign key (es_CRMmedico) references Medico(CRM),
    foreign key (es_idSenha) references Senha(idSenha)
);

create table Responsavel(
	idResponsavel int auto_increment,
    es_idDependente int, # chave estrangeira do Paciente
    nome varchar(300),
    cpf varchar(20),
    primary key(idResponsavel, es_idDependente),
    foreign key(es_idDependente) references Paciente(idPacientePaciente)
);
