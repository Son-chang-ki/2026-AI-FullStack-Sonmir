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


SQL> desc  sboard2;
-- 이름                                         널?      유형
-- ----------------------------------------- -------- ----------------------------
-- ID                                        NOT NULL NUMBER
-- APP_USER_ID                          NOT NULL NUMBER
-- BTITLE                                   NOT NULL VARCHAR2(1000)
-- BCONTENT                             NOT NULL CLOB
-- BPASS                                   NOT NULL VARCHAR2(255)
-- BFILE                                                   VARCHAR2(255)
-- BHIT                                                    NUMBER
-- BIP                                       NOT NULL VARCHAR2(255)
-- CREATED_AT                                          DATE
-- 
 
 create table sboard2(
 ID                  NUMBER                 NOT NULL ,
 APP_USER_ID         NUMBER                 NOT NULL ,
 BTITLE              VARCHAR2(1000)         NOT NULL ,
 BCONTENT            CLOB                   NOT NULL ,
 BPASS               VARCHAR2(255)          NOT NULL ,
 BFILE               VARCHAR2(255)  default 'the703.png',
 BHIT                NUMBER    default  0 ,
 BIP                 VARCHAR2(255)      NOT NULL  ,
 CREATED_AT          DATE        default sysdate          
 );
 
select * from sboard2; 
 
 desc sboard2;
 
 create sequence sboard2_seq;
 
 
--###   mapper1)  sql 구문찾기 
--1) crud
--* insert
--* 전체select 
--* 해당번호의 select
--* 해당번호 조회수 올리기
--* 해당번호 업데이트
--* 해당번호 삭제

--1) crud
--* insert
insert into  sboard2 ( ID ,  APP_USER_ID ,  BTITLE  ,  BCONTENT  ,  BPASS  ,  BFILE  ,  BIP  )
  values ( sboard2_seq.nextval ,  1001    ,  'title'   , 'bcontent'  ,  '1111' ,  '1.png' ,  '127.0.0.1' );

--* 전체select  ( 페이징 )
--#####  페이징관련
select *  from  sboard2  order by id   desc;
SELECT * FROM sboard2 
ORDER BY id DESC
OFFSET 0 ROWS FETCH NEXT 10 ROWS ONLY;

--  OFFSET 0 ROWS: 건너뛸 행의 개수 (0부터 시작)
--  FETCH NEXT 10 ROWS ONLY: 가져올 행의 개수
--  최신글부터 10개, 0,10   / 10,10   / 20,10

select count(*) from sboard2;

-- 참고사항 (11버전 이하)
select * from(
    select row_number() over(order by id desc)  as rnum, 
    id, app_user_id, btitle, bcontent, bpass, bfile, bip, bhit, created_at
    from  sboard2
) A  
    where  A.rnum  between  0  and 10;
 
      
-- mysql ( oracle에서는 동작안함)
  select *  from  sboard2   order by    id   desc   limit  0, 10 ;     
  

* 해당번호의 select
  select *  from  sboard2    where  id=21;
  
* 해당번호 조회수 올리기
  update  sboard2   set   bhit = bhit + 1  where  id=21;

* 해당번호 업데이트
  update  sboard2  set  btitle='new' , bcontent='new' , bfile='2.png'  where  id=21;
  
  select *  from  sboard2;

* 해당번호 삭제
  delete  from  sboard2   where  id=21;
  
select *  from  sboard2;

INSERT INTO sboard2 (ID, APP_USER_ID, BTITLE, BCONTENT, BPASS, BIP, CREATED_AT) 
SELECT (SELECT NVL(MAX(ID), 0) FROM sboard2) + ROWNUM, APP_USER_ID, BTITLE, BCONTENT, BPASS, BIP, SYSDATE 
FROM sboard2;

commit;
  
insert into  sboard2 ( ID ,  APP_USER_ID ,  BTITLE  ,  BCONTENT  ,  BPASS  ,  BFILE  ,  BIP  )
  values ( sboard2_seq.nextval ,  1002    ,  'title'   , 'bcontent'  ,  '1111' ,  '1.png' ,  '127.0.0.1' );
  
insert into  sboard2 ( ID ,  APP_USER_ID ,  BTITLE  ,  BCONTENT  ,  BPASS  ,  BFILE  ,  BIP  )
  values ( sboard2_seq.nextval ,  1003    ,  'title'   , 'bcontent'  ,  '1111' ,  '1.png' ,  '127.0.0.1' );  

