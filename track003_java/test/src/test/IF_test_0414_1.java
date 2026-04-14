package test;

import java.util.Scanner;

public class IF_test_0414_1 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 하나 입력하시오 > ");
		num = scanner.nextInt();
		
		if ( num == 1)   { System.out.println("1이라면 1이다.");}
		else if (num == 2) { System.out.println("2이라면 2이다.");}
		else if (num == 3) { System.out.println("3이라면 3이다.");}
		
		
		System.out.println();;
		switch ( num  )  {
		  case 1 : { System.out.println("1이라면 1이다.");} break;
		  case 2 : { System.out.println("2이라면 2이다.");} break;
		  case 3 : { System.out.println("3이라면 3이다.");} break;
		}
		

	}

}
