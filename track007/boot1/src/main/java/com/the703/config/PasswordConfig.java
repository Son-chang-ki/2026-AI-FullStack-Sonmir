package com.the703.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordConfig {
	
	@Bean // 암호화
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
		
	}

}