insert into  sboard2 ( ID ,  APP_USER_ID ,  BTITLE  ,  BCONTENT  ,  BPASS  ,  BFILE  ,  BIP  )
  values ( sboard2_seq.nextval ,  1004    ,  'title'   , 'bcontent'  ,  '1111' ,  '1.png' ,  '127.0.0.1' );
  
  insert into  sboard2 ( ID ,  APP_USER_ID ,  BTITLE  ,  BCONTENT  ,  BPASS  ,  BFILE  ,  BIP  )
  values ( sboard2_seq.nextval ,  1005    ,  'title'   , 'bcontent'  ,  '1111' ,  '1.png' ,  '127.0.0.1' );
  
  insert into  sboard2 ( ID ,  APP_USER_ID ,  BTITLE  ,  BCONTENT  ,  BPASS  ,  BFILE  ,  BIP  )
  values ( sboard2_seq.nextval ,  1006    ,  'title'   , 'bcontent'  ,  '1111' ,  '1.png' ,  '127.0.0.1' );
  
  insert into  sboard2 ( ID ,  APP_USER_ID ,  BTITLE  ,  BCONTENT  ,  BPASS  ,  BFILE  ,  BIP  )
  values ( sboard2_seq.nextval ,  1007    ,  'title'   , 'bcontent'  ,  '1111' ,  '1.png' ,  '127.0.0.1' );
  
  insert into  sboard2 ( ID ,  APP_USER_ID ,  BTITLE  ,  BCONTENT  ,  BPASS  ,  BFILE  ,  BIP  )
  values ( sboard2_seq.nextval ,  1008    ,  'title'   , 'bcontent'  ,  '1111' ,  '1.png' ,  '127.0.0.1' );
  
  insert into  sboard2 ( ID ,  APP_USER_ID ,  BTITLE  ,  BCONTENT  ,  BPASS  ,  BFILE  ,  BIP  )
  values ( sboard2_seq.nextval ,  1009    ,  'title'   , 'bcontent'  ,  '1111' ,  '1.png' ,  '127.0.0.1' );
  
  insert into  sboard2 ( ID ,  APP_USER_ID ,  BTITLE  ,  BCONTENT  ,  BPASS  ,  BFILE  ,  BIP  )
  values ( sboard2_seq.nextval ,  1010    ,  'title'   , 'bcontent'  ,  '1111' ,  '1.png' ,  '127.0.0.1' );
  
  
  select *  from  sboard2;
  
insert into sboard2 ( ID ,  APP_USER_ID ,  BTITLE  ,  BCONTENT  ,  BPASS  ,  BFILE  ,  BIP  )
values(sboard2_seq.nextval , 1020 , 'title1' , 'bcontent1' , '1111' , '11.png' , '127.0.0.1');
insert into sboard2 ( ID ,  APP_USER_ID ,  BTITLE  ,  BCONTENT  ,  BPASS  ,  BFILE  ,  BIP  )
values(sboard2_seq.nextval , 1021 , 'title2' , 'bcontent2' , '1111' , '12.png' , '127.0.0.1');
insert into sboard2 ( ID ,  APP_USER_ID ,  BTITLE  ,  BCONTENT  ,  BPASS  ,  BFILE  ,  BIP  )
values(sboard2_seq.nextval , 1022 , 'title3' , 'bcontent3' , '1111' , '13.png' , '127.0.0.1');
insert into sboard2 ( ID ,  APP_USER_ID ,  BTITLE  ,  BCONTENT  ,  BPASS  ,  BFILE  ,  BIP  )
values(sboard2_seq.nextval , 1023 , 'title4' , 'bcontent4' , '1111' , '14.png' , '127.0.0.1');
insert into sboard2 ( ID ,  APP_USER_ID ,  BTITLE  ,  BCONTENT  ,  BPASS  ,  BFILE  ,  BIP  )
values(sboard2_seq.nextval , 1024 , 'title5' , 'bcontent5' , '1111' , '15.png' , '127.0.0.1');
insert into sboard2 ( ID ,  APP_USER_ID ,  BTITLE  ,  BCONTENT  ,  BPASS  ,  BFILE  ,  BIP  )
values(sboard2_seq.nextval , 1025 , 'title6' , 'bcontent6' , '1111' , '16.png' , '127.0.0.1');
insert into sboard2 ( ID ,  APP_USER_ID ,  BTITLE  ,  BCONTENT  ,  BPASS  ,  BFILE  ,  BIP  )
values(sboard2_seq.nextval , 1026 , 'title7' , 'bcontent7' , '1111' , '17.png' , '127.0.0.1');

