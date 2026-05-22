<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   

<%@ include file="inc/header.jsp"   %> 

   <div class="container card my-5">
      <h3 class="card-header"> 글 삭제 </h3>
      <form action = "#" method = "post" onsubmit = "return checkForm()">
        <div class = "my-3">
          <label for = "bpass"  class = "form-lable"> 비밀번호 </label> 
          <input type = "password"  class = "form-control"  id = "bpass"  name = "bpass" />
        </div>
        <div class = "my-3 text-end"> 
          <button  type = "reset"   class = "btn btn-outline-primary"  title = "글수정취소"> 취소 </button>
          <a href=""                class = "btn btn-outline-success"  title = "목록보러가기"> 목록보기 </a>
          <button  type = "submit"  class = "btn btn-primary"  title = "글삭제"> 글 삭제 </button>
        </div>
      </form>
       <script>
        function checkForm(){
        	let bpass = document.getElementById("bpass");
        	if(bpass.value.trim() == "") { alert("빈칸입니다. \n 확인해주세요"); bpass.focus(); return false; }
        	return true;
        }
      </script>
     
   </div>

   
     <!--  jsp014_footer.jsp -->
<%@ include file = "inc/footer.jsp"   %> 