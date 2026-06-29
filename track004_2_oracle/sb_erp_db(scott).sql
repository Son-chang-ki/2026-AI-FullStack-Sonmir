CREATE TABLE company (
  com_id            NUMBER NOT NULL,
  industry_grp_code VARCHAR2(100) NOT NULL,
  industry_code     VARCHAR2(100) NOT NULL,
  com_name          VARCHAR2(100) NOT NULL,
  com_ceo           VARCHAR2(100) NOT NULL,
  biz_no            VARCHAR2(45) NOT NULL,
  com_tel           VARCHAR2(100),
  com_logo          VARCHAR2(500),
  created_at        DATE DEFAULT SYSDATE NOT NULL,
  updated_at        DATE DEFAULT SYSDATE NOT NULL,
  CONSTRAINT pk_company PRIMARY KEY (com_id),
  CONSTRAINT uq_company_biz_no UNIQUE (biz_no)
);

CREATE SEQUENCE seq_company START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;

CREATE OR REPLACE TRIGGER trg_company_bi
BEFORE INSERT ON company
FOR EACH ROW
BEGIN
  IF :NEW.com_id IS NULL THEN
    SELECT seq_company.NEXTVAL INTO :NEW.com_id FROM dual;
  END IF;
END;

CREATE OR REPLACE TRIGGER trg_company_bu
BEFORE UPDATE ON company
FOR EACH ROW
BEGIN
  :NEW.updated_at := SYSDATE;
END;
------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `sb_erp_db`.`employee` (
  `emp_id` INT NOT NULL DEFAULT AUTO_INCREMENT,
  `emp_no` VARCHAR(20) NOT NULL,
  `emp_name` VARCHAR(50) NOT NULL,
  `emp_pass` VARCHAR(500) NOT NULL,
  `emp_email` VARCHAR(100) NOT NULL,
  `emp_mobile` VARCHAR(20) NOT NULL,
  `emp_status` VARCHAR(10) NULL DEFAULT '재직',
  `hire_date` DATE NULL,
  `created_at` DATETIME NULL DEFAULT current_timestamp,
  `updated_at` DATETIME NULL DEFAULT current_timestamp on update current_timestamp,
  `com_id` INT NOT NULL,
  `pos_id` INT NOT NULL,
  `dept_id` INT NOT NULL,
  PRIMARY KEY (`emp_id`),
  INDEX `fk_employee_company1_idx` (`com_id` ASC) VISIBLE,
  INDEX `fk_employee_emp_position1_idx` (`pos_id` ASC) VISIBLE,
  INDEX `fk_employee_department1_idx` (`dept_id` ASC) VISIBLE,
  CONSTRAINT `fk_employee_company1`
    FOREIGN KEY (`com_id`)
    REFERENCES `sb_erp_db`.`company` (`com_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_employee_emp_position1`
    FOREIGN KEY (`pos_id`)
    REFERENCES `sb_erp_db`.`emp_position` (`pos_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_employee_department1`
    FOREIGN KEY (`dept_id`)
    REFERENCES `sb_erp_db`.`department` (`dept_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);



----------------------------------------------------------
CREATE TABLE notice (
  bno         NUMBER NOT NULL,
  emp_id      NUMBER NOT NULL,
  com_id      NUMBER NOT NULL,
  btitle      VARCHAR2(200) NOT NULL,
  bcontent    VARCHAR2(1000) NOT NULL,
  bhit        NUMBER DEFAULT 0 NOT NULL,
  bfile       VARCHAR2(500),
  created_at  DATE DEFAULT SYSDATE NOT NULL,
  updated_at  DATE DEFAULT SYSDATE NOT NULL,
  CONSTRAINT pk_notice PRIMARY KEY (bno),
  CONSTRAINT fk_notice_employee1
    FOREIGN KEY (emp_id) REFERENCES employee (emp_id),
  CONSTRAINT fk_notice_company1
    FOREIGN KEY (com_id) REFERENCES company (com_id)
);

CREATE SEQUENCE seq_notice START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;

-- Trigger: 특정 이벤트가 발생하면 자동으로 실행되는 코드
CREATE OR REPLACE TRIGGER trg_notice_bi
BEFORE INSERT ON notice -- "notice 테이블에 insert 되기전에" 실행
FOR EACH ROW            -- 입력되는 행(row) 하나하나마다 실행
BEGIN
  IF :NEW.bno IS NULL THEN    -- 새로 들어올 값(:NEW)의 bno 가 비어있으면
    SELECT seq_notice.NEXTVAL INTO :NEW.bno FROM dual; -- 시퀀스에서 다음 번호를 가져와 채워넣음
  END IF;
END;

-- Trigger: 특정 이벤트가 발생하면 자동으로 실행되는 코드
CREATE OR REPLACE TRIGGER trg_notice_bu
BEFORE UPDATE ON notice -- "notice 테이블에 update 되기전에" 실행
FOR EACH ROW            -- 입력되는 행(row) 하나하나마다 실행
BEGIN
  :NEW.updated_at := SYSDATE; -- 새로들어올 값에 현재 날짜 값으로 변경함
END;