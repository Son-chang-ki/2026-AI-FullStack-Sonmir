package com.the703.days;

public class Day015_1 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		// 버전1. 있는 그대로
		System.out.print('★');   System.out.print('★');   System.out.print('★');  System.out.println(); 
		System.out.print('★');   System.out.print('★');   System.out.println(); 
		System.out.print('★'); 
		
		// 칸 줄이기
		System.out.println();
		 for(int a = 3; a >= 3; a--)     { System.out.print('★') ; }   System.out.println();
		 for(int a = 3; a >= 2; a--)     { System.out.print('★') ; }   System.out.println();
		 for(int a = 3; a >= 1; a--)     { System.out.print('★') ; }   System.out.println();

		// ver3 칸 정리     
		System.out.println();
		  for (int i = 3; i <= 1; i--) {
			for (int a = 3; a <= i; a--) {
				System.out.print('★');
			}
			System.out.println();

	}

	}
}
/*2 이중 for 버전
다음과 같은 모양을 출력하는 프로그램을 작성하시오.
★★★
★★
★
*/