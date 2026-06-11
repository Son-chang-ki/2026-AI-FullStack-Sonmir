-- mysql>
-- mysql> desc users;
-- +----------+--------------+------+-----+-------------------+-------------------+
-- | Field    | Type         | Null | Key | Default           | Extra             |
-- +----------+--------------+------+-----+-------------------+-------------------+
-- | uno      | int          | NO   | PRI | NULL              | auto_increment    |
-- | nickname | varchar(20)  | NO   |     | NULL              |                   |
-- | bpass    | varchar(50)  | NO   |     | NULL              |                   |
-- | email    | varchar(100) | NO   |     | NULL              |                   |
-- | mobile   | varchar(50)  | NO   |     | NULL              |                   |
-- | udate    | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
-- | bip      | varchar(50)  | NO   |     | NULL              |                   |
-- +----------+--------------+------+-----+-------------------+-------------------+
-- 7 rows in set (0.00 sec)

-- (1) users 라는 테이블 만들기   
-- (2) sql  -  회원가입 sql,  로그인 sql 찾기~!

-- show databases;
-- show tables;
-- create table users(
-- uno int not null auto_increment primary key,
-- nickname varchar(20) not null,
-- bpass varchar(50) not null,
-- email varchar(100) not null,
-- mobile varchar(50) not null,
-- udate timestamp default current_timestamp,
-- bip varchar(50)
-- );
-- desc users;
-- alter table users modify bip varchar(50) not null ;  
-- alter table users modify udate timestamp not null ;  
-- alter table users modify udate timestamp not null default current_timestamp;  

-- use mbasic;
-- insert into  users (nickname, bpass, email, mobile, bip)  values ('aaa' , 'ccc' , 'aaa@gamil.com', '010-1111-1111', '127.0.0.1');
-- insert into  users (nickname, bpass, email, mobile, bip)  values ('bbb' , 'ccc' , 'bbb@gamil.com', '010-1111-1111', '127.0.0.1');
-- insert into  users (nickname, bpass, email, mobile, bip)  values ('ccc' , 'ccc' , 'ccc@gamil.com', '010-1111-1111', '127.0.0.1');
-- insert into  users (nickname, bpass, email, mobile, bip)  values ('ddd' , 'ccc' , 'ddd@gamil.com', '010-1111-1111', '127.0.0.1');
-- insert into  users (nickname, bpass, email, mobile, bip)  values ('eee' , 'ccc' , 'eee@gamil.com', '010-1111-1111', '127.0.0.1');

-- select * from users;

-- mysql> select * from users;
-- +-----+----------+-------+---------------+---------------+---------------------+-----------+
-- | uno | nickname | bpass | email         | mobile        | udate               | bip       |
-- +-----+----------+-------+---------------+---------------+---------------------+-----------+
-- |  14 | aaa      | ccc   | aaa@gamil.com | 010-1111-1111 | 2026-06-11 16:59:58 | 127.0.0.1 |
-- |  15 | bbb      | ccc   | bbb@gamil.com | 010-1111-1111 | 2026-06-11 17:49:27 | 127.0.0.1 |
-- |  16 | ccc      | ccc   | ccc@gamil.com | 010-1111-1111 | 2026-06-11 17:49:27 | 127.0.0.1 |
-- |  17 | ddd      | ccc   | ddd@gamil.com | 010-1111-1111 | 2026-06-11 17:49:27 | 127.0.0.1 |
-- |  18 | eee      | ccc   | eee@gamil.com | 010-1111-1111 | 2026-06-11 17:49:27 | 127.0.0.1 |
-- +-----+----------+-------+---------------+---------------+---------------------+-----------+
-- 5 rows in set (0.00 sec)



-- select count(*) 
-- from users
-- where bpass='1111' and email='aaa@gmail.com';

-- alter table  users rename;

-- create : insert into users (nickname, bpass, email, mobile, bip)   value  ( #{nickname}, #{bpass}, #{email}, #{mobile}, #{bip} )
-- read   : select count(*) from users where email=#{email} and bpass=#{bpass}
--          select * from users where uno=#{uno} 
--          select email from users where email=#{email} 

