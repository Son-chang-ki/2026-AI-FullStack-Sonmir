package com.the703.basic005_ex;

import java.util.Scanner;

public class IfEx007_1 {

	public static void main(String[] args) {
		// 변수 정의
		int num1 = 0, num2 = 0;  char ch = '\u0000'; 
		String result = "";
		Scanner scanner = new Scanner(System.in);
		// 입력
		System.out.print("정수를 하나 입력해주세요 >" );
		num1 = scanner.nextInt();
		System.out.print("정수를 하나 입력해주세요 >" );
		num2 = scanner.nextInt();
		System.out.print("연산자를 입력해주세요(+,-,*,/) >" );
		ch = scanner.next().charAt(0);  //"a(0)b(1)c(2)"
		// 처리
		if ( ch == '+' )       { result += (num1 + num2);}
		else if ( ch == '-' )  { result += (num1 - num2);}
		else if ( ch == '*' )  { result += (num1 * num2);}
		else if ( ch == '/' )  { result += String.format("%.2f", (double)num1 / num2); }
		// 출력
		System.out.println(" " + num1 + ch + num2 + " = " + result );
		

	}

}
