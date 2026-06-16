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
  PRIMARY KEY (`com_id`),
  UNIQUE INDEX `biz_no_UNIQUE` (`biz_no` ASC) VISIBLE);


INSERT INTO `sb_erp_db`.`company` 
(`com_id`, `indust_code`, `indust_name`, `com_name`, `com_ceo`, `biz_no`, `com_tel`, `com_logo`) 
VALUES 
(1, 'I001', 'IT 서비스업', '(주)에이비씨테크', '홍길동', '123-45-67890', '02-123-4567', 'logo_abc.png'),
(2, 'I002', '제조업', '(주)엑스와이제조', '김철수', '987-65-43210', '031-987-6543', 'logo_xyz.png');