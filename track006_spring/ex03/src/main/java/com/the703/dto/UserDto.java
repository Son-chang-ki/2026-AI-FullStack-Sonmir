package com.the703.dto;

import java.net.InetAddress;
import lombok.Data;

@Data
public class UserDto {
	public int uno;
	public String nickname;
	public String bpass;
	public String email;
	public String mobile;
	public String udate;
	public String bip;


}
/*
mysql> 
mysql> 
mysql> desc users;
+----------+--------------+------+-----+-------------------+-------------------+
| Field    | Type         | Null | Key | Default           | Extra             |
+----------+--------------+------+-----+-------------------+-------------------+
| uno      | int          | NO   | PRI | NULL              | auto_increment    |
| nickname | varchar(20)  | NO   |     | NULL              |                   |
| bpass    | varchar(50)  | NO   |     | NULL              |                   |
| email    | varchar(100) | NO   |     | NULL              |                   |
| mobile   | varchar(50)  | NO   |     | NULL              |                   |
| udate    | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
| bip      | varchar(50)  | NO   |     | NULL              |                   |
+----------+--------------+------+-----+-------------------+-------------------+
7 rows in set (0.01 sec)


*/