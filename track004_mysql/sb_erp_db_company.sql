CREATE TABLE IF NOT EXISTS `sb_erp_db`.`company` (
  `com_id` INT NOT NULL,
  `indust_code` VARCHAR(100) NOT NULL,
  `indust_name` VARCHAR(100) NOT NULL,
  `com_name` VARCHAR(100) NOT NULL,
  `com_ceo` VARCHAR(100) NOT NULL,
  `biz_no` VARCHAR(45) NOT NULL,
  `com_tel` VARCHAR(100) NULL,
  `com_logo` VARCHAR(500) NULL,
  `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `resource_res_id` INT NOT NULL,
  PRIMARY KEY (`com_id`),
  UNIQUE INDEX `biz_no_UNIQUE` (`biz_no` ASC) VISIBLE,
  INDEX `fk_company_resource1_idx` (`resource_res_id` ASC) VISIBLE,
  CONSTRAINT `fk_company_resource1`
    FOREIGN KEY (`resource_res_id`)
    REFERENCES `sb_erp_db`.`resource` (`res_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
    
    CREATE TABLE IF NOT EXISTS `sb_erp_db`.`department` (
  `dept_id` INT NOT NULL,
  `com_id` INT NOT NULL,
  `parent_id` INT NULL,
  `dept_name` VARCHAR(100) NULL,
  `dept_code` VARCHAR(100) NULL,
  `depth` INT NULL,
  `sort_order` INT NULL,
  `emp_id` INT NULL,
  `created_at` DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`dept_id`),
  INDEX `fk_department_company1_idx` (`com_id` ASC) VISIBLE,
  INDEX `fk_department_department1_idx` (`parent_id` ASC) VISIBLE,
  UNIQUE INDEX `com_dept_UNIQUE` (`com_id` ASC, `dept_code` ASC) INVISIBLE,
  CONSTRAINT `fk_department_company1`
    FOREIGN KEY (`com_id`)
    REFERENCES `sb_erp_db`.`company` (`com_id`)
    ON DELETE NO ACTION
    ON UPDATE RESTRICT,
  CONSTRAINT `fk_department_department1`
    FOREIGN KEY (`parent_id`)
    REFERENCES `sb_erp_db`.`department` (`dept_id`)
    ON DELETE CASCADE
    ON UPDATE SET NULL);
