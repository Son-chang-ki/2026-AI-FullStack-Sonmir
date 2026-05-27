<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<% /* "jsp016_result.jsp" */
	//1. 데이터 넘겨받기
	request.setCharacterEncoding("UTF-8");
	String email = request.getParameter("email");
	String bpass = request.getParameter("bpass");
	
	//2. sql 구문처리 - select * from users where email=? and bpass=?
	String nickname = "", mobile = ""; 
	Connection conn = null; 
	PreparedStatement pstmt = null; ResultSet rset = null;
	String url = "jdbc:mysql://localhost:3306/mbasic";
	String user = "root" , pass = "1234";
	String sql = "select * from  users where email=? and bpass=?";
			
	// 로그인 성공했다면
	session.setAttribute("email", email);
	//3. 로그인 성공시 - session 설정 (session.setAttribute) / jsp016_login.jsp 페이지로 넘어가기



%>