commit;

select *  from  sboard2;

desc sboard2;

--## 1. 전체 서비스 로직 흐름 (Service Workflow)
--[고객: 이미지 업로드]
--↓
--1. Controller가 파일 수신 후 Storage에 저장
--2. OCR Service 호출 ➡️ 이미지에서 비정형 텍스트(품명, 규격, 수량) 추출 및 JSON 정형화
--3. OpenAI Service 호출 ➡️ 정형화된 데이터 + 과거 시세 기반 AI 가견적 산출 및 DB 저장 (`ESTIMATE`)
--4. Notification Service 호출 ➡️ 해당 자재를 취급하는 협력사(Partner) 조회
--5. 협력사 담당자에게 알림톡/메일 발송 (이때, 응답을 받을 수 있는 고유 Webhook URL 포함)
--↓
--[협력사: 알림톡 내 '재고 있음/없음' 버튼 클릭]
--↓
--6. Webhook Controller가 응답 수신 ➡️ DB의 재고 확인 상태(`status`)를 실시간 업데이트
--7. 매칭 완료 시 고객에게 최종 확정 견적 알림 발송

## 2. 데이터베이스 테이블 설계 (DDL)

##1)   실행
-- 1. 기존 게시판 테이블에 AI 자동견적 필드 추가
ALTER TABLE sboard2 ADD (
AI_PREDICTED_PRICE NUMBER,              -- AI가 산출한 단일 가견적 금액
ESTIMATE_STATUS    VARCHAR2(20) DEFAULT 'PENDING', -- PENDING, MATCHED, FAILED
WEBHOOK_TOKEN      VARCHAR2(100)        -- 협력사 응답을 매칭할 고유 토큰
);

--##2)   참고)
--CREATE TABLE sboard2 (
--ID                  NUMBER NOT NULL,               -- 게시글 고유 ID (PK)
--APP_USER_ID         NUMBER NOT NULL,               -- 작성자 유저 ID
--BTITLE              VARCHAR2(1000) NOT NULL,       -- 게시글 제목 (견적 요청명)
--BCONTENT            CLOB NOT NULL,                 -- 게시글 내용 (OCR 추출 비정형 텍스트 원본)
--BPASS               VARCHAR2(255) NOT NULL,        -- 게시글 비밀번호
--BFILE               VARCHAR2(255),                 -- 업로드한 명세서/도면 파일명
--BHIT                NUMBER DEFAULT 0,              -- 조회수
--BIP                 VARCHAR2(255) NOT NULL,        -- 작성자 IP 주소
--CREATED_AT          DATE DEFAULT SYSDATE,          -- 작성일시
--
---- [AI 자동견적 확장 컬럼]
--AI_PREDICTED_PRICE  NUMBER,                        -- OpenAI가 산출한 단일 가견적 금액
--ESTIMATE_STATUS     VARCHAR2(20) DEFAULT 'PENDING',-- 견적 진행 상태 (PENDING, MATCHED, FAILED)
--WEBHOOK_TOKEN       VARCHAR2(100),                 -- 협력사 외부 응답 매칭용 고유 UUID 토큰
--
--CONSTRAINT pk_sboard2 PRIMARY KEY (ID);
--);


ALTER TABLE sboard2
ADD CONSTRAINT sboard2_pk PRIMARY KEY (ID);

--### 2. PARTNER_MSTR (협력사 마스터 테이블 - 신규 필요)
--
--알림(메일/문자/알림톡)을 발송할 대상이 되는 외부 협력사들의 인적 사항 및 도메인 정보를 관리하는 기준 테이블입니다.


CREATE TABLE partner_mstr (
PARTNER_ID          NUMBER GENERATED BY DEFAULT AS IDENTITY, -- 협력사 고유 ID (PK)
PARTNER_NAME        VARCHAR2(100) NOT NULL,        -- 협력사 회사명 (예: (주)테크솔루션)
PARTNER_EMAIL       VARCHAR2(100) NOT NULL,        -- 알림 및 Webhook 발송용 이메일 주소
PARTNER_PHONE       VARCHAR2(20),                  -- 알림톡/문자 수신 번호
CATEGORY            VARCHAR2(50),                  -- 취급 자재 종류 (카테고리 필터링용)
STATUS              VARCHAR2(10) DEFAULT 'Y',      -- 거래 활성화 여부 (Y: 활성, N: 중단)

CONSTRAINT pk_partner_mstr PRIMARY KEY (PARTNER_ID)
);

