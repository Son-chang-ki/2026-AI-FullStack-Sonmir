<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
    
<!--  jsp014_header.jsp -->    
<%@ include file="inc/header.jsp"   %>  
    
    <!--  content -->
    <section class="container  my-5">
        <h3> MultiBoard </h3>
        <table  class="table  table-striped  table-bordered table-hover">
            <caption> BOARD 목록 </caption>
            <thead>
                <tr>
                    <th scope="col">NO</th>
                    <th scope="col">TITLE</th>
                    <th scope="col">WRITER</th>
                    <th scope="col">DATE</th>
                    <th scope="col">HIT</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>첫번째 글쓰기</td>
                    <td>FIRST</td>
                    <td>2026.05</td>
                    <td><span class="badge rounded-pill bg-dark">1</span></td>
                </tr>
            </tbody>
        </table>
		<form action="write.jsp" method="get" onsubmit="return check()">
        <div  class="text-end">
           <button title="글쓰기 폼"  class="btn btn-primary" >글쓰기</button>
        </div>
		</form>
		
    </section>

    <!--  jsp014_footer.jsp -->
<%@ include file = "inc/footer.jsp"   %>  
  