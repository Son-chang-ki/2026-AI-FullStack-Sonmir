package com.the703.dto;

import lombok.Data;

@Data
public class BoardDto {
	public int bno;
	public String bname;
	public String bpass;
	public String btitle;
	public String bcontent;
	public String bdate;
	public int bhit;
	public String bip;
	public String bfile;

}
/*
mysql> alter table mvcboard2 add  bfile varchar(500) not null;
mysql> alter table mvcboard2 modify bfile varchar(500) default 'the703.png';
mysql> desc mvcboard2;
+----------+---------------+------+-----+-------------------+-------------------+
| Field    | Type          | Null | Key | Default           | Extra             |
+----------+---------------+------+-----+-------------------+-------------------+
| bno      | int           | NO   | PRI | NULL              | auto_increment    |
| bname    | varchar(20)   | NO   |     | NULL              |                   |
| bpass    | varchar(50)   | NO   |     | NULL              |                   |
| btitle   | varchar(1000) | NO   |     | NULL              |                   |
| bcontent | text          | NO   |     | NULL              |                   |
| bdate    | timestamp     | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
| bhit     | int           | NO   |     | 0                 |                   |
| bip      | varchar(50)   | NO   |     | NULL              |                   |
| bfile    | varchar(500)  | YES  |     | the703.png        |                   |
+----------+---------------+------+-----+-------------------+-------------------+
9 rows in set (0.00 sec)


*/