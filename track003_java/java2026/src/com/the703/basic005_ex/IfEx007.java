package com.the703.basic005_ex;

import java.util.Scanner;

public class IfEx007 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		int num1 = 0, num2 = 0; 
		double result = 0.0;
		Scanner scanner = new Scanner(System.in);
		// 입력
		System.out.println("정수를 하나 입력해주세요 >" + num1);
		num1 = scanner.nextInt();
		System.out.println("정수를 하나 입력해주세요 >" + num2);
		num2 = scanner.nextInt();
		// 처리
		result = num1 + num2;
		if ( result == num1 + num2  )  { num1 + num2}
 
	}

}
/* 출력내용 :  계산기
1. 정수를 하나 입력해주세요 > 10
2. 정수를 하나 입력해주세요 > 3
3. 연산자를 입력해주세요(+,-,*,/) > +
10+3=13  */