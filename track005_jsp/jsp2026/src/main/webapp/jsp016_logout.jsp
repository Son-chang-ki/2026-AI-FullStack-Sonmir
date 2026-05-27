<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<% /* "jsp016_logout.jsp" */
	// 1. session.invalidator()
	// 2. jsp016_login.jsp 페이지로 넘어가기
	session.invalidate();
	out.println("<script> alert('로그아웃')</script>");


%>

