create table amministratore(
nomeadmin varchar2(30) not null,
cognomeadmin varchar2(30) not null,
codadmin varchar2(30) not null
);


create table statistiche(
corsofrequentato varchar2(30),
datainizioultimocorso date,
duratamediadeicorsi number(30,2),
docentetipologie varchar2(30),
corsipostidisponibili varchar2(30)
);

create table docenti(
nomedocente varchar2(30) not null,
cognomedocente varchar2(30) not null,
cvdocente varchar2(50),
coddocente int,
constraint p_coddocente primary key(coddocente)
);

create table corsi(
codcorso int,
nomecorso varchar2(30) not null,
datainiziocorso date not null,
datafinecorso date not null,
costocorso number(7,2) not null,
commenticorso varchar2(200),
aulacorso varchar2(30) not null,
coddocente int,
constraint p_codcorso primary key(codcorso),
constraint f_coddocente foreign key(coddocente) references docenti(coddocente)
);

create table corsisti(
nomecorsista varchar2(30) not null,
cognomecorsista  varchar2(30) not null,
codcorsista int,
precedentiformativi number(1),
constraint p_codcorsista primary key(codcorsista)
);

create table corsocorsista(
idCorsisti int,
idCorsi int,
constraint f_idCorsisti foreign key(idCorsisti) references corsisti(codcorsista),
constraint f_idCorsi foreign key(idCorsi) references corsi(codcorso)
);

--sequenze
create sequence corsisti_seq;
create sequence corsi_seq;
