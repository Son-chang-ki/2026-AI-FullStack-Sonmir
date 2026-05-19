### 1. RDBMS (Relational DataBase Management System)

- 관계형 데이타베이스 관리 시스템
- 테이블의 관계
- 속성(필드) 연결

### 2. 테이블 만들기 (집안의 방, 가방 안의 분류표)

DDL[정의] (CREATE, ALTER, DROP), DML[조작] (INSERT, SELECT, UPDATE, DELETE), DCL[제어] (GRANT, REVOKE)
-----------------------------------
CREATE TABLE TABLE명 (
  필드1 자료형 옵션,
  필드2 자료형 옵션
)
-----------------------------------
자료형 :
  A. 숫자: int (정수, 1,2,3, ...), double(실수, 1.23 ...)
  B. 문자: char(고정, 남/여)      , varchar(가변, abc, abcd, abcdefgh)
  C. 날짜: date, datetime
옵션 : 
  필수 입력: not null
  숫자 자동 증가 - auto_increment
  기본 키 - primary key

#### [실습1]

create table t1 (
  name varchar(100) not null, -- 필수 입력
  age int
);

create table t11 (
  no   int         not null,
  name varchar(30) not null
);

create table t12 (
  bookid int         not null,
  title  varchar(100) not null
);

show tables;
desc table

※ ERROR 1046 (3D000): No database selected
use db명

mysql> show databases;
mysql> use mbasic;
mysql> status;  -- 상태 확인

mysql> show tables; -- 테이블 목록 확인
mysql> desc t1;     -- 구조 확인

※ 참고 사항) not null 필수 입력
mysql> insert into t1 (age) values (1);
ERROR 1364 (HY000): Field 'name' doesn't have a default value (값넣어!)

mysql> insert into t1 (name, age) values ('aaa', 1);
Query OK, 1 row affected (0.00 sec)

mysql> insert into t1 (name) values ('bbb');
Query OK, 1 row affected (0.00 sec)

mysql> select * from t1;
+------+------+
| name | age  |
+------+------+
| aaa  |    1 |
| bbb  | NULL |
+------+------+
2 rows in set (0.00 sec)

#### [실습2] auto_increment (숫자 자동증가), primary key(기본 키)

create table t2 (
  jumin int primary key auto_increment,
  name varchar(100) not null,
  age int
);

※ 참고사항)
insert into  t2 (name, age)  values ('aaa' , 1);   -- 숫자자동증가
insert into  t2 (name)  values ('bbb');            -- 숫자자동증가
insert into  t2 (jumin, name, age)  values (1 , 'ccc' , 1);  -- error 기본키
insert into  t2 (jumin, name, age)  values (3 , 'ccc' , 1);  

mysql> select * from t2;
+-------+------+------+
| jumin | name | age  |
+-------+------+------+
|     1 | aaa  |    1 |
|     2 | bbb  | NULL |
|     3 | aaa  |    1 |  <-- aaa, 1 / aaa,1 구분을 해줄수 있는 필드는  jumin  1,3  
+-------+------+------+
2 rows in set (0.00 sec)



[실습] Database 만들기

---------------------------------------------------------------------
---------------------------------------------------------------------
연습문제]
[001]  다음과 같이 DB와 테이블을 만드시오        >> coffee
커피번호 : cno    int           필수입력     primary key
커피이름 : cname  varchar(50)   필수입력
커피가격 : cprice   int          필수입력

create table coffee (
   cno int           not null  primary key  auto_increment,
   cname varchar(50) not null,
   cprice int        not null
);
====> Query OK, 0 rows affected (0.02 sec)

   mysql> desc coffee;
   +--------+-------------+------+-----+---------+-------+
   | Field  | Type        | Null | Key | Default | Extra |
   +--------+-------------+------+-----+---------+-------+
   | cno    | int         | NO   | PRI | NULL    |       |
   | cname  | varchar(50) | NO   |     | NULL    |       |
   | cprice | int         | NO   |     | NULL    |       |
   +--------+-------------+------+-----+---------+-------+
   3 rows in set (0.00 sec)

[002] 다음과 같이 DB와 테이블을 만드시오           >> milk
우유번호 : mno      int           필수입력     primary key
우유이름 : mname    varchar(50)  필수입력
우유가격 : mprice   int          필수입력
우유갯수 : mnum     int         필수입력
우유총액 : mtotal   int         필수입력

   create database milk;
   create table milk (
      mno int           not null primary key,
      mname varchar(50) not null,
      mprice int        not null,
      mnum int          not null,
      mtotal int        not null
   );

   mysql> desc milk;
   +--------+-------------+------+-----+---------+-------+
   | Field  | Type        | Null | Key | Default | Extra |
   +--------+-------------+------+-----+---------+-------+
   | mno    | int         | NO   | PRI | NULL    |       |
   | mname  | varchar(50) | NO   |     | NULL    |       |
   | mprice | int         | NO   |     | NULL    |       |
   | mnum   | int         | NO   |     | NULL    |       |
   | mtotal | int         | NO   |     | NULL    |       |
   +--------+-------------+------+-----+---------+-------+
   5 rows in set (0.00 sec)

