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
-- CREATE TABLE sb_erp (
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
-- | bdate    | timestamp     | YES  |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
-- | bhit     | int           | NO   |     | 0                 |                   |
-- | bfile    | varchar(500)  | YES  |     | NULL              |                   |
-- +----------+---------------+------+-----+-------------------+-------------------+
-- 7 rows in set (0.00 sec)
-- alter table sb_erp add bhit int not null DEFAULT 0;

-- alter table sb_erp change title  btitle VARCHAR(200) NOT NULL;
-- alter table sb_erp change title  btitle VARCHAR(200) NOT NULL;
-- alter table sb_erp change content  bcontent VARCHAR(1000) NOT NULL;
-- alter table sb_erp change writer  bwriter VARCHAR(1000) NOT NULL;
-- alter table sb_erp change date  bdate TIMESTAMP DEFAULT CURRENT_TIMESTAMP;
-- alter table sb_erp change uno  bno int not null auto_increment primary key;
-- alter table sb_erp change  bfile bfile varchar(500)  null;
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


