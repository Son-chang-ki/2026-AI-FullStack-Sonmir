package com.the703.basic003_ex;

import java.util.Scanner;

public class DataTypeEx004 {

	public static void main(String[] args) {
		// 변수정의
		float fl = 3.14f;
		double dou = 3.14;
		//double num = 0;  
		Scanner sc = new Scanner(System.in);
		// 입력
		System.out.println("파이값을 입력하시오 > ");
		dou = sc.nextDouble();
		// 처리 X
		// 출력
		System.out.println("파이값은 " + dou + "입니다. "); // 3.12345678
		System.out.print("파이값은 " + dou + "입니다.\n "); // 3.12345678
		System.out.printf("파이값은 %f입니다.\n " , dou); //%f ==> 2.00, $d ==> 10, %s ==> "hi"  3.123457
		System.out.printf("파이값은 %.0f입니다.\n " , dou); //3 
		System.out.printf("파이값은 %.1f입니다.\n " , dou); // 3.1
		System.out.printf("파이값은 %.2f입니다.\n " , dou); // 3.12
		System.out.printf("파이값은 %.6f입니다.\n " , dou); // 3.123457 반올림
		
		System.out.println(10/3);
		System.out.println(10/3f);
		System.out.println(10f/3);
	}

}
/* 패키지명 : com.the703.basic003_ex
클래스명 : DataTypeEx004
출력내용 :  Scanner이용해서 파이값을 입력받고 출력하시오. 
     파이값을 입력하시오 > _입력받기    3.141592    ( 자료형선택 )
     파이값은 **입니다. */ 