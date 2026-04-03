package com.the703.basic005_ex;

import java.util.Scanner;

public class IfEx007 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		int num1 = 0, num2 = 0;  char ch = '\u0000'; 
		double result = 0.0;
		// String st = "%d %s %d = %.0f";
		Scanner scanner = new Scanner(System.in);
		// 입력
		System.out.print("정수를 하나 입력해주세요 >" );
		num1 = scanner.nextInt();
		System.out.print("정수를 하나 입력해주세요 >" );
		num2 = scanner.nextInt();
		System.out.print("연산자를 입력해주세요(+,-,*,/) >" );
		ch = scanner.next().charAt(0);  //"a(0)b(1)c(2)"
		// 처리  ver1 출력서식 맞추기 %d 정수, %.2f 실수
		//if ( ch == '+' )  { System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));}
		// else if ( ch == '-' ) { System.out.println(num1 + "+" + num2 + "=" + (num1 - num2));}
		// else if ( ch == '*' ) { System.out.println(num1 + "+" + num2 + "=" + (num1 * num2));}
		// else if ( ch == '/' ) { System.out.printf("%d / %d = %.2f" ,num1, num2, num1 / (double)num2);}
		// result = num1 + num2;
		if ( ch == '+' )       { result = (num1 + num2);}
		else if ( ch == '-' )  { result = (num1 - num2);}
		else if ( ch == '*' )  { result = (num1 * num2);}
		else if ( ch == '/' )  { result = ((double)num1 / num2); } //st = "%d %s %d = %.2f"; }
		// 출력
	    System.out.printf(ch == '/' ? "%d %s %d = %.2f" : "%d %s %d = %.0f", num1, ch, num2, result); 
		//System.out.println(num1 + st + num2 + " = " + result );
		// System.out.println((int)ch);
	    System.out.printf("%d %c %d = " + (ch == '/' ? "%.2f" : "%.0f"), num1, ch, num2, result);
   /*   ==> System.out.printf("%d / %d = %.2f" , num1, num2, result);
    *       System.out.printf("%d %c %d = %d\n" , num1, ch, num2, (int)result);
    */
	}

}
/* 출력내용 :  계산기
1. 정수를 하나 입력해주세요 > 10
2. 정수를 하나 입력해주세요 > 3
3. 연산자를 입력해주세요(+,-,*,/) > +
10+3=13  */
