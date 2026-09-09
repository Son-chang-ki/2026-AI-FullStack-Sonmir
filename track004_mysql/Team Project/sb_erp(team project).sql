-- 번호   이름, ※부서, ※직급, 이메일, 연락처, 재직 상태, 입사일
-- 1.    first, 총무부, 부장, first@gmail.com, 01011111111, 재직, 2026-06-12
-- 2.    second, 총무부, 부장, first@gmail.com, 01011111111, 재직, 2026-06-12

-- 팀 프로젝트
-- Database 명: sb_erp_db
-- package: com.sb.erp.*
-- 우리 mapper.xml 모으는 위치: com.sb.erp.dao
-- => 프로젝트 초기 설정 및 공통 셋업 설정

-- 저희 github 초기 설정 main 브랜치에 올려놨습니다.
-- [본인 브랜치]에서 git pull origin main 진행 후 개발을 진행하시면 됩니다.
-- 만약 다른 게 떴다면 esc 누르고 :wq! + 엔터 치시면 머지되어 본인이 작성했던 내용 위에 덮어씌여지는 것이니 참고 바랍니다.

-- 📄 DB 테이블 예시
-- use mbasic;
-- CREATE TABLE notice (
--     uno int not null auto_increment primary key,
--     title VARCHAR(200) NOT NULL,
--     content TEXT NOT NULL,
--     writer VARCHAR(100) NOT NULL,
--     date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
--     );
-- desc sb_erp;
-- mysql> desc sb_erp;
-- +----------+---------------+------+-----+-------------------+-------------------+
-- | Field    | Type          | Null | Key | Default           | Extra             |
-- +----------+---------------+------+-----+-------------------+-------------------+
-- | uno      | int           | NO   | PRI | NULL              | auto_increment    |
-- | btitle   | varchar(200)  | NO   |     | NULL              |                   |
-- | bcontent | varchar(1000) | NO   |     | NULL              |                   |
-- | bwriter  | varchar(1000) | NO   |     | NULL              |                   |
-- | bdate    | timestamp     | no  |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
-- | bhit     | int           | NO   |     | 0                 |                   |
-- | bfile    | varchar(1000)  | YES  |     | NULL              |                   |
-- +----------+---------------+------+-----+-------------------+-------------------+
-- 7 rows in set (0.00 sec)
-- 작성자 ==> 사원id 변경 가능성이 높음. ==> int not null
-- alter table sb_erp add bhit int not null DEFAULT 0;

-- alter table sb_erp change title  btitle VARCHAR(200) NOT NULL;
-- alter table sb_erp change title  btitle VARCHAR(200) NOT NULL;
-- alter table sb_erp change content  bcontent VARCHAR(1000) NOT NULL;
-- alter table sb_erp change writer  bwriter VARCHAR(1000) NOT NULL;
-- alter table sb_erp change date  bdate TIMESTAMP DEFAULT CURRENT_TIMESTAMP;
-- alter table sb_erp change uno  bno int not null auto_increment primary key;
-- alter table sb_erp change  bfile bfile varchar(10000)  not null;
-- insert into  sb_erp  (uno, btitle,  bcontent, bwriter)  values  (1, 'first' , '공지'  ,  'aaaaa');
-- insert into  sb_erp  (uno, btitle,  bcontent, bwriter)  values  (2, 'second' , '공지2'  ,  'bbbb');

-- select * from sb_erp;

-- mysql> select * from sb_erp;
-- +-----+--------+----------+---------+---------------------+------+-------+
-- | uno | btitle | bcontent | bwriter | bdate               | bhit | bfile |
-- +-----+--------+----------+---------+---------------------+------+-------+
-- |   1 | first  | 공지      | aaaaa   | 2026-06-15 09:24:56 |    0 | NULL  |
-- |   2 | second | 공지2     | bbbb    | 2026-06-15 09:25:37 |    0 | NULL  |
-- +-----+--------+----------+---------+---------------------+------+-------+
-- 2 rows in set (0.00 sec)

-- alter table sb_erp change sb_erp  sb_erp_db ;

create database sb_erp_db;
use sb_erp_db;
-- 작성자 ==> 사원id 변경 가능성이 높음. ==> int not null

desc sb_erp_db;

