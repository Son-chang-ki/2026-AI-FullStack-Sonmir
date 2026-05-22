<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   

<%@ include file="inc/header.jsp"   %> 
<!--  jsp014_header.jsp -->

<!-- 3) detail.jsp 상세보기
select * from  mvcboard1 where bno=?
update  mvcboard1   set  bhit=bhit+1    where  bno=? -->

<% 
	// 1. bno 넘겨받기
	request.setCharacterEncoding("UTF-8");
	int bno = Integer.parseInt(request.getParameter("bno"));
	// 2. sql 구문 2개 처리
	String bname = "", btitle = "", bcontent = ""; int bhit = 0;
	try{
		Connection conn = null; PreparedStatement  pstmt = null; ResultSet rset = null;
		
		String sql1 = "update  mvcboard1   set  bhit=bhit+1    where  bno=?";
		String sql2 = "select * from  mvcboard1 where bno=?";
		
		String url = "jdbc:mysql://localhost:3306/mbasic";
		String user = "root" , pass = "1234";
		
		//1. 드라이버로딩
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    //2. jdbc연동
	    conn = DriverManager.getConnection(url, user, pass);
	    //3. sql 구문처리
	    pstmt = conn.prepareStatement(sql1); pstmt.setInt(1,bno);
		if(pstmt.executeUpdate() > 0) { pstmt.close(); }
		
		pstmt = conn.prepareStatement(sql2); pstmt.setInt(1,bno);
		rset = pstmt.executeQuery(); //표
		if(rset.next()){ //줄
			bname = rset.getString("bname"); btitle = rset.getString("btitle"); // 칸
			bcontent = rset.getString("bcontent"); bhit = rset.getInt("bhit"); 
		}
		//4. jdbc끊기
		if(rset != null) {  rset.close();  }
		if(pstmt != null){  pstmt.close();  }
        if(conn != null) {  conn.close();  }
	    }catch(Exception e){e.printStackTrace();}
		
%>	

   <div class="container card my-5">
      <h3 class="card-header"> 글 상세보기 </h3>
      <form action = "#" method = "post">
        <div class = "my-3">
          <label for = "bname" class = "form-lable"> 이름 </label> 
          <input type = "text"  class = "form-control" value="<%=bname%>" id = "bname"  name = "bname" readonly />
        </div>
        <div class = "my-3">
          <label for = "btitle"  class = "form-lable"> 제목 </label> 
          <input type = "text"  class = "form-control" value="<%=btitle%>" id = "btitle"  name = "btitle"  readonly />
        </div>
        <div class = "my-3">
          <label for = "bcontent" class = "form-lable"> 내용 </label> 
          <textarea   class = "form-control"  id = "bcontent"  name = "bcontent"  readonly ><%=bcontent%></textarea>
        </div>
        <div class = "my-3">
          <label for = "bhit" class = "form-lable"> 조회수 </label> 
          <input type = "text"   class = "form-control" value="<%=bhit%>" id = "bhit"  name = "bhit"  readonly />
        </div>
        <div class = "my-3 text-end"> 
          <a href="edit.jsp?bno=<%=bno%>"    class = "btn btn-primary"  title = "글수정"> 수정 </a>
          <a href="delete.jsp?bno=<%=bno%>"    class = "btn btn-outline-success"  title = "글삭제"> 삭제 </a>
          <a href="list2.jsp"    class = "btn btn-outline-primary"  title = "목록보러가기"> 목록 </a>
        </div>
      </form>
   </div>

<!--  jsp014_footer.jsp -->
<%@ include file = "inc/footer.jsp"   %> 