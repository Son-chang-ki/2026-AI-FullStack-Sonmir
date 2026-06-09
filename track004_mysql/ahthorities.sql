-- use mbasic;

-- create table ahthorities (
-- email varchar(50) not null,
-- auth varchar(50) not null
-- );

-- desc ahthorities;

-- 1) insert 구문찾기 first@gmail.com / ROLE_MEMBER
-- 2) JOIN 이용해서 first@gmail.com 의 email, bpass, auth 필드값 찾기

insert 


select u.email, u.bpass, a.auth
from users left join ahthorities a on u.email = a.email
where u.email='first@gmail.com'