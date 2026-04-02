package com.the703.basic005_ex;

import java.util.Scanner;

public class IfEx002 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		// 입력
		System.out.println(" 숫자를 입력하시오 > ");
		num = scanner.nextInt();
		// 처리
		if (num > 0 ) {System.out.println("양수"); }
		else if (num < 0 ) {System.out.println("음수");}
		else if (num == 0) {System.out.println("Zero"); }
		
		// 삼항연산자          조건    ?   참   :  거짓
		System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : "ZERO"));
	}

}
/*출력내용 : 숫자 한개를 입력받아 
양수라면 양수  , 음수라면 음수  ,0이라면 zero를 출력하는 프로그램을 작성하시오.*/