package com.the703.basic005_ex;

import java.util.Scanner;

public class ForEx002 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		int num =-1;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("원하는 구구단을 입력하시오 > "); 
		num = scanner.nextInt();
		
		// 처리 + 출력
		// 패턴 : 시작 2; 종료 9; 변화 1	// a: 입력단  b:1~9 c: 결과값
		// for (int num=1; num<=9; num++)
		//{System.out.printf("%d*%d=%d", num, num, (num*num));} System.out.println();	
		// 눈에 보이는 그대로 출력
		// 2*1=2 {System.out.printf("%d*%d=%d\n", num, 1, (num*1));}
		{System.out.printf("%d*%d=%d\n", num, 2, (num*2));}
		{System.out.printf("%d*%d=%d\n", num, 3, (num*3));}
		
		for(int i=1; i<=9; i++)
		{System.out.printf("%d*%d=%d\n", num, i, (num*i));}  // {반복} , {변수}
		

	}

}
/*
출력내용 :   for 이용
사용자에게 단을 입력받아 해당하는 
단을 출력해주는 프로그램을 작성하시오. FOR문을 이용하시오. */