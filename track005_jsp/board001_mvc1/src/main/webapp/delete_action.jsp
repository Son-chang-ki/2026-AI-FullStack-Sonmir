<%@page import="java.net.InetAddress"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%
// delete.jsp (글삭제 폼) delete_action.jsp (글삭제 처리)
//   delete from mvcboard1  where  bno=?   and bpass=? 

	//1. bno, bpas 데이터 넘겨받기
	request.setCharacterEncoding("UTF-8");
	int bno = Integer.parseInt(  request.getParameter("bno") );
	String bpass = request.getParameter("bpass");
	
	//2. delete from mvcboard1  where  bno=?   and bpass=? 
	Connection conn = null;  PreparedStatement pstmt = null;   //ResultSet rset = null;
    String url = "jdbc:mysql://localhost:3306/mbasic";   
    String user = "root" , pass="1234";
    String sql = "delete from mvcboard1  where  bno=?   and bpass=?";		
	//3. 삭제시 list.jsp / 삭제실패시 비번입력폼으로 history.go(-1)		
	
	try{
		  //1. 드라이버로딩
		    Class.forName("com.mysql.cj.jdbc.Driver"); // Class.forName
		    //2. jdbc연동
		    conn = DriverManager.getConnection(url, user, pass); // DriverManager.getConnection
		    //3. sql 구문처리
		    pstmt = conn.prepareStatement(sql); 
		    pstmt.setInt(1,bno);        
		    pstmt.setString(2,bpass); 
		    //4. 성공알림창 - 성공시 detail.jsp / 실패시 수정폼으로
		    if(pstmt.executeUpdate() > 0){ // 4. 처리 후 성공알림창 후 edit.jsp (글수정 폼) edit_action.jsp (글수정 처리)
	  	          out.println("<script> alert('삭제 성공!'); location.href='list2.jsp?bno="+bno+"'; </script>");
		  	  }else{
		  	         out.println("<script> alert('삭제 실패!'); history.go(-1); </script>");
		  	  }
		     //5. jdbc끊기  // 3. 수정시 datail.jsp 가서 수정이 되었는지 확인 / 수정폼으로 넘기기
		     if(pstmt != null){  pstmt.close();  }
		     if(conn != null) {  conn.close();  }
		  }catch(Exception e){e.printStackTrace();}	

%>