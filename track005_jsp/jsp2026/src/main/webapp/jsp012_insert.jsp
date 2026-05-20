<%@page import="java.net.InetAddress"%>
<%@page import="java.sql.*"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%
// jsp012_insert.jsp

	// 1. utf-8 설정
	request.setCharacterEncoding("UTF-8");

	// 2. request.getParameter() 이용해서 데이터 받기
	String oname = request.getParameter("oname");
	//int     onum = Integer.paraseInt(request.getParameter("onum"));    ### parseInt
	
	int     onum = Integer.parseInt(request.getParameter("onum"));
	out.println(oname + "/" + onum);

	// 3. insert 구문처리   1) Class.forName    2) jdbc연동 DriverManager.getConneciton  3) insert exeuteUpdate  4) close
	try{
		Connection conn = null; PreparedStatement pstmt = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/mbasic";
		String sql = "insert into milk_order (oname, onum, oip) values(?, ?, ?)";
		conn = DriverManager.getConnection(url, "root", "1234");
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, oname);
		pstmt.setInt(2, onum);
		pstmt.setString(3, InetAddress.getLocalHost().getHostAddress());  // ip 주소 가져오기
		
		int result = pstmt.executeUpdate();   // insert, update, delete 실행 할 줄 수
	    // 4. jsp012_milk.jsp 로 돌아가기
	    if(result > 0) { out.println("<script> alert('우유주문이 성공하였습니다.'); location.href='jsp012_milk.jsp'; </script>"); }
	    else { out.println("<script> alert('관리자에게 문의해주세요.!'); location.href='jsp012_milk.jsp'; </script>"); }
	    if(pstmt != null) { pstmt.close(); }
	    if(conn != null) {conn.close();}
	}catch(Exception e) {e.printStackTrace();}

%>

<!-- 		mysql> select * from milk_order;
		+-----+--------+------+---------------------+---------------+
		| ono | oname  | onum | odate               | oip           |
		+-----+--------+------+---------------------+---------------+
		|   2 | banana |    1 | 2026-05-20 14:59:31 | 198.160.0.1   |
		|   3 | white  |    2 | 2026-05-20 15:03:05 | 198.160.0.2   |
		|   4 | choco  |    3 | 2026-05-20 15:03:11 | 198.160.0.3   |
		|   5 | choco  |    2 | 2026-05-20 17:29:40 | 192.168.40.53 |
		|   6 | choco  |    2 | 2026-05-20 17:30:17 | 192.168.40.53 |
		|   7 | choco  |    2 | 2026-05-20 17:30:31 | 192.168.40.53 |
		|   8 | choco  |    2 | 2026-05-20 17:30:55 | 192.168.40.53 |
		+-----+--------+------+---------------------+---------------+
		7 rows in set (0.00 sec) -->