[003] 다음과 같이 DB와 테이블을 만드시오    >> score
+----------+-------------+------+-----+---------+----------------+
| Field    | Type        | Null | Key | Default | Extra          |
+----------+-------------+------+-----+---------+----------------+
| sno      | int(11)     | NO   | PRI | NULL    | auto_increment |
| sname    | varchar(20) | NO   |     | NULL    |                |
| sjava    | int(11)     | NO   |     | NULL    |                |
| sjsp     | int(11)     | NO   |     | NULL    |                |
| sspring  | int(11)     | NO   |     | NULL    |                |
| sproject | int(11)     | NO   |     | NULL    |                |
| sstotal  | int(11)     | YES  |     | NULL    |                |
| ssavg    | int(11)     | YES  |     | NULL    |                |
| semail   | varchar(50) | YES   |     | NULL    |                |
+----------+-------------+------+-----+---------+----------------+

create table score (
  sno int           not null primary key auto_increment,
  sname varchar(20) not null,
  sjava int         not null,
  sspring int       not null,
  sproject int      not null,
  sstotal int,
  ssavg int,
  semail varchar(50)
);


[004]  다음과 같이 DB와 테이블을 만드시오      >> emp
mysql> desc emp;
+----------+-------------+------+-----+---------+----------------+
| Field    | Type        | Null | Key | Default | Extra          |
+----------+-------------+------+-----+---------+----------------+
| empno    | int(11)     | NO   | PRI | NULL    | auto_increment |
| ename    | varchar(20) | YES  |     | NULL    |                |
| job      | varchar(20) | YES  |     | NULL    |                |
| mgr      | int(11)     | YES  |     | NULL    |                |
| hiredate | date        | YES  |     | NULL    |                |
| sal      | int(11)     | YES  |     | NULL    |                |
| comm     | int(11)     | YES  |     | NULL    |                |
| deptno   | int(11)     | YES  |     | NULL    |                |
+----------+-------------+------+-----+---------+----------------+

 create database emp;
 create table emp (
   empno int primary key  auto_increment,
   ename varchar(20),
   job varchar(20),
   mgr int,
   hiredate date,
   sal int,
   comm int,
   deptno int
);

[005]  다음과 같이 DB와 테이블을 만드시오     >> dept
mysql> desc dept;
+--------+-------------+------+-----+---------+----------------+
| Field  | Type        | Null | Key | Default | Extra          |
+--------+-------------+------+-----+---------+----------------+
| deptno | int(11)     | NO   | PRI | NULL    | auto_increment |
| dname  | varchar(20) | NO   |     | NULL    |                |
| loc    | varchar(20) | NO   |     | NULL    |                |
+--------+-------------+------+-----+---------+----------------+
3 rows in set (0.00 sec)

create table dept (
  deptno int primary key auto_increment,
  dname varchar(20) not null,
  loc varchar(20) not null
);


[006]  다음과 같이 DB와 테이블을 만드시오    >> salagrade
mysql> desc salgrade;
+-------+---------+------+-----+---------+----------------+
| Field | Type    | Null | Key | Default | Extra          |
+-------+---------+------+-----+---------+----------------+
| grade | int(11) | NO   | PRI | NULL    | auto_increment |
| losal | int(11) | YES  |     | NULL    |                |
| hisal | int(11) | YES  |     | NULL    |                |
+-------+---------+------+-----+---------+----------------+
3 rows in set (0.02 sec)

mysql>
create table salgrade (
  grade int primary key auto_increment,
  losal int,
  hisal int
);


### 3. TABLE

1. 데이터베이스 언어
 - DDL(Data Definition Language) : CREATE, ALTER, DROP    ==> CAD

 1) alter 문법
  https://dev.mysql.com/doc/refman/8.0/en/table.html

  help alter
  help alter table;