CREATE TABLE notice (
    bno int not null AUTO_INCREMENT PRIMARY KEY,   -- 공지 PK
    com_id INT NOT NULL,                           -- 회사 FK
    btitle VARCHAR(200) NOT NULL,             		-- 제목
    bcontent VARCHAR(1000) NOT NULL,				-- 내용
    bwriter INT NOT NULL,                 			-- 작성자 FK → employee.emp_no
    bhit int NOT NULL DEFAULT 0,					-- 조회수
	bfile varchar(1000)  NULL,						-- 첨부파일명
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP,              -- 등록일자
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, -- 수정일자
    FOREIGN KEY(com_id) REFERENCES company(com_id)
      ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY(bwriter) REFERENCES employee(emp_no)
      ON UPDATE CASCADE ON DELETE CASCADE
    );
    
    bno INT NOT NULL AUTO_INCREMENT PRIMARY KEY,   -- 공지 PK
    com_id INT NOT NULL,                   -- 회사 FK
    btitle VARCHAR(200) NOT NULL,         -- 제목
    bcontent TEXT NOT NULL,               -- 내용
    bwriter INT NOT NULL,                 -- 작성자 FK → employee.emp_no
    bhit INT DEFAULT 0,                   -- 조회수
    bfile VARCHAR(200),                   -- 첨부파일명
    createdat DATETIME DEFAULT CURRENT_TIMESTAMP,              -- 등록일자
    updatedat DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, -- 수정일자
    FOREIGN KEY(com_id) REFERENCES company(com_id)
      ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY(bwriter) REFERENCES employee(emp_no)
      ON UPDATE CASCADE ON DELETE CASCADE
);    
    
 insert into  notice  (bno, btitle,  bcontent, bwriter)  values  (1, 'first' , '공지'  ,  'aaaaa');
 insert into  notice  (bno, btitle,  bcontent, bwriter)  values  (2, 'second' , '공지2'  ,  'bbbb');


-- 1. 손창기

-- | ★7.  전사 공지 관리 | 사용자 | 관리자 |
-- | --- | --- | --- |
-- | CREATE | X | 공지 등록  |
-- | READ | 전체 공지(페이징) ,  공지 상세보기, 검색 |  |
-- | UPDATE | X | 공지 수정 |
-- | DELETE | X | 공지 삭제 |

-- create table notice(
--     b_no INT AUTO_INCREMENT PRIMARY KEY,   -- 공지 PK
--     com_id INT NOT NULL,                   -- 회사 FK
--     b_title VARCHAR(200) NOT NULL,         -- 제목
--     b_content TEXT NOT NULL,               -- 내용
--     b_writer INT NOT NULL,                 -- 작성자 FK → employee.emp_no
--     b_hit INT DEFAULT 0,                   -- 조회수
--     b_file VARCHAR(200),                   -- 첨부파일명
--     created_at DATETIME DEFAULT CURRENT_TIMESTAMP,              -- 등록일자
--     updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, -- 수정일자
--     FOREIGN KEY(com_id) REFERENCES company(com_id)
--       ON UPDATE CASCADE ON DELETE CASCADE,
--     FOREIGN KEY(b_writer) REFERENCES employee(emp_no)
--       ON UPDATE CASCADE ON DELETE CASCADE
-- );


-- insert into notice (bcomid, btitle, bcontent, bwriter, bhit, bfile)
-- values
-- (1, 'ERP 시스템 점검 안내', '6월 20일 22시~24시 ERP 시스템 점검 예정입니다.', 1003, 12, null),
-- (1, '인사관리 규정 개정', '직급/재직 상태 관련 규정이 개정되었습니다.', 1004, 34, 'insa_rule.pdf'),
-- (2, '카카오 신규 서비스 발표', '신규 서비스 PoC 결과 발표 예정입니다.', 2001, 56, null);

-- | bno (PK) |comid (FK) | btitle | bcontent | bwriter (FK) | bhit | bfile | createdat | updatedat |
-- | 번호 (공지 PK) | 회사ID (FK → company) | 제목 | 내용 | 작성자ID (FK → employee) | 조회수 | 첨부파일명 | 등록일자 | 수정일자 |
-- | 1 | 1 | ERP 시스템 점검 안내 | 6월 20일 22시~24시 ERP 시스템 점검 예정 | 1003 | 12 | (NULL) | 2026-06-15 12:25:00 | 2026-06-15 12:25:00 |
-- | 2 | 1 | 인사관리 규정 개정 | 직급/재직 상태 관련 규정이 개정되었습니다. | 1004 | 34 | insa_rule.pdf | 2026-06-16 09:10:00 | 2026-06-16 09:10:00 |
-- | 3 | 2 | 카카오 신규 서비스 발표 | 신규 서비스 PoC 결과 발표 예정입니다. | 2001 | 56 | (NULL) | 2026-06-16 11:00:00 | 2026-06-16 11:00:00 |
