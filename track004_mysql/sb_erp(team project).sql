-- 번호   이름, ※부서, ※직급, 이메일, 연락처, 재직 상태, 입사일
-- 1.    first, 총무부, 부장, first@gmail.com, 01011111111, 재직, 2026-06-12
-- 2.    second, 총무부, 부장, first@gmail.com, 01011111111, 재직, 2026-06-12

-- 📄 DB 테이블 예시
use mbasic;
CREATE TABLE sb_erp (
    uno int not null auto_increment primary key,
    title VARCHAR(200) NOT NULL,
    content TEXT NOT NULL,
    writer VARCHAR(100) NOT NULL,
    date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );
desc sb_erp;