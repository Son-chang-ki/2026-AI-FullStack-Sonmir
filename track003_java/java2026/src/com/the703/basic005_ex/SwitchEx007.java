package com.the703.basic005_ex;

import java.util.Scanner;

public class SwitchEx007 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		int avg =0; //double avg=0;
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("평균 한 개 입력받아 >");
		avg = scanner.nextInt();  // avg = scanner.nextDouble();
		
		switch ( avg /10) { //89.9 => 우 : 89.9/10 => 8.99 => (int)8 // switch ((int) avg /10)
		  case 10 : case 9 : System.out.println("수"); break;
		  case 8 : System.out.println("우"); break;
		  case 7 : System.out.println("미"); break;
		  case 6 : System.out.println("양"); break;
		  default : System.out.println("가");
		}

	}

}
/* switch 이용
평균 한 개 입력받아
90~100점대면 수
80~90점(90점미만)대면  우
70~80점(80점미만)대면  미
60~70점(70점미만)대면  양
나머지 가 */