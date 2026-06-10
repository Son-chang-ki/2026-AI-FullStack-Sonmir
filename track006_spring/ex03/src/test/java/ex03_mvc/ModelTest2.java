package ex03_mvc;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import  org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.the703.dao.UserMapper;
import com.the703.dto.AuthDto;
import com.the703.dto.UserDto;
import com.the703.service.UserService;


@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class) // 1. spring 구동test
//@ContextConfiguration(locations = "classpath:config/root-context.xml")  //2. 설정파일
@ContextConfiguration 
     (locations = {"classpath:config/root-context.xml" , "classpath:config/security-context.xml"})
public class ModelTest2 {
//	
	@Autowired UserService     service;
	@Autowired UserMapper      user; 
	@Autowired @Qualifier("passwordEncoder")   PasswordEncoder   pwenconder; 
	
	/* security   */
	@Test  public void test4() {
		AuthDto dto2 = new AuthDto();   dto2.setEmail("a@a");
		System.out.println(service.readAuth(dto2));
	}
	
	
	@Ignore   @Test   public void test3() {
		// 로그인시 인가
		AuthDto dto2 = new AuthDto();  dto2.setEmail("a@a");
		System.out.println(user.readAuth(dto2));  
//		
//		// 권한2개 줬으면 주석달고 위에 해당 유저 정보 가져오기
//		// 권한2개 - 회원, ADMIN
		AuthDto dto1 = new AuthDto();  dto1.setEmail("a@a");  dto1.setAuth("ROLE_MEMBER");
//		 AuthDto dto1 = new AuthDto();  dto1.setEmail("a@a");  dto1.setAuth("ROLE_ADMIN");
//		System.out.println(user.insertAuth(dto1));  // ROLE_MEMBER  , ROLE_ADMIN
		
		// 회원 가입시 암호화 성공했으면 주석달고 위에 권한실행 
		/* 회원가입  (암호화)  pwencoder.encoder("a")  */
//		UserDto dto = new UserDto();
//		dto.setNickname("a");         dto.setBpass( pwenconder.encode("a") );
//		dto.setEmail("a@a");          dto.setMobile("010-1111-1111");
//		System.out.println(service.insert(dto));
	}
	
	@Ignore @Test   public void test1() throws UnknownHostException {
//		   // 이메일 중복 : findByEmail  - email
		   System.out.println(user.findByEmail("5@5")); 
////		   // 마이페이지 : findByUno  - uno
//		   System.out.println(service.findByUno(6)); // 갖고 있는 유저
////		   
////		   // 로그인 :    findLogin  - 
//		   UserDto dto2 = new UserDto(); 
//		   dto2.setBpass("5");         dto2.setEmail("5@5");
//		   System.out.println(service.findLogin(dto2));
		   
		   // 회원 가입 : insert - UserDto    users  (nickname ,bpass, email , mobile, bip ) 
//		   UserDto dto = new UserDto(); 
//		   dto.setNickname("second");         dto.setBpass("5");
//		   dto.setEmail("5@5");     dto.setMobile("010-1111-1111");
//		   dto.setBip(InetAddress.getLocalHost().getHostAddress()); //#1
//		   System.out.println(service.insert(dto)); // 실행한 줄 수 1
		   
	   }

}
