package com.the703.days;

import java.util.Scanner;

public class Day012_1 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		int num = 0, avg = 0;
		char ch= '\u0000';
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("정수를 하나 입력받아? ");
		//num = scanner.nextInt();
		
		// ver-1 눈에 보이는 그대로
		// 1  2  3

		System.out.print("1");   System.out.print("2");   System.out.print("3");   System.out.println();

		System.out.println();
		  for (num=1; num <=3; num++)   {   System.out.print(num + "\t");   }  System.out.println();      
		  
		System.out.println();
		int num1 = 1;
		
		while ( num1 <=3 )   {   System.out.print(num1 + "\t");   num1++;}  System.out.println();   
		
		System.out.println();
		int num2 = 1;
		
		 do {   System.out.print(num2 + "\t");   num2++;}    while ( num2 <=3 ) ;
		 System.out.println();
 
			// ver-1 눈에 보이는 그대로
			// ★★★★
		    // ★★★★
		    // ★★★★
		    // ★★★★
		    System.out.println();
			System.out.print("★");   System.out.print("★");   System.out.print("★");  System.out.print("★");  System.out.println();
			System.out.print("★");   System.out.print("★");   System.out.print("★");  System.out.print("★");  System.out.println();
			System.out.print("★");   System.out.print("★");   System.out.print("★");  System.out.print("★");  System.out.println();
			System.out.print("★");   System.out.print("★");   System.out.print("★");  System.out.print("★");  System.out.println();
			
			// ver-2 칸 정리
			System.out.println();
			  for (ch=1; ch <=4; ch++)   {   System.out.print("★" );   }  System.out.println();  
			  for (ch=1; ch <=4; ch++)   {   System.out.print("★" );   }  System.out.println();  
			  for (ch=1; ch <=4; ch++)   {   System.out.print("★" );   }  System.out.println();  
			  for (ch=1; ch <=4; ch++)   {   System.out.print("★" );   }  System.out.println();  

			// ver-3 층 정리 		 
			  System.out.println();
			   for(int i =1; i<=4; i++)
			  {
				  for (ch=1; ch <=4; ch++)   {   System.out.print("★" );   }  System.out.println();
			  }

	}
}
/* 3. for, while, do while 버젼으로  문제를 풀으시오!  
1 2 3

4. 이중 for를 이용해서 다음문제를 풀으시오.
★★★★
★★★★
★★★★
★★★★ */