package com.the703.basic005_ex;

import java.util.Scanner;

public class IfEx001 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		int avg = 0;  //double avg = 0; // String result = "불합격"
		Scanner scanner = new Scanner(System.in);
		// 입력
		System.out.println("평균을 입력하시오. > ");
		avg = scanner.nextInt();

		// 처리
		if (avg >= 60) {System.out.println(" 합격 "); }
		else           {System.out.println(" 불합격"); }
		
		if (avg < 60) {System.out.println(" 불합격 "); }
		else           {System.out.println(" 합격"); }
		
		// 삼항연산자  조건 ? 참 : 거짓
		System.out.println( avg >= 60? "합격" : "불합격");
		System.out.println( avg < 60? "불합격" : "합격");
		
		// if(avg >= 60) { result = "합격"};
		   

	}

}
/* 출력내용 : 평균을 입력받아 60점이상이면 합격,  불합격여부를 출력하는 프로그램을 IF로 작성하시오. */
