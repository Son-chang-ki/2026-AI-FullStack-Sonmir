package com.the703.basic006_ex;

public class RepeatEx001 {

	public static void main(String[] args) {
		// 변수 처리 입력 출력
		System.out.println("Q1-1.  for   1 2 3 4 5 ");
		for (int a=1; a<=5; a++) 		{  System.out.print("\t" + a); 	}
		
		System.out.println();
		int a1=1;
		while ( a1<=5) 		{  System.out.print("\t" + a1); 	a1++ ;}
		
		System.out.println();
		int a11=1;
		do		{  System.out.print("\t" + a11  ); 	a11++ ;  }  while ( a11<=5);
		

		System.out.println();
		System.out.println("Q1-2.  while   5 4 3 2 1 ");
		for (int b=5; b>=1; b--) 		{  System.out.print("\t" + b); 	}
		
		System.out.println();
		int b1=5;  		while ( b1>=1 ) 		{  System.out.print("\t" + b1); 	b1-- ;}
		
		System.out.println();
		int b11=5; 		do 		{  System.out.print("\t" + b11 ); 	b11-- ;  }  while ( b11>=1);
		
		System.out.println();
		System.out.println("Q1-3.  do while   JAVA1   JAVA2  JAVA3  ");
		
		for (int c=1; c<=3; c++ ) 		
		{ System.out.print("JAVA" + c + "\t");   }
		
		System.out.println();
		int c1=1; 		
		while ( c1<=3 ) {  System.out.print("JAVA" + c1 + "\t"); 	c1++ ;}

		System.out.println();
		int c11=1; 		
		do 		{  System.out.print("JAVA" + c11 + "\t"); 	c11++ ;}  while ( c11<=3 );	}

}
/* 1.  for , while , do while문을 이용해서 다음과 같이 출력하시오 :  1 2 3 4 5
2.  for , while , do while문을 이용해서 다음과 같이 출력하시오 :  5 4 3 2 1
3.  for , while , do while문을 이용해서 다음과 같이 출력하시오 :  JAVA1   JAVA2  JAVA3  */