ALTER TABLE 테이블명(tbl_name)
    [alter_option [, alter_option] ...]
    [partition_options]

     ADD : 추가필드명 자료형 옵션 [FIRST | AFTER col_name]
     DROP : 삭제 필드명
     CHANGE : 수정할필드명(테이블명) => 이전필드명 새로운필드명 자료형 옵션
     MODIFY : 수정필드명 자료형 옵션
     RENAME : 새로운 테이블이름

  #1) 필드 추가
     alter table userinfo add uno int;
     alter table userinfo add uno2 int first; --> 맨앞에
     alter table userinfo add email varchar(100) after name;  --> name 뒤에

        mysql> desc userinfo;
        +-------+--------------+------+-----+---------+----------------+
        | Field | Type         | Null | Key | Default | Extra          |
        +-------+--------------+------+-----+---------+----------------+
        | uno2  | int          | YES  |     | NULL    |                |
        | no    | int          | NO   | PRI | NULL    | auto_increment |
        | name  | varchar(100) | NO   |     | NULL    |                |
        | email | varchar(100) | YES  |     | NULL    |                |
        | age   | int          | NO   |     | NULL    |                |
        | uno   | int          | YES  |     | NULL    |                |
        +-------+--------------+------+-----+---------+----------------+
        6 rows in set (0.00 sec)

  #2) 필드 삭제
     alter table userinfo drop uno;
     desc userinfo;
     alter table userinfo drop uno2;

        mysql> desc userinfo;
        +-------+--------------+------+-----+---------+----------------+
        | Field | Type         | Null | Key | Default | Extra          |
        +-------+--------------+------+-----+---------+----------------+
        | no    | int          | NO   | PRI | NULL    | auto_increment |
        | name  | varchar(100) | NO   |     | NULL    |                |
        | email | varchar(100) | YES  |     | NULL    |                |
        | age   | int          | NO   |     | NULL    |                |
        +-------+--------------+------+-----+---------+----------------+
        4 rows in set (0.00 sec)

  #3) 필드 수정(CHANGE) - 필드명, 자료형 옵션 수정
    > alter table userinfo change oldname newname 자료형 옵션
      alter table userinfo change email  email2 varchar(50);
       mysql> desc userinfo;
        +--------+--------------+------+-----+---------+----------------+
        | Field  | Type         | Null | Key | Default | Extra          |
        +--------+--------------+------+-----+---------+----------------+
        | no     | int          | NO   | PRI | NULL    | auto_increment |
        | name   | varchar(100) | NO   |     | NULL    |                |
        | email2 | varchar(50)  | YES  |     | NULL    |                |
        | age    | int          | NO   |     | NULL    |                |
        +--------+--------------+------+-----+---------+----------------+
        4 rows in set (0.00 sec)

      alter table userinfo change email2  email varchar(50); ※email2 => email 바꾸기
        mysql> desc userinfo;
        +-------+--------------+------+-----+---------+----------------+
        | Field | Type         | Null | Key | Default | Extra          |
        +-------+--------------+------+-----+---------+----------------+
        | no    | int          | NO   | PRI | NULL    | auto_increment |
        | name  | varchar(100) | NO   |     | NULL    |                |
        | email | varchar(50)  | YES  |     | NULL    |                |
        | age   | int          | NO   |     | NULL    |                |
        +-------+--------------+------+-----+---------+----------------+
        4 rows in set (0.00 sec)

  #4) 필드 수정(modify) - 자료형 옵션 수정 ( add, drop, change | modify )
     alter table userinfo modify email varchar(20) not null;

        mysql> desc userinfo;
        +-------+--------------+------+-----+---------+----------------+
        | Field | Type         | Null | Key | Default | Extra          |
        +-------+--------------+------+-----+---------+----------------+
        | no    | int          | NO   | PRI | NULL    | auto_increment |
        | name  | varchar(100) | NO   |     | NULL    |                |
        | email | varchar(20)  | NO   |     | NULL    |                |
        | age   | int          | NO   |     | NULL    |                |
        +-------+--------------+------+-----+---------+----------------+
        4 rows in set (0.00 sec)
     
     alter table userinfo drop email;
       mysql> desc userinfo;
        +-------+--------------+------+-----+---------+----------------+
        | Field | Type         | Null | Key | Default | Extra          |
        +-------+--------------+------+-----+---------+----------------+
        | no    | int          | NO   | PRI | NULL    | auto_increment |
        | name  | varchar(100) | NO   |     | NULL    |                |
        | age   | int          | NO   |     | NULL    |                |
        +-------+--------------+------+-----+---------+----------------+
        3 rows in set (0.00 sec)

  #5) 테이블명 수정 - ( add, drop, change | modify, nename )  
     alter table userinfo rename users;
       mysql> desc users;
        +-------+--------------+------+-----+---------+----------------+
        | Field | Type         | Null | Key | Default | Extra          |
        +-------+--------------+------+-----+---------+----------------+
        | no    | int          | NO   | PRI | NULL    | auto_increment |
        | name  | varchar(100) | NO   |     | NULL    |                |
        | age   | int          | NO   |     | NULL    |                |
        +-------+--------------+------+-----+---------+----------------+
        3 rows in set (0.00 sec)

  -- 1. 테이블 준비
  -- mysql> desc userinfo;
   create table userinfo(
    no        int               not null   primary key  auto_increment,
    name    varchar(100)        not null ,
    age      int                not null
);

    mysql> desc userinfo;
    +-------+--------------+------+-----+---------+----------------+
    | Field | Type         | Null | Key | Default | Extra          |
    +-------+--------------+------+-----+---------+----------------+
    | no    | int          | NO   | PRI | NULL    | auto_increment |
    | name  | varchar(100) | NO   |     | NULL    |                |
    | age   | int          | NO   |     | NULL    |                |
    +-------+--------------+------+-----+---------+----------------+
    3 rows in set (0.00 sec)








---

