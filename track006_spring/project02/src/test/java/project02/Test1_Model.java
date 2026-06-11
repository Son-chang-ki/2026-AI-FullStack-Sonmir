package project02;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.the703.dao.TestMapper;
import com.the703.dto.UserDto;
import com.the703.service.BoardService;
import com.the703.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:config/root-context.xml" , "classpath:config/security-context.xml"
})
public class Test1_Model {
	@Autowired ApplicationContext context;
	@Autowired DataSource         ds;
	@Autowired SqlSession 		  sqlSession;
	@Autowired TestMapper 		  test;
	//@Autowired  @Qualifier("passwordEncoder") PasswordEncoder  pwencoder;
	@Autowired  BoardService     service;
	
	@Test public void test3_list() { 
		
		// 리스트 가져오기 - 페이징 10
		System.out.println(service.select10(1));
		
		//HashMap<String Integer> map = new HashMap
		/*
		 * UserDto dto = new UserDto(); dto.setNickname("a"); dto.setBpass(
		 * pwencoder.encode("a") ); dto.setEmail("a@a"); dto.setMobile("0101111111");
		 * 
		 * System.out.println(service.insert(dto));
		 */
	}
	
	@Ignore  @Test public void test2() { System.out.println( test.now() ); }
	
	@Ignore  @Test  public void test1() {
		System.out.println("............3.  "  + sqlSession);
		System.out.println("............2.  "  + ds);
		System.out.println("............1.  "  + context);
	}

}
