package com.the703;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;

import org.hibernate.validator.internal.IgnoreForbiddenApisErrors;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.the703.dao.Sboard2Dao;
import com.the703.dao.TestDao;
import com.the703.dto.Sboard2Dto;

@SpringBootTest
class BootApplicationTests {
	
	@Autowired TestDao  dao;
	@Autowired Sboard2Dao  sboard2Dao;
	
	/*              				*/
	/*              				*/
	/*              				*/
	  @Test public void test05_delete() {   // 삭제
		Sboard2Dto  dto = new Sboard2Dto();
		dto.setId(42);
		int result = sboard2Dao.delete(dto);
		assertEquals(42,  result);
	 }
	
	@Disabled  @Test public void test04_update() {   // 수정
		Sboard2Dto  dto = new Sboard2Dto();
		dto.setBtitle("title-new");  dto.setBcontent("content-new");
		dto.setBfile("11.png");		 dto.setId(42);
	
	 }
	@Disabled   @Test public void test03_byId() {   // id, 조회수 올리기
	  	 Sboard2Dto  dto = new Sboard2Dto();
	  	 dto.setId(22);
	  	 Sboard2Dto result = sboard2Dao.selectById(dto);
	  	 assertEquals(22,  result.getId());
	  }
	
	@Disabled  @Test public void test02_paging()  { // paging, 갯수
		HashMap<String , Object> para = new HashMap<>();
		para.put("start", 0);
		para.put("end", 10);
		List<Sboard2Dto>  list10 = sboard2Dao.selectPaging(para);
		
		assertEquals(4, list10.size());			  // 4 숫자는 지금 있는 list 의 갯수로 ( 예상되는 결과, 해당코드 )
		assertNotNull(list10);
		assertEquals(4, sboard2Dao.selectCnt());  // 전체 갯수 4개
	}
	
	@Disabled  @Test public void test01_Insert() throws UnknownHostException { // insert
		Sboard2Dto  dto = new Sboard2Dto();
		dto.setAppUserId(1);   dto.setBtitle("title");   dto.setBcontent("content");
		dto.setBpass("1111");  dto.setBfile("1.png");	 dto.setBip(InetAddress.getLocalHost().getHostAddress());
		
		int result = sboard2Dao.insert(dto);
		System.out.println("......1 > " + result ); // 기존방식 - 수동으로 값 확인 : 콘솔에 1
		assertEquals(1, result);					// 자동확인 - 결과물이 1인지 Junit 체크
	}
	
	//@Ignore - JUnit4
	@Disabled   //@Test
	void contextLoads() {
		System.out.println("....................");
		System.out.println( dao.readTime());
		System.out.println("....................");
	}

}
