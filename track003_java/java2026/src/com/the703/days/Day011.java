package com.the703.days;

import java.util.Scanner;

public class Day011 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		char ch = '\u0000';
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" a,b,c 중에 입력 >" );
		ch = scanner.next().charAt(0);
		// 문자를 한개 입력받아 a이면 apple , 
		//                b이면 banana, 
		//                c이면 coconut
		//처리
		if ( ch =='a' )  { System.out.println("apple");   }
		else if ( ch =='b' )  { System.out.println("banana");   }
		else if ( ch =='c' )  { System.out.println("coconut");   }
		// 삼항연산자 == ? 참 : 거짓
		//4. 삼항연산자 조건 ? 참 : 거짓 |  
		 System.out.println ( ch == 'a' ?  "apple" 
				 : ch == 'b' ?  "banana" 
			     : ch == 'c' ? "coconut" : "") ;


		System.out.println();
		
		switch (ch)  { 
			case 'a' :   System.out.println("apple"); break;  
			case 'b' :   System.out.println("banana"); break; 
			case 'c' :   System.out.println("coconut"); break;
		}
		// for (초기값, 조건, 증감)  {변수 }   {  변화 }
		for (int i =1; i <= 5; i++ )  
		     { System.out.println(i); }
		  	
		int i2 =1 ;
		while ( i2 <= 5 )  
	     { System.out.println(i2);   i2++  ; }
		
		int i1 =1;
		do
		{ System.out.println(i1);   i1++  ; }     while ( i1 <= 5 ) ;
				
	}

}
/*
1. if버젼에 해당하는 다음에 연결해서 문제를 작성하시오.
문자를 한개 입력받아 a이면 apple , b이면 banana, c이면 coconut
2. switch버젼에 해당하는 다음에 연결해서 문제를 작성하시오.
문자를 한개 입력받아 a이면 apple , b이면 banana, c이면 coconut

char ch='\u0000';
Scanner scanner =new Scanner(System.in);

System.out.println("a,b,c 중에 입력 > ");  
ch = scanner.next().charAt(0);

3. for, while, do while 버젼으로  문제를 풀으시오!  
 1  2  3  4  5 */

