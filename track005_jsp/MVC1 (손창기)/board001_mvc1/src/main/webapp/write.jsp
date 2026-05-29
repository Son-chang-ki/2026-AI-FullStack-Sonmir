<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   

    <!--  jsp014_header.jsp -->
    <!--  jsp014_header.jsp --> 
<%@ include file="inc/header.jsp"   %> 


   <div class="container card my-5">
      <h3 class="card-header"> 글 등록 </h3>
      <!--  1. 처리 : write_action.jsp  2. 데이터 주소 표시창줄 노출 X  3. 보관용기이름 file 이름   -->
      <form action = "write_action.jsp" method = "post" onsubmit = "return checkForm()">
        <div class = "my-3">
          <label for = "bname" class = "form-lable"> 이름 </label> 
          <input type = "text"  class = "form-control"  id = "bname"  name = "bname" />
        </div>
        <div class = "my-3">
          <label for = "bpass"  class = "form-lable"> 비밀번호 </label> 
          <input type = "password"  class = "form-control"  id = "bpass"  name = "bpass" />
        </div>
        <div class = "my-3">
          <label for = "btitle"  class = "form-lable"> 제목 </label> 
          <input type = "text"  class = "form-control"  id = "btitle"  name = "btitle" />
        </div>
        <div class = "my-3">
          <label for = "bcontent" class = "form-lable"> 내용 </label> 
          <textarea   class = "form-control"  id = "bcontent"  name = "bcontent" > </textarea>
        </div>
        <div class = "my-3 text-end"> 
          <button  type = "submit"   class = "btn btn-primary"  title = "글수정"> 입력 </button>
          <button  type = "reset"   class = "btn btn-outline-primary"  title = "글수정취소"> 취소 </button>
          <a href="list2.jsp"    class = "btn btn-outline-success"  title = "목록보러가기"> 목록보기 </a>
        </div>
      </form>
      <script>
        function checkForm(){
        	let bname = document.getElementById("bname");
        	let bpass = document.getElementById("bpass");
        	let btitle = document.getElementById("btitle");
        	let bcontent = document.getElementById("bcontent");
        	
        	if(bname.value.trim() == "") { alert("빈칸입니다. \n 확인해주세요"); bname.focus(); return false; }
        	if(bpass.value.trim() == "") { alert("빈칸입니다. \n 확인해주세요"); bpass.focus(); return false; }
        	if(btitle.value.trim() == "") { alert("빈칸입니다. \n 확인해주세요"); btitle.focus(); return false; }
        	if(bcontent.value.trim() == "") { alert("빈칸입니다. \n 확인해주세요"); bcontent.focus(); return false; }
        	return true;
        }
      </script>
   </div>
   
  
     <!-- footer -->
 
<%@ include file = "inc/footer.jsp"   %>  