-- 1~20: 볼트, 너트, 파스너 관련 협력사 (1단계)
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)한결파스너', 'contact@hangyeolbolt.com', '02-123-0001', '볼트/너트', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('삼우볼트공업', 'samwoo@samwoobolt.co.kr', '031-456-0002', '볼트/너트', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('대진정밀정착', 'daejin@daejinfs.com', '032-789-0003', '볼트/너트', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('유니온스크류', 'sales@unionscrew.com', '051-111-0004', '볼트/너트', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('신성파스너테크', 'shinseng@ssft.co.kr', '053-222-0005', '볼트/너트', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('태양스크류공업', 'taeyang@tyscrew.com', '02-333-0006', '볼트/너트', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('경인데이터볼트', 'gyeongin@gibolt.co.kr', '031-777-0007', '볼트/너트', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)세종화스너', 'sejong@sjfastener.com', '042-888-0008', '볼트/너트', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('제일정밀스크류', 'jeil@jeilscrew.com', '052-999-0009', '볼트/너트', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('성진금속파스너', 'sungjin@sjmetal.co.kr', '031-123-0010', '볼트/너트', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)동아스크류', 'donga@dascrew.com', '02-555-0011', '볼트/너트', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('우신파스너공업', 'wooshin@wsfs.co.kr', '032-444-0012', '볼트/너트', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('풍성금속재료', 'pungsung@psmetal.com', '054-666-0013', '볼트/너트', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('한성스크류테크', 'hansung@hsscrew.co.kr', '031-888-0014', '볼트/너트', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('대성파스너엔지니어링', 'daesung@dseng.com', '02-999-0015', '볼트/너nt', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)화성스크류', 'hwaseong@hsscrew.com', '031-222-0016', '볼트/너트', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('영진특수볼트', 'youngjin@yjbolt.co.kr', '032-333-0017', '볼트/너트', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('광명테크스크류', 'gwangmyeong@gmts.com', '02-444-0018', '볼트/너트', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)미래화스너', 'mirae@miraefs.co.kr', '041-555-0019', '볼트/너트', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('한국정밀볼트공업', 'korea@kpbolt.com', '031-666-0020', '볼트/너트', 'Y');

-- 21~40: 철판, 프레스, 금형 성형 관련 협력사
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)성우프레스', 'sungwoo@swpress.co.kr', '031-111-0021', '철판/프레스', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('대명금형레이저', 'daemyung@dmlaser.com', '032-222-0022', '철판/프레스', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('한일강판판금', 'hanil@hanilsteel.co.kr', '02-333-0023', '철판/프레스', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)세진정밀프레스', 'sejin@sjpress.com', '051-444-0024', '철판/프레스', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('동남금속레이저', 'dongnam@dnlaser.co.kr', '053-555-0025', '철판/프레스', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('삼영정밀금형', 'samyoung@symold.com', '032-666-0026', '철판/프레스', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)광성판금테크', 'gwangsung@gsmt.co.kr', '031-777-0027', '철판/프레스', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('현대정밀레이저', 'hyundai@hdlaser.com', '02-888-0028', '철판/프레스', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('신풍프레스공업', 'shinpung@sppress.co.kr', '043-999-0029', '철판/프레스', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)금강정밀판금', 'kumkang@kkmetal.com', '052-123-0030', '철판/프레스', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('대원강판프레스', 'daewon@dwpress.co.kr', '031-222-0031', '철판/프레스', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('영성레이저테크', 'youngsung@yslt.com', '032-333-0032', '철판/프레스', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)중앙금속공업', 'joongang@jametal.co.kr', '02-444-0033', '철판/프레스', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('진흥정밀금형', 'jinheung@jhmold.com', '054-555-0034', '철판/프레스', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)유니온판금', 'union@unionmetal.com', '031-666-0035', '철판/프레스', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('성일강판엔지니어링', 'sungil@sieng.co.kr', '032-777-0036', '철판/프레스', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)대한레이저', 'daehan@dhlaser.com', '02-888-0037', '철판/프레스', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('동우정밀프레스', 'dongwoo@dwpress.co.kr', '041-999-0038', '철판/프레스', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)인터메탈프레스', 'inter@intermetal.com', '031-123-0039', '철판/프레스', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('우진정밀판금', 'woojin@wjmetal.co.kr', '032-222-0040', '철판/프레스', 'Y');

-- 41~60: PCB 회로, 기판 관련 협력사
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)대덕전자回路', 'daeduck@ddpcb.co.kr', '031-444-0041', 'PCB/회로', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('성우전자기판', 'sungwoo@swpcb.com', '032-555-0042', 'PCB/회로', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('한성서킷테크', 'hansung@hscircuit.co.kr', '02-666-0043', 'PCB/회로', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)제이앤씨테크', 'jnc@jnctech.com', '051-777-0044', 'PCB/회로', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('미래전자서킷', 'mirae@mrcircuit.co.kr', '053-888-0045', 'PCB/회로', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)코리아서킷트', 'korea@koreacircuit.com', '031-999-0046', 'PCB/회로', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('신화전자기판', 'shinhwa@shpcb.co.kr', '032-111-0047', 'PCB/회로', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)인터플렉스테크', 'inter@interflex.com', '02-222-0048', 'PCB/회로', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('동양전자서킷', 'dongyang@dypcb.co.kr', '042-333-0049', 'PCB/회로', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)에스앤티서킷', 'snt@sntpcb.com', '052-444-0050', 'PCB/회로', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('뉴텍전자회로', 'newtech@ntpcb.co.kr', '031-555-0051', 'PCB/회로', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)지에스피씨비', 'gspcb@gspcb.com', '032-666-0052', 'PCB/회로', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('삼정전자기판', 'samjung@sjpcb.co.kr', '02-777-0053', 'PCB/회로', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)하이테크서킷', 'hitech@htpcb.com', '054-888-0054', 'PCB/회로', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('우리전자회로', 'woori@wrpcb.co.kr', '031-999-0055', 'PCB/회로', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)탑플러스피씨비', 'topplus@tppcb.com', '032-123-0056', 'PCB/회로', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('태양전자서킷', 'taeyang@typcb.co.kr', '02-234-0057', 'PCB/회로', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)에이플러스테크', 'aplus@apluspcb.com', '041-345-0058', 'PCB/회로', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('제일서킷라인', 'jeil@jeilpcb.co.kr', '031-456-0059', 'PCB/회로', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)글로벌전자회로', 'global@gbpcb.com', '032-567-0060', 'PCB/회로', 'Y');

-- 61~80: 전자 센서 및 반도체 소자 관련 협력사
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)한텍센서', 'hantech@htsensor.com', '031-111-0061', '센서/반도체', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('경인일렉트릭', 'gyeongin@gielectric.co.kr', '032-222-0062', '센서/반도체', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('삼우반도체테크', 'samwoo@swsemi.co.kr', '02-333-0063', '센서/반도체', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)케이엠디바이스', 'km@kmdevice.com', '051-444-0064', '센서/반도체', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('세종전자기기', 'sejong@sjelec.co.kr', '053-555-0065', '센서/반도체', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)마이크로센서', 'micro@mcsensor.com', '031-666-0066', '센서/반도체', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('대명디바이스텍', 'daemyung@dmdev.co.kr', '032-777-0067', '센서/반도체', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)나노세미콘', 'nano@nanosemi.com', '02-888-0068', '센서/반도체', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('우진일렉트로닉스', 'woojin@wjelec.co.kr', '043-999-0069', '센서/반도체', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)스마트센싱테크', 'smart@smtsensing.com', '052-123-0070', '센서/반도체', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('에이치앤티일렉', 'hnt@hntelec.co.kr', '031-222-0071', '센서/반도체', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)한국모듈테크', 'korea@kmodule.com', '032-333-0072', '센서/반도체', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('신성일렉트로닉스', 'shinseng@sselec.co.kr', '02-444-0073', '센서/반도체', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)에스엠디바이스', 'sm@smdevice.co.kr', '054-555-0074', '센서/반도체', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('제이텍솔루션', 'jtech@jtsol.com', '031-666-0075', '센서/반도체', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)코아반도체', 'core@coresemi.co.kr', '032-777-0076', '센서/반도체', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('광성디바이스', 'gwangsung@gsdev.com', '02-888-0077', '센서/반도체', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)아이센서테크', 'isensor@istech.co.kr', '041-999-0078', '센서/반도체', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('미래일렉트로닉스', 'mirae@mrelec.com', '031-123-0079', '센서/반도체', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)유니반도체', 'uni@unisemi.co.kr', '032-222-0080', '센서/반도체', 'Y');

