conn sonmir/tiger


create table dept(
   deptno  number    primary key,
   dname   varchar2(14),
   loc     varchar2(13)
);

--insert into 이용해서 값 넣기   

INSERT INTO dept (DEPTNO, DNAME, LOC ) values ( 10, 'ACCOUNTING',    'NEW YOR' );
INSERT INTO dept (DEPTNO, DNAME, LOC ) values ( 20,  'RESEARCH', 'DALLAS' );
INSERT INTO dept (DEPTNO, DNAME, LOC ) values ( 30, 'SALES'   ,  'CHICAGO' );
INSERT INTO dept (DEPTNO, DNAME, LOC ) values ( 40, 'OPERATIONS' ,  'BOSTON' );

commit;

select * from dept;

-- 3) 데이터 넣기 -  50 AIDEV  SEOUL
insert into dept (DEPTNO, DNAME, LOC ) values ( 50, 'AIDEV' , 'SEOUL' );

-- 3) 데이터 수정 -  50 AIDEV  INCHEON.
update dept set loc='incheon' where deptno=50; 

-- 3) 데이터 삭제 -  50
delete from  dept  where deptno= 50;

select * from dept;

commit;

-- 4) sequence (숫자 자동증가)
create sequence dept_seq;
insert into dept (DEPTNO, DNAME, LOC ) values ( dept_seq.nextval , 'AIDEV' , 'SEOUL'); 

select * from dept;

CREATE SEQUENCE dept_seq
       START WITH              50    -- 시작할 번호 (기존 데이터와 겹치지 않게)
       INCREMENT BY            10    -- 증가할 값   (10개씩 증가)
       NOCACHE                       -- 캐시사용안함  (번호 건너뛰기 방지)
       NOCYCLE;                      -- 값이 처음으로 안 돌아감
    
drop sequence dept_seq;

-- 5) 외래키
-- 부모 삭제시 자식도 같이 삭제

CREATE TABLE emp1 (
  empno    number not null  primary key    ,
  ename    varchar(10) not null    ,
  job      VARCHAR2(9),
  mgr      NUMBER(4),
  hiredate DATE,
  sal      NUMBER(7,2),
  comm     NUMBER(7,2),
  deptno   number references dept (deptno) on delete cascade
);

select * from emp1;   
commit;

INSERT INTO emp1 VALUES (7369, 'SMITH', 'CLERK', 7902, '1980-12-17' , 800, NULL, 1);  
delete from dept where deptno=1;
select * from emp1;
drop table emp1;

-- 부모 삭제시 자식의 deptno를 null 로 변경
CREATE TABLE emp2(
  empno    number not null  primary key    ,
  ename    varchar(10) not null    ,
  job      VARCHAR2(9),
  mgr      NUMBER(4),
  hiredate DATE,
  sal      NUMBER(7,2),
  comm     NUMBER(7,2),
  deptno   number references dept (deptno) on delete  set null
);

select * from emp2; 

INSERT INTO emp2 VALUES (7369, 'SMITH', 'CLERK', 7902, '1980-12-17' , 800, NULL, 50);
delete from dept  where  deptno=50;
select * from emp2;

CREATE TABLE emp(
  empno    NUMBER(4) PRIMARY KEY,
  ename    VARCHAR2(10),
  job      VARCHAR2(9),
  mgr      NUMBER(4),
  hiredate DATE,
  sal      NUMBER(7,2),
  comm     NUMBER(7,2),
  deptno   NUMBER(2) REFERENCES dept(deptno) ON DELETE CASCADE
);
select * from emp;

INSERT INTO emp VALUES (7369, 'SMITH', 'CLERK', 7902, '1980-12-17', 800, NULL, 20);
INSERT INTO emp VALUES (7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20', 1600, 300, 30);
INSERT INTO emp VALUES (7521, 'WARD', 'SALESMAN', 7698, '1981-02-22', 1250, 500, 30);
INSERT INTO emp VALUES (7566, 'JONES', 'MANAGER', 7839, '1981-04-02', 2975, NULL, 20);
INSERT INTO emp VALUES (7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01', 2850, NULL, 30);
INSERT INTO emp VALUES (7782, 'CLARK', 'MANAGER', 7839, '1981-06-09', 2450, NULL, 10);
INSERT INTO emp VALUES (7839, 'KING', 'PRESIDENT', NULL, '1981-11-17', 5000, NULL, 10);
INSERT INTO emp VALUES (7844, 'TURNER', 'SALESMAN', 7698, '1981-09-08', 1500, 0, 30);
INSERT INTO emp VALUES (7900, 'JAMES', 'CLERK', 7698, '1981-12-03', 950, NULL, 30);
INSERT INTO emp VALUES (7902, 'FORD', 'ANALYST', 7566, '1981-12-03', 3000, NULL, 20);
INSERT INTO emp VALUES (7934, 'MILLER', 'CLERK', 7782, '1982-01-23', 1300, NULL, 10);
INSERT INTO emp VALUES (7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28', 1250, 1400, 30);
INSERT INTO emp VALUES (7876, 'ADAMS', 'CLERK', 7788, '1983-01-12', 1100, NULL, 20);
INSERT INTO emp VALUES (7788, 'SCOTT', 'ANALYST', 7566, '1982-12-09', 3000, NULL, 20);

select * from emp;
commit;