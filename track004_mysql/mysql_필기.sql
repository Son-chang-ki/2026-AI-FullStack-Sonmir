### 1. Mysql ?

> 1. mysql why?
  1) DBMS
    - Database Management System
    - 데이터베이스를 관리해주는 시스템

  2) Database?
    - Data + Base
    - Data : 1) 데이터(수집된 사실, 값)  2) 정보(의미 부여)
    - Data(의미를 제공하는 데이터) + Base(체계와 규격을 가진 집합)

  Q1. 다음 빈칸을 채우시오
      1.  (#1  데이터  )는  수집된 사실이나 값을 의미하고
      2.  (#2   정보  )는  데이터들 중에서 의미를 제공하는 데이터를 의미
  
  3) Database 종류 
    - Oracle(대기업에서 선호), Mysql(중소기업 위주 사용), MSSql(마이크로소프트사),,,,,

> 2. mysql Setting
  1) 1. MYSQL 다운로드
       https://dev.mysql.com/
       - Download
       - MySQL Community Server

  2) MYSQL 설치
  3) MYSQL 환경설정 (1) path ==> C:\Program Files\MySQL\MySQL Server 8.4\bin
  4) MYSQL 환경설정 (2) utf-8
   ==> chcp 65001 (한글 입력 가능하게 셋팅)


### 2. RDBMS 

> 1. RDBMS (Relational Datase Management System)
  - 관계형 데이터베이스 관리 시스템
  - 테이블들의 관계

> 2. RDBMS 구성요소
 - 개체 (Entity : Table)
 - 관계 (Relationship)
 - 속성 (Attruibute : 필드)

※ 스키마 - 데이터베이스 구조와 제약조건을 명세정의
    외부스키마 = 사용자 뷰
    개념스키마 = 전체적인 뷰
    내부스키마 = 저장스키마

※ 데이터베이스 설계단계
   #1. 개념적설계 - 요구사항분석 후 개념적 설계 ERD 
        (예_ 집을 어떻게? 방 몇개? 주방 어디? ,,, 거실은 얼마나 크게)

   #2. 논리적설계 - ERD를 이용하여 데이터베이스 스키마를 설계 
        (예_방 = 테이블, 그 방에 사는 사람 = 엔티티, 관계 = 외래키)

   #3. 물리적설계 - 테이블 저장구조 설계 ( mysql,oracle,,,,)
        (실제 건축자재로 만들기 - mysql,oracle)
  
> 3. 데이터베이스 언어  ★(암기할 것)
  1) 정의어 (DDL)  DDL = Data Definition Language
     ==> CREATE, ALTER, DROP    ==> CAD

  2) 조작어 (DML)  DML = Data Manipulation Language
     ==> INSERT, SELECT, UPDATE, DELETE  ==> CRUD 
     
  3) 제어어 (DCL)  DCL = Data Control Language
     ==> GRANT,  REVOKE
 
> 4. [실습] Database 만들기

  1) 만들기      : create database db명 
  2) 확인        : show databases
  3) 삭제(복구X) : drop database db명
  4) DB사용      : use db명


 1) sql접속
   mysql -uroot -p
   1234

 2) mysql
     ==> mysql> ststus (제대로 셋팅되었는지 확인하기)

    show  databases;
    create database  db1;  --  데이터베이스 만들기
    drop database  db1;    -- 데이터베이스 삭제 (복구 안됨)


> 5. [연습]
 1) db명 : test , mbasic , db703 3개 db만들기
 2) db만들어진것 확인
 3) db703 삭제

      mysql> create database test;    ==> database 만들기
      mysql> create database mbasic;  ==> database 만들기
      mysql> create database db703;   ==> database 만들기

      mysql> show databases;          ==> database 만든 거 확인

      mysql>  drop database db703;    ==> database  db703 삭제

      mysql> show databases;          ==> database 삭제한 것 확인
      +--------------------+
      | Database           |
      +--------------------+
      | information_schema |
      | mbasic             |
      | mysql              |
      | performance_schema |
      | sys                |
      | test               |
      +--------------------+
      6 rows in set (0.00 sec)


---

### 3. 테이블

 1. RDBMS (Relational Data Management System)
  - 관계형 데이터베이스 
  - 테이블들의 관계
  - 속성(필드,테이블 구성요소) 연결
 
 2. 테이블 만들기 (집안의 방, 가방 안의 분류표)
  DDL(정의 : create, alert, drop), DML(조작 : ), DCL(제어 : )
  -----------------------------------------------
  CREATE TABLE table명 (
    필드1 자료형 옵션,
    필드2 자료형 옵션
   );
  -----------------------------------------------
  자료형 : 
    1. 숫자 : int(정수, 1,2,3), double(실수, 1.23)
    2. 문자 : char(고정, 남/여), varchar(가변, abc, abcd, abcde)
    3. 날짜 : date, datetime
  
  옵션 :
    필수입력 - not null
    숫자자동증가 - auto_increment
    기본키 - primary key

 [실습]
  create table t1(
      name varchar(100) not null, 
      age int
  );
   ==> ※ ERROR 1046 (3D000): No database selected

  show tables;  --> 테이블 목록확인
  desc t1;      --> 구조확인

  [실습1]
  create table t11(
      no      int      not null, 
      name varchar(30) not null
  );

  create table t12(
      bookid      int        not null,  --> not(안돼) null(비어 있으면)
      title    varchar(100)  not null   --> 필수입력
  );
  
   show tables;
   desc t12;

 use db명

 mysql> show databases;
 mysql> use mbasic;
   ==> atabase changed
     
 mysql> status     --> 상태확인

※ 참고사항) not null 필수입력
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

 [실습2] auto_increment (숫자 자동증가), primary key (기본키)

 create table t2(
   jumin int         not null auto_increment primary key,
   name varchar(100) not null,
   age  int
 );

※ 참고사항)
  insert into t2 (name, age) values ('aaa', 1);   --> 숫자 자동 증가
  insert into t2 (name) values ('bbb');           --> 숫자 자동 증가
  insert into t2 (jumin, name, age) values (1, 'ccc', 1);     --> error 기본키

   mysql> select * from t2;
   +-------+------+------+
   | jumin | name | age  |
   +-------+------+------+
   |     1 | aaa  |    1 |
   |     2 | bbb  | NULL |
   |     3 | aaa  |    1 |  <-- aaa, 1 / aaa,1 구분을 해줄수 있는 필드는  jumin  1,3> 화면에 출력은 X            
   +-------+------+------+
   2 rows in set (0.00 sec)


