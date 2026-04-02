package com.the703.basic005_ex;

import java.util.Scanner;

public class IfEx005 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		char ch = '\u0000', ccc = '\u0000';
		Scanner scanner = new Scanner(System.in);
		// 입력
		System.out.println("문자한개를 입력 > ");
		ch = scanner.next().charAt(0);
		// 처리 A 65 a 97
		if ( ch >= 'A' && ch <= 'Z') { ccc = (char) (ch + 32); }
		else if (ch >= 'a' && ch <= 'z' )  { ccc = (char) (ch - 32); }
		// 출력
		
		System.out.println(ch + "를 변경하면? \t" + ccc);

	}

}
/* 출력내용 : 문자한개를 입력받아 
대문자인지 이면 소문자로,  소문자이면 대문자로 변경하는 프로그램을 작성하시오.
※  a = 'A' + 32    */
