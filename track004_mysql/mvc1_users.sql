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

show databases;
show tables;
create table users(
uno int not null auto_increment primary key,
nickname varchar(20) not null,
bpass varchar(50) not null,
email varchar(100) not null,
mobile varchar(50) not null,
udate timestamp default current_timestamp,
bip varchar(50)
);
desc users;
alter table users modify bip varchar(50) not null ;  
alter table users modify udate timestamp not null ;  
alter table users modify udate timestamp not null default current_timestamp;  

use mbasic;
insert into  users (nickname, bpass, email, mobile, bip)  values ('aaa' , 'ccc' , 'aaa@gamil.com', '010-1111-1111', '127.0.0.1');

select * from users;

select count(*) 
from users
where bpass='1111' and email='aaa@gmail.com';

alter table  users rename;


