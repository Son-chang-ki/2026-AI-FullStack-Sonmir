use mbasic;
create database dbdbig;
drop table  t1;
drop table  t2;
create table t1 ( no int not null auto_increment primary key, name varchar(100) );


create table t2 ( ino int not null  primary key, FOREIGN KEY(ino) references t1(no) );

insert into  t1( no, name ) values (1,'first');
insert into  t1( no, name ) values (2,'second');

desc t1;
select * from t1;

create table t3 ( no int not null auto_increment primary key, name varchar(100) );

create table t4 (  ino int not null  primary key, FOREIGN KEY(ino) references t3(no)  on delete cascade on update cascade );

  insert into t3( no, name ) values (1, 'first');
  insert into t3( no, name ) values (2, 'second'); 
  insert into t4( ino ) values (2);