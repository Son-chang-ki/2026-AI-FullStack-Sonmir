package com.the703.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.the703.dto.AuthDto;
import com.the703.dto.AuthListDto;
import com.the703.dto.UserDto;

public interface UserService {
	
	   // 1. 회원가입   + 권한추가
	   public int  insert(UserDto dto);
	   
	   // 2. 로그인  
	   public int  findLogin(UserDto dto);
	   
	   // 3. 마이페이지
	   public UserDto  findByUno   (int uno);
	   
	   // 4. 아이디 중복검사
	   public String   findByEmail(String email);
	   
	   // security login //
	   public AuthListDto readAuth(AuthDto dto);
	   public     UserDto findByEmailUserInfo (String email);

	}


