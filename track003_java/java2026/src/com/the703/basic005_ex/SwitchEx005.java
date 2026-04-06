package com.the703.basic005_ex;

import java.util.Scanner;

public class SwitchEx005 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		int a = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자한개 입력받아 > ");
		a = scanner.nextInt();
		
		// 1%2=1    2%2=0   3%2=1   4%2=0 나머지 값 구하는 문제
		switch ( a%2) { 
		case 1 : System.out.println("남자"); break;
		case 0 : System.out.println("여자"); break;
		}

	}

}
/*witch 이용
숫자한개 입력받아
홀수면 남자
짝수면 여자 */