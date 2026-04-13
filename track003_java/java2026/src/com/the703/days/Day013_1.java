package com.the703.days;

import java.util.Scanner;

public class Day013_1 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		int day =0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("요일 입력(1~7) > ");
		day = scanner.nextInt();
				
		switch( day)         { 
		   case(1) :   System.out.println("월요일"); break;
		   case(2) :   System.out.println("화요일"); break;
		   case(3) :   System.out.println("수요일"); break;
		   case(4) :   System.out.println("목요일"); break;
		   case(5) :   System.out.println("금요일"); break;
		   default :   System.out.println("주말"); 
		
		}
		
	} 

}
/*
2. switch 버전 - 위의 문제를 switch 문으로 작성하시오.
*/