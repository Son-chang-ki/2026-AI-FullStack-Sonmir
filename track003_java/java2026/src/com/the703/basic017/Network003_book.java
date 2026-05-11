package com.the703.basic017;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Network003_book {
	public static void main(String[] args) {
		try {  //1. Url    주소확인
			String apiurl = "https://openapi.naver.com/v1/search/book.json?query="
					 + URLEncoder.encode("spring", "UTF-8"); //## 검색어 수정하면 됨
			 URL url = new URL(apiurl);

		//2.HttpUrlConnection   연결객체
			 HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
		//3. 요청설정    GET 
		 // > X-Naver-Client-Id: {애플리케이션 등록 시 발급받은 클라이언트 아이디 값}
		 // > X-Naver-Client-Secret: {애플리케이션 등록 시 발급받은 클라이언트 시크릿 값}
		 // Client ID:       RN89LDwI1Xod6B0aHM8T
		 // Client Secret :  tlsQE12Cui
			 conn.setRequestMethod("GET");
			 conn.setRequestProperty("X-Naver-Client-Id"     , "RN89LDwI1Xod6B0aHM8T");
			 conn.setRequestProperty("X-Naver-Client-Secret" , "tlsQE12Cui");
		
		//4. 응답확인
			 int code = conn.getResponseCode();
		
		//5. 응답데이터
			 BufferedReader br;
	         if( code == 200 ) {
	        	 br = new BufferedReader ( new InputStreamReader ( conn.getInputStream() ) );
	         }
	         else { 
	        	 br = new BufferedReader ( new InputStreamReader ( conn.getErrorStream() ) );
	         }
	          String line = ""; StringBuffer sb = new StringBuffer();
	          while( ( line = br.readLine() ) != null) { sb.append(line + "\n"); }
	          
	          System.out.println(sb.toString());
			  br.close(); 
			  conn.disconnect();
	         
	      }catch(Exception e ) {e.printStackTrace();}
    }
}
/* ;;;;;; naver book 읽어오기  spring 책 찾아보기~~~
1. 네이버 개발자 - 로그인

2. 애플리케이션 - 사용할 api 설정
Client ID:       RN89LDwI1Xod6B0aHM8T
Client Secret :  tlsQE12Cui

             요청 URL								반환 형식
https://openapi.naver.com/v1/search/book.xml	XML
https://openapi.naver.com/v1/search/book.json	JSON

   > 옵션
프로토콜  :			HTTPS
HTTP 메서드 :		 GET
파라미터  : query	String	
(파라미터를 쿼리 스트링 형식으로 전달합니다.)
파라미터	타입	           필수여부	       		설명
query	String	        Y	           검색어.UTF-8로 인코딩되어야 합니다.
display	Integer	        N	           한 번에 표시할 검색 결과 개수(기본값: 10, 최댓값: 100)
start	Integer      	N				검색 시작 위치(기본값: 1, 최댓값: 1000)
sort	String	        N				검색 결과 정렬 방법
- sim: 정확도순으로 내림차순 정렬(기본값)
- date: 날짜순으로 내림차순 정렬


> GET /v1/search/book.xml?query=%EC%A3%BC%EC%8B%9D&display=10&start=1 HTTP/1.1
> Host: openapi.naver.com
> User-Agent: curl/7.49.1
> Accept: 
> X-Naver-Client-Id: {애플리케이션 등록 시 발급받은 클라이언트 아이디 값}
> X-Naver-Client-Secret: {애플리케이션 등록 시 발급받은 클라이언트 시크릿 값}

3. Http 통신이용해서 데이터가져오기

*/