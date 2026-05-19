<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<!DOCTYPE html>
<html lang = "ko">
<head>
<meta charset="UTF-8">
<title>JSP</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<!-- 							header  					 	-->
<!--  							header 							-->	
<!-- bg-primary(파랑), bg-success(녹색), .bg-info(하늘색), .bg-warning(노랑), .bg-danger(빨강)							 				-->
<!-- https://www.w3schools.com/bootstrap5/bootstrap_jumbotron.php -->
		<div class="mt-4 p-5 bg-primary text-white rounded">
		  <h1>Milk Order Project</h1>
		  <p>pstmt_stmt</p>
		</div>

<!--                            메뉴판 테이블 						-->
<!-- 							메뉴판 테이블 						-->
<!--https://www.w3schools.com/bootstrap5/bootstrap_tables.php  -->		
   <div class="container card my-5 bg-primary text-white">
      <h2 class="card-header">Milk Menu</h2>
      
      <table class= "table table-bordered table-striped table-hover">
          <caption> 우유메뉴</caption>
          <thead>
              <tr>
                 <th scope = "col">NO</th>
                 <th scope = "col">NAME</th>
                 <th scope = "col">PRICE</th>
              </tr>
          </thead>
          <tbody>
          <% 
          try{
            // 1. 드라이버 연동
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = null; PreparedStatement pstmt = null; ResultSet rset = null;
            // 2. JDBC 연동
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic","root","1234");
            
            // 3. PreparaedStatement pstmt 이용해서 milk 테이블의 데이터 가져오기
            pstmt = conn.prepareStatement("select * from milk order by mprice asc");
            
            rset = pstmt.executeQuery(); //표
            while(rset.next()) { //줄
            	out.println("<tr><td>" + rset.getInt("mno")+"</td><td>"
            			               + rset.getString("mname") + "</td><td>"
            			               + rset.getInt("mprice") + "</td></tr>");
            }
            // 가격이 낮은순으로            
            // 4. JDBC 끊기
            if(rset != null) {rset.close();}
            if(pstmt != null) {pstmt.close();}
            if(conn != null) {conn.close();}
          } catch (Exception e) { e.printStackTrace(); }
             /* mysql> select * from milk;
				+-----+--------+--------+------+--------+
				| mno | mname  | mprice | mnum | mtotal |
				+-----+--------+--------+------+--------+
				|   1 | white  |   1500 | NULL |   NULL |
				|   2 | choco  |   1800 | NULL |   NULL |
				|   3 | banana |   1800 | NULL |   NULL |
				+-----+--------+--------+------+--------+
3 rows in set (0.00 sec)
             alter table milk modify mnum int null;
             alter table milk modify mtotal int null;
             
             insert into milk (mno, mname, mprice) values(1, 'white', 1500);
             insert into milk (mno, mname, mprice) values(2, 'choco', 1800);
             insert into milk (mno, mname, mprice) values(3, 'banana', 1800);
             
             	   1  white   1500
            	   2  choco   1800
            	   3  banana  1800  */

            
          %>

          </tbody>

      </table>
      
   </div>
   
   
<!--       주문현황표             -->
<!--       주문현황표             -->
<!-- 
= MODEL
★ 다음과 같이 테이블을 준비해주세요!
mysql> desc milk_order;
+-------+--------------+------+-----+-------------------+-------------------+
| Field | Type         | Null | Key | Default           | Extra             |
+-------+--------------+------+-----+-------------------+-------------------+
| ono   | int          | NO   | PRI | NULL              | auto_increment    |
| oname | varchar(20)  | NO   |     | NULL              |                   |
| onum  | int          | NO   |     | NULL              |                   |
| odate | datetime     | YES  |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
| oip   | varchar(100) | NO   |     | NULL              |                   |
+-------+--------------+------+-----+-------------------+-------------------+
5 rows in set (0.00 sec)

create table milk_order(
ono       int        not null auto_increment PRIMARY Key,  -- 필드명, 자료형, 옵션
oname   varchar(20)  not null,
onum      int        not null,
odate   datetime     default  CURRENT_TIMESTAMP,
oip     varchar(50)  not null
);

==> ERROR 1064 (42000): You have an error in your SQL syntax; 
    check the manual that corresponds to your MySQL server version for the right syntax 
    to use near 'oip     varchar(50) not null )' at line 6
    
-- Q1.  milk_order 값삽입.  insert 구문 완성    
   insert into milk_order (oname, onum, oip) values ('banana', 1, '198.160.0.1');
   
-- Q2.  milk_order ono가 1인데이터 조회 
select * from milk_order where ono=1;

-- Q3.  milk_order 전체데이터조회
select * from milk_order;

-- Q4.  milk_order 해당번호의 이름과 갯수 수정
update milk_order set oname='choco', onum =3 where ono =1;

-- Q5.  milk_order 해당번호의 데이터 삭제
delete from milk_order where ono=1;



 -->
   
</body>
</html>