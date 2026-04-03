package com.the703.basic006;

import java.util.Scanner;

public class Forinfinit {

	public static void main(String[] args) {
		// 제어문
		// 조건문 : ~ 라면    if  / switch
		// 반복문 : 반복   for / while / do while
		// 제어조건 : break  / continue
		
		// 1. 영역 지정(설정) {     }
		//for(;;) { System.out.println("Hello"); }
		
		Scanner scanner = new Scanner(System.in);
		//int a = -1;
		
		// 2. 빠져나올 조건
		int a = -1;
		for(;;) {
		  System.out.println("Hello");
			System.out.println("빠져 나오실래요? 0이면 종료");
			a = scanner.nextInt();
			if (a==0) break; 	}
		
		//int a = -1;    // a   [ -1 ]
		//for(; a!=0; )  // a 가 0 아니면   초기값/ 조건식 / 증가
		//{// 여기서부터
		//	  System.out.println("Hello");
		//		System.out.println("빠져 나오실래요? 0이면 종료");
		//		a = scanner.nextInt();
		// }// 여기까지 반복해
		
		// while() 

	}

}
