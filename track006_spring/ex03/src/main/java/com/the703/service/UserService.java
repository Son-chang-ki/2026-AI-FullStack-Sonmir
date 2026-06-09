package com.the703.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;


import com.the703.dto.UserDto;

public interface UserService {
	
	   // 1. 회원가입   
	   public int  insert(UserDto dto);
	   
	   // 2. 로그인  
	   public int  findLogin(UserDto dto);
	   
	   // 3. 마이페이지
	   public UserDto  findByUno   (int uno);
	   
	   // 4. 아이디 중복검사
	   public String   findEmail(String email);
	   
	   // 5. 글수정 기능    - 비밀번호가 맞는지 확인 후 글수정
//	   public int             edit(BoardDto dto, MultipartFile file);
	   
	   // 6. 글삭제 기능    - 비밀번호가 맞는지 확인 후 글삭제 
//	   public int             delete(BoardDto dto);
	   
	   // paging //
	   // paging //
//	   public List<BoardDto> select10(int pstartno);
//	   public int selectCnt();
	}