-- 81~100: 플라스틱 외장, 하우징, 사출 성형 관련 협력사
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)한성사출', 'hansung@hsplastic.com', '031-444-0081', '플라스틱/사출', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('삼우화학엔지니어링', 'samwoo@swchem.co.kr', '032-555-0082', '플라스틱/사출', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('대진정밀사출', 'daejin@djplastic.com', '02-666-0083', '플라스틱/사출', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)신성하우징테크', 'shinseng@sshf.co.kr', '051-777-0084', '플라스틱/사출', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('동남플라스틱', 'dongnam@dnplastic.co.kr', '053-888-0085', '플라스틱/사출', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)세종몰딩', 'sejong@sjmold.com', '031-999-0086', '플라스틱/사출', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('제일정밀사출공업', 'jeil@jeilplast.co.kr', '032-111-0087', '플라스틱/사출', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)풍성정밀화학', 'pungsung@pschem.com', '02-222-0088', '플라스틱/사출', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('경인몰드테크', 'gyeongin@gimold.co.kr', '042-333-0089', '플라스틱/사출', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)진흥하우징', 'jinheung@jhhousing.com', '052-444-0090', '플라스틱/사출', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('우신정밀사출', 'wooshin@wsplast.co.kr', '031-555-0091', '플라스틱/사출', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)국제플라스틱', 'kukje@kjplast.com', '032-666-0092', '플라스틱/사출', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('태양화학몰딩', 'taeyang@tymold.co.kr', '02-777-0093', '플라스틱/사출', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)대성정밀사출', 'daesung@dsplast.co.kr', '054-888-0094', '플라스틱/사출', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('영진테크플라스틱', 'youngjin@yjplast.co.kr', '031-999-0095', '플라스틱/사출', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)성진몰딩테크', 'sungjin@sjmold.com', '032-123-0096', '플라스틱/사출', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('현대정밀화학', 'hyundai@hdchem.co.kr', '02-234-0097', '플라스틱/사출', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)유니온하우징', 'union@unhousing.com', '041-345-0098', '플라스틱/사출', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('대명플라스틱공업', 'daemyung@dmplast.co.kr', '031-456-0099', '플라스틱/사출', 'Y');
INSERT INTO partner_mstr (PARTNER_NAME, PARTNER_EMAIL, PARTNER_PHONE, CATEGORY, STATUS) VALUES ('(주)미래몰딩테크', 'mirae@mrmold.co.kr', '032-567-0100', '플라스틱/사출', 'Y');

