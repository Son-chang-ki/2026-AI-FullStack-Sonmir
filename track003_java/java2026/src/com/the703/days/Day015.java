package com.the703.days;

public class Day015 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		//ver-1 있는 그대로 
		System.out.print("3\t");   System.out.print("2\t");   System.out.print("1"); 
		
		//ver-2 줄이기
		System.out.println();
		for (int i=3; i>=1; i--)   {  System.out.printf("%d\t", i)  ;}
		
		System.out.println();
		int i=3;
		while ( i>=1)   {  System.out.printf("%d\t", i--)    ;}
		
		System.out.println();
		int i1=3;
		 do {  System.out.printf("%d\t", i1--)  ;}    while ( i1>=1) ;

	}

}
/*1.  for, while , do while을 이용해서 문제를 풀으시오.
3   2   1

2 이중 for 버전
다음과 같은 모양을 출력하는 프로그램을 작성하시오.
★★★
★★
★

3.  1차원배열      new 연산자 이용해서 배열만들기
1. 배열명 : arr     
2. 값 넣기 :   A B C        for+length 이용서 값 대입
3. for + length 로 출력  */