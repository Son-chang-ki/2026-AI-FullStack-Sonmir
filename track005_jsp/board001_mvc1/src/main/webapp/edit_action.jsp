<%@page import="java.net.InetAddress"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%
		// 1. 데이터 넘겨받기 (수정할 글번호 넘겨받기)
		request.setCharacterEncoding("UTF-8");
		int bno = Integer.parseInt( request.getParameter("bno") );
	    String bpass = request.getParameter("bpass");
	    String btitle = request.getParameter("btitle");
	    String bcontent = request.getParameter("bcontent");

		// 2. update  mvcboard1   set  btitle=? , bcontent=?  where  bno=?  and bpass=?
		Connection conn = null;  PreparedStatement pstmt = null;   //ResultSet rset = null;
        String url = "jdbc:mysql://localhost:3306/mbasic";   
        String user = "root" , pass="1234";
        String sql = "update  mvcboard1   set  btitle=? , bcontent=?  where  bno=?  and bpass=?";
		
		// 3. 수정시 datail.jsp 가서 수정이 되었는지 확인 / 수정폼으로 넘기기
		// 4) edit.jsp (글수정 폼) edit_action.jsp (글수정 처리)

		try{
		  //1. 드라이버로딩
		    Class.forName("com.mysql.cj.jdbc.Driver"); // Class.forName
		    //2. jdbc연동
		    conn = DriverManager.getConnection(url, user, pass); // DriverManager.getConnection
		    //3. sql 구문처리
		    pstmt = conn.prepareStatement(sql); 
		    pstmt.setString(1,btitle);  pstmt.setString(2,bcontent); 
		    pstmt.setInt(3,bno);        pstmt.setString(4,bpass); 
		    //4. 성공알림창 - 성공시 detail.jsp / 실패시 수정폼으로
		    if(pstmt.executeUpdate() > 0){ // 4. 처리 후 성공알림창 후 edit.jsp (글수정 폼) edit_action.jsp (글수정 처리)
	  	          out.println("<script> alert('수정 완료!'); location.href='detail.jsp?bno="+bno+"'; </script>");
		  	  }else{
		  	         out.println("<script> alert('비밀번호 확인!'); history.go(-1); </script>");
		  	  }
		     //5. jdbc끊기  // 3. 수정시 datail.jsp 가서 수정이 되었는지 확인 / 수정폼으로 넘기기
		     if(pstmt != null){  pstmt.close();  }
		     if(conn != null) {  conn.close();  }
		  }catch(Exception e){e.printStackTrace();}	

%>