COMMIT;

select *  from  partner_mstr;

desc partner_mstr;
--### 3. PARTNER_CHECK_LOG (재고 확인 이력 로그 테이블 - 신규 필요)
--
--어떤 게시글(`BOARD_ID`)에 대해 어떤 협력사(`PARTNER_ID`)들에게 재고 확인(있어요?) 알림을 보냈고, 그들이 언제 무슨 응답을 남겼는지 추적하는 다대다(N:M) 매핑 로그 테이블입니다.


CREATE TABLE partner_check_log (
ID                  NUMBER GENERATED BY DEFAULT AS IDENTITY, -- 로그 고유 ID (PK)
BOARD_ID            NUMBER NOT NULL,               -- sboard2 테이블 연동 (FK)
PARTNER_ID          NUMBER NOT NULL,               -- partner_mstr 테이블 연동 (FK)
RESPONSE_STATUS     VARCHAR2(20) DEFAULT 'WAITING',-- 협력사 응답 상태 (WAITING, AVAILABLE, UNAVAILABLE)
UPDATED_AT          DATE,                          -- 협력사가 버튼을 클릭한 시간 (Webhook 수신 시 기록)

CONSTRAINT pk_partner_check_log PRIMARY KEY (ID),
CONSTRAINT fk_log_board FOREIGN KEY (BOARD_ID) REFERENCES sboard2(ID) ON DELETE CASCADE,
CONSTRAINT fk_log_partner FOREIGN KEY (PARTNER_ID) REFERENCES partner_mstr(PARTNER_ID)
);

select *  from  partner_check_log;

desc partner_check_log;