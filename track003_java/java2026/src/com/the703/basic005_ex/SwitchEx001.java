package com.the703.basic005_ex;

import java.util.Scanner;

public class SwitchEx001 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		int a = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" 숫자한개 입력받아 " );
		a = scanner.nextInt();

		switch ( a) { // 1. 대상 
		case 3 : System.out.println("봄"); break;
		case 6 : System.out.println("여름"); break;
		case 9 : System.out.println("가을"); break;
		case 12 : System.out.println("겨울"); break;
		default : System.out.println("봄, 여름, 가을, 겨울이 아니다");
		// default : System.out.println("3,6,9,12 중 숫자를 입력하세요");
		}
	}

}
/* 출력내용 :  switch 이용
숫자한개 입력받아
3이면 봄
6이면 여름
9이면 가을
12이면 겨울 */ 