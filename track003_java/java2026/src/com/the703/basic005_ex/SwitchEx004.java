package com.the703.basic005_ex;

import java.util.Scanner;

public class SwitchEx004 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		char ch = '\u0000';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자한개 입력받아 > ");
		ch = scanner.next().charAt(0);
		// 
		switch ( ch) { 
		case 'A' : System.out.println("APPLE"); break;
		case 'B' : System.out.println("BANANA"); break;
		case 'C' : System.out.println("COCONUT"); break;
		
		}

	}

}
/*witch 이용
 문자한개 입력받아
     a , A이면 APPLE
     b , B이면 BANANA
     c , C이면 COCONUT */