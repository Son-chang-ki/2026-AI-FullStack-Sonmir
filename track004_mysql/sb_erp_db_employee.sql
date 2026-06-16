CREATE TABLE IF NOT EXISTS `sb_erp_db`.`employee` (
  `emp_id` INT NOT NULL  AUTO_INCREMENT,
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
    ON UPDATE NO ACTION);
    
    
INSERT INTO `sb_erp_db`.`employee` 
(`emp_id`, `com_id`, `pos_id`, `dept_id`, `emp_no`, `emp_name`, `emp_pass`, `emp_email`, `emp_mobile`, `emp_status`, `hire_date`) 
VALUES 
(1, 1, 2, 10, '20260001', '이영희', 'hashed_password_123', 'yh.lee@abctech.com', '010-1234-5678', '재직', '2026-01-01'),
(2, 1, 1, 11, '20260002', '박민수', 'hashed_password_456', 'ms.park@abctech.com', '010-8765-4321', '재직', '2026-03-01');

    
    
    CREATE TABLE IF NOT EXISTS `sb_erp_db`.`emp_position` (
  `pos_id` INT NOT NULL  AUTO_INCREMENT,
  `pos_code` VARCHAR(20) NOT NULL,
  `pos_name` VARCHAR(20) NOT NULL,
  `pos_order` INT NOT NULL,
  `com_id` INT NOT NULL,
  PRIMARY KEY (`pos_id`),
  INDEX `fk_emp_position_company1_idx` (`com_id` ASC) VISIBLE,
  CONSTRAINT `fk_emp_position_company1`
    FOREIGN KEY (`com_id`)
    REFERENCES `sb_erp_db`.`company` (`com_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
    
    INSERT INTO `sb_erp_db`.`emp_position` 
(`com_id`, `pos_code`, `pos_name`, `pos_order`) 
VALUES 
(1, 'P01', '사원', 1),
(1, 'P05', '팀장', 5);