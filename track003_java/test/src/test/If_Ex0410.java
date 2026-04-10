package test;

import java.util.Scanner;

public class If_Ex0410 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력하시오 >");
		num = scanner.nextInt();
		
		   // 1이면 "월요일" 출력
		     if ( num == 1)   { System.out.println("월요일"); } 
		     else if ( num == 2)   { System.out.println("화요일"); } 
		     else if ( num == 3)   { System.out.println("수요일"); } 
		     else if ( num == 4)   { System.out.println("목요일"); } 
		     else if ( num == 5)   { System.out.println("금요일"); } 
		     else                  { System.out.println("주말"); }     
		     
	}

}
/*
if 버전
정수를 하나 입력받아 다음 조건에 따라 요일을 출력하는 프로그램을 작성하시오.
1 → "월요일"
2 → "화요일"
3 → "수요일"
4 → "목요일"
5 → "금요일"
그 외 → "주말"
*/