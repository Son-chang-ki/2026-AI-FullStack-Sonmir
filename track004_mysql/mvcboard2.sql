use mbasic;
create database dbdbig;
create table mvcboard2 (
bno int not null auto_increment primary key,
bname varchar(20) not null,
bpass varchar(50) not null,
btitle varchar(1000) not null,
bcontent text not null,
bdate timestamp not null  DEFAULT CURRENT_TIMESTAMP,
bhit int not null DEFAULT 0, 
bip varchar(50) not null
);
select * from mvcboard2;
desc mvcboard2;

alter table mvcboard2 add  bfile varchar(500) not null;

alter table mvcboard2 modify bfile varchar(500) default 'the703.png';