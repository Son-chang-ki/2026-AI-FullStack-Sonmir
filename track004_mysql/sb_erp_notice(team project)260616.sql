create database sb_erp_db;
use sb_erp_db;
desc sb_erp_db;

CREATE TABLE IF NOT EXISTS `sb_erp_db`.`notice` (
  `bno` INT NOT NULL AUTO_INCREMENT,
  `btitle` VARCHAR(200) NOT NULL,
  `bcontent` VARCHAR(1000) NOT NULL,
  `bhit` INT NOT NULL DEFAULT 0,
  `bfile` VARCHAR(500) NULL,
  `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `emp_id` INT NOT NULL,
  `com_id` INT NOT NULL,
  PRIMARY KEY (`bno`),
  INDEX `fk_notice_employee1_idx` (`emp_id` ASC) VISIBLE,
  INDEX `fk_notice_company1_idx` (`com_id` ASC) VISIBLE,
  CONSTRAINT `fk_notice_employee1`
    FOREIGN KEY (`emp_id`)
    REFERENCES `sb_erp_db`.`employee` (`emp_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_notice_company1`
    FOREIGN KEY (`com_id`)
    REFERENCES `sb_erp_db`.`company` (`com_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
show table notice;
SHOW TABLES IN sb_erp_db;
show table sb_erp_db.notie;
desc sb_erp_db.notie;
SHOW TABLES IN sb_erp_db;
DESC sb_erp_db.notice;
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


insert into notice (com_id, btitle, bcontent, emp_id, bhit, bfile)
values
(1, 'ERP 시스템 점검 안내', '6월 20일 22시~24시 ERP 시스템 점검 예정입니다.', 1003, 12, null),
(1, '인사관리 규정 개정', '직급/재직 상태 관련 규정이 개정되었습니다.', 1004, 34, 'insa_rule.pdf'),
(2, '카카오 신규 서비스 발표', '신규 서비스 PoC 결과 발표 예정입니다.', 2001, 56, null);

-- | bno (PK) |comid (FK) | btitle | bcontent | bwriter (FK) | bhit | bfile | createdat | updatedat |
-- | 번호 (공지 PK) | 회사ID (FK → company) | 제목 | 내용 | 작성자ID (FK → employee) | 조회수 | 첨부파일명 | 등록일자 | 수정일자 |
-- | 1 | 1 | ERP 시스템 점검 안내 | 6월 20일 22시~24시 ERP 시스템 점검 예정 | 1003 | 12 | (NULL) | 2026-06-15 12:25:00 | 2026-06-15 12:25:00 |
-- | 2 | 1 | 인사관리 규정 개정 | 직급/재직 상태 관련 규정이 개정되었습니다. | 1004 | 34 | insa_rule.pdf | 2026-06-16 09:10:00 | 2026-06-16 09:10:00 |
-- | 3 | 2 | 카카오 신규 서비스 발표 | 신규 서비스 PoC 결과 발표 예정입니다. | 2001 | 56 | (NULL) | 2026-06-16 11:00:00 | 2026-06-16 11:00:00 |

-- SHOW TABLES IN sb_erp_db;
-- mysql> DESC sb_erp_db.notice;
-- +------------+---------------+------+-----+-------------------+-----------------------------------------------+
-- | Field      | Type          | Null | Key | Default           | Extra                                         |
-- +------------+---------------+------+-----+-------------------+-----------------------------------------------+
-- | bno        | int           | NO   | PRI | NULL              | auto_increment                                |
-- | btitle     | varchar(200)  | NO   |     | NULL              |                                               |
-- | bcontent   | varchar(1000) | NO   |     | NULL              |                                               |
-- | bhit       | int           | NO   |     | 0                 |                                               |
-- | bfile      | varchar(500)  | YES  |     | NULL              |                                               |
-- | created_at | datetime      | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED                             |
-- | updated_at | datetime      | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED on update CURRENT_TIMESTAMP |
-- | emp_id     | int           | NO   | MUL | NULL              | => bwriter                                    |
-- | com_id     | int           | NO   | MUL | NULL              | => 회사ID                                      |
-- +------------+---------------+------+-----+-------------------+-----------------------------------------------+
-- 9 rows in set (0.00 sec)

desc notice;
select * from notice;

INSERT INTO notice (com_id, btitle, bcontent, emp_id, bhit, bfile)
VALUES 
(1, 'ERP 시스템 점검 안내', '6월 20일 22시~24시 ERP 시스템 점검 예정입니다.', 1, 12, NULL),
(1, '인사관리 규정 개정', '직급/재직 상태 관련 규정이 개정되었습니다.', 2, 34, 'insa_rule.pdf');


-- mysql> select * from sb_erp_db.notice;
-- +-----+----------------------+------------------------------------------------+------+---------------+---------------------+---------------------+--------+--------+
-- | bno | btitle               | bcontent                                       | bhit | bfile         | created_at          | updated_at          | emp_id | com_id |
-- +-----+----------------------+------------------------------------------------+------+---------------+---------------------+---------------------+--------+--------+
-- |  15 | ERP 시스템 점검 안내 | 6월 20일 22시~24시 ERP 시스템 점검 예정입니다. |   12 | NULL          | 2026-06-16 17:52:20 | 2026-06-16 17:52:20 |      1 |      1 |
-- |  16 | 인사관리 규정 개정   | 직급/재직 상태 관련 규정이 개정되었습니다.     |   34 | insa_rule.pdf | 2026-06-16 17:52:20 | 2026-06-16 17:52:20 |      2 |      1 |
-- +-----+----------------------+------------------------------------------------+------+---------------+---------------------+---------------------+--------+--------+
-- 2 rows in set (0.00 sec)

-- -----------------------------------------------------------------------------
-- -----------------------------------------------------------------------------

-- >1. dto
-- >2. mapper
-- ```
-- 1page
-- 1) 페이징-select
-- 2) 검색  -select

-- 2page
-- 3) 공지사항등록 - insert

-- 3page
-- 4) 상세페이지-select / update(조회수)

-- 4page
-- 5) 수정수정페이지-select / update(수정기능)
-- ```

-- >3. service
-- >4. controller
-- >5. view