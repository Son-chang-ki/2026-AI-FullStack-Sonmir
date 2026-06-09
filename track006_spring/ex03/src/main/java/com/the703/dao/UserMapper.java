package com.the703.dao;

import java.util.HashMap;
import java.util.List;

import com.the703.dto.AuthDto;
import com.the703.dto.AuthListDto;
import com.the703.dto.UserDto;

@Mapper
public interface UserMapper {
	public int     insert(UserDto dto);
	public int     findLogin(UserDto dto);
	public UserDto findByUno(int uno);
	public String  findByEmail(String email);
	
	// security
	public int         insertAuth(AuthDto dto);
	public AuthListDto readAuth(AuthDto dto);
	
}	



	 //<!-- paging -->
	 //<!-- paging -->
//	public List<BoardDto> select10(HashMap<String, Integer> map);
//	
//	public   int              selectCnt();


/*
1. project 만들기
    1. dynamic web project - ex02
    2. configure  - [Convert to Maven Project]
    3. spring      - add Spring project Nature
    4. java se-11 / project facts, build path
    5. build path - add Libraries - JUnit 4
    
2. pom.xml 에  jar 파일 다운로드 받기
3. root-context 에   내용설정
   1) DataSource
   2) Mybatis
   3) Mapper
4. 각종 설정파일들설정
    com.the703.dao   - @Mapper 
    com.the703.dto    
    config       
      ㄴ db.properties
      ㄴ mybatis-config.xml
      ㄴ test-mapper.xml
      ㄴ board-mapper.xml
5. 테스트파일설정
  
6. test-mapper.xml
select now()   
    
7. mysql> desc users;
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

-- create table ahthorities (
-- email varchar(50) not null,
-- auth varchar(50) not null
-- );

-- desc ahthorities;
+-------+-------------+------+-----+---------+-------+
| Field | Type        | Null | Key | Default | Extra |
+-------+-------------+------+-----+---------+-------+
| email | varchar(50) | NO   |     | NULL    |       |
| auth  | varchar(50) | NO   |     | NULL    |       |
+-------+-------------+------+-----+---------+-------+
2 rows in set (0.00 sec)


-- 1) insert 구문찾기 first@gmail.com / ROLE_MEMBER
-- 2) JOIN 이용해서 first@gmail.com 의 email, bpass, auth 필드값 찾기

select u.email, u.bpass, a.auth
from users left join ahthorities a on u.email = a.email
where u.email='first@gmail.com' ;


*/