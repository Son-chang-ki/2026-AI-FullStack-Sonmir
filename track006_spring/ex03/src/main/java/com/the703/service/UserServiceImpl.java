package com.the703.service;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.the703.dao.UserMapper;
import com.the703.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired UserMapper dao;  // db°ü·Ã

	@Override public int insert(UserDto dto) {
		try { dto.setBip(InetAddress.getLocalHost().getHostAddress()); }
		catch (UnknownHostException e) { e.printStackTrace(); }
		return dao.insert(dto);
	}

	@Override public int findLogin(UserDto dto) { return dao.findLogin(dto);
	}

	@Override
	public UserDto findByUno(int uno) {	return dao.findByUno(uno); 	}

	@Override
	public String findEmail(String email) { return findEmail(email);	}
	
}
