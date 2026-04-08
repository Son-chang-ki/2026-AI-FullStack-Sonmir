package com.the703.basic006;

public class WhileBasic {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		// for 1  2  3 출력  for(시작;  종료 ;  변화)
		// { 반복 }  { 변수 }  
		System.out.println("ver-o");
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
				
		System.out.println("ver-1 for ");
		for (int a =1; a <=3; a++) {System.out.println(a);}
		
		
		System.out.println("ver-2 while "); // 계시판 작성시 사용됨. // for 시작이 먼저 선언되어지고 while ( 조건 ) {  변화}
		int a =1;
		while ( a <=3 ) {System.out.println(a);    a++;   }
		
		
		System.out.println("ver-2 do while "); // 무조건 1회는 실행해야 할때사용. // while과 유사하나, 시작 선언 do {  } while( 조건 )
		int a1 =1;
		do {System.out.println(a1);    a1++;   } while ( a1 <=3 ) ;

	}

}
