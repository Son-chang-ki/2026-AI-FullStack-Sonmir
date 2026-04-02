package com.the703.basic005_ex;

import java.util.Scanner;

public class IfEx006 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		// 입력
		System.out.println("숫자를입력 > ");
		num = scanner.nextInt();
		// 처리
		if ( num %2 == 0 ) { System.out.println("여자");  }
		else               { System.out.println("남자");  }
		//if ( num %2 == 0 )        { System.out.println("여자");  }
		//else if ( num %1 == 0 )   { System.out.println("남자");  }
	}

}
/* 출력내용 : 숫자를입력을받아
홀수면 남자, 짝수면 여자를 출력하는 프로그램을 작성하시오.
※  num%2==0  짝수 */