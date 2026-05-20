<%@page import="java.net.InetAddress"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%
// jsp012_dalete.jsp

	// 1. utf-8 설정
	request.setCharacterEncoding("UTF-8");

	// 2. request.getParameter() 이용해서 데이터 받기
	int       ono = Integer.parseInt(request.getParameter("ono"));
	String oname = request.getParameter("oname");
	//int     onum = Integer.paraseInt(request.getParameter("onum"));    ### parseInt
	int     onum = Integer.parseInt(request.getParameter("onum"));
	out.println(oname + "/" + onum);

	// 3. insert 구문처리   1) Class.forName    2) jdbc연동 DriverManager.getConneciton  3) insert exeuteUpdate  4) close
	try{
		Connection conn = null; PreparedStatement pstmt = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/mbasic";
		String sql = "delete from milk_order oname =?, onum =?  where ono =?";  //###
		conn = DriverManager.getConnection(url, "root", "1234");
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, oname);
		pstmt.setInt(2, onum);
		pstmt.setInt(3, ono);  
		
		int result = pstmt.executeUpdate();   // insert, update, delete 실행 할 줄 수
	    // 4. jsp012_milk.jsp 로 돌아가기
	    if(result > 0) { out.println("<script> alert('우유 주문 삭제가 성공하였습니다.'); location.href='jsp012_milk.jsp'; </script>"); }
	    else { out.println("<script> alert('관리자에게 문의해주세요.!'); location.href='jsp012_milk.jsp'; </script>"); }
		
	    if(pstmt != null) { pstmt.close(); }
	    if(conn != null) {conn.close();}
	}catch(Exception e) {e.printStackTrace();}

%>