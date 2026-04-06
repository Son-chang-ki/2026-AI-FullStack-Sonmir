package com.the703.basic005_ex;

import java.util.Scanner;

public class SwitchEx003 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		char ch = '\u0000';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자한개 입력받아 > ");
		ch = scanner.next().charAt(0);
		
		switch (ch) {
			case 'a': System.out.println("APPLE"); break;
			case 'b': System.out.println("BANANA"); break;
			case 'c': System.out.println("COCONUT"); break;
		}
		
	}

}
/*switch 이용
     문자한개 입력받아
     a이면 APPLE
     b이면 BANANA
     c이면 COCONUT */ 