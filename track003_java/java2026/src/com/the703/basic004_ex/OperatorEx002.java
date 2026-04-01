package com.the703.basic004_ex;

public class OperatorEx002 {

	public static void main(String[] args) {
		// ( ) 값을 구하고(+,-,*,/, %) 비교(<,>,==, !=) 조건 (&& || ?:) 대입 (=)  // 변수 정의, 입력, 처리, 출력
		//4. 삼항연산자 조건 ? 참 : 거짓 |
		//String answer = a ==10 ? "10이다" : "10이 아니다";
		//System.out.println( answer);
		//String answer = ch == 'a' ? "" : "10이 아니다";
		
		int x=5; char ch = '\u0000';
		// q1-1 int형 변수 x가 3보다 크고 10보다 작을때 true인 조건식 
		System.out.println(x > 3 && x < 10);
		
		// q1-2 char형 변수 ch가 'a' 또는 'A'일때   true인 조건식  
		System.out.println(ch == 'a' || ch == 'A');
		
		// q1-3 char형 변수 ch가 숫자('0'~'9')일때   true인 조건식 
		System.out.println(ch >= '0' && ch <= '9');
		
		// q1-4 char형 변수 ch가 영문자(대문자 또는 소문자) 일때   true인 조건식
		System.out.println(ch >= 'A' && ch == 'Z' || ch >= 'a' && ch == 'z'); // A:65, B: 66, C:67

	}

}
/* q1-1 int형 변수 x가 3보다 크고 10보다 작을때 true인 조건식 
q1-2 char형 변수 ch가 'a' 또는 'A'일때   true인 조건식    
q1-3 char형 변수 ch가 숫자('0'~'9')일때   true인 조건식     
q1-4 char형 변수 ch가 영문자(대문자 또는 소문자) 일때   true인 조건식 */