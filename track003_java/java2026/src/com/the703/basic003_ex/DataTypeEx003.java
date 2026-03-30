package com.the703.basic003_ex;

import java.util.Scanner;

public class DataTypeEx003 {

	public static void main(String[] args) {
		// 변수 정의
		int year = 0;
		Scanner sc = new Scanner(System.in);
		// 입력
		System.out.println("태어난 년도를 입력하세요.> ");
		year = sc.nextInt();
		// 처리 
		year = 2026 - year;
		// 출력
		//System.out.println("당신의 나이는 " + (2026-year) + "살 입니다.");
		System.out.println("당신의 나이는 " + year + "살 입니다.");
		System.out.print("당신의 나이는 " + year + "살 입니다.\n");
		System.out.printf("당신의 나이는 %d 입니다.\n" , year); // 정수 %d
	}

}
/* 패키지명 : com.the703.basic003_ex
클래스명 : DataTypeEx003
출력내용 :  Scanner이용해서 태어난 년도를 입력받아 나이 계산하기
태어난 년도를 입력하세요. >
2000
당신의 나이는 25살 입니다. */