select  bname, bpass, btitle, bcontent,  bip, bfile from mvcboard2;
insert into  mvcboard2(bname , bpass , btitle ,  bcontent , bip ,  bfile)
select  bname, bpass, btitle, bcontent,  bip, bfile from mvcboard2;
desc mvcboard2;
select  bname, bpass, btitle, bcontent,  bip, bfile from mvcboard2;
use mbasic;


-- select  resultType="string"     id="now"
-- 해당번호의 글읽기, 글수정, 삭제
-- create : insert into mvcboard2 (bname, bpass, btitle, bcontent, bip) 
--          value ( #{bname}, #{bpass}, #{btitle}, #{bcontent}, #{bip})
-- read :   select * from mvcboard2 order by bno desc
--          select * from mvcboard2 where bno = #{bno}
-- update : update mvcboard2 set btitle = #{btitle}  , bcontent = #{bcontent}  where bno = #{bno}
-- delete : delete  from mvcboard2  where bno= #{bno} 

select * from mvcboard2 order by bno desc limit 0,10; -- 어디서부터, 몇개
select * from mvcboard2 order by bno desc limit 10,10; -- 그다음 10개부터, 10개
select * from mvcboard2 order by bno desc limit 20,10; 

select count(*) from mvcboard2;