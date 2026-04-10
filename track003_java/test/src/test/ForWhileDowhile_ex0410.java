package test;

import java.util.Scanner;

public class ForWhileDowhile_ex0410 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1 2 3 4 5 6 7 8 9 10");
		//System.out.println("1"); System.out.println("2"); System.out.println("3"); System.out.println("4"); System.out.println("5"); 
		//System.out.println("6"); System.out.println("7"); System.out.println("8"); System.out.println("9"); System.out.println("10"); 
		
		 for (num = 1; num<=10; num++)
		      {  System.out.print(num + "\t"); } System.out.println();  

		      
		 int num1 = 1;    
           while ( num1<=10 )
			      {  System.out.print(num1 + "\t"); num1++ ;} System.out.println();  
			      
		 int num11 = 1;    
		 do
		 {  System.out.print(num11 + "\t"); num11++ ;}    while ( num11<=10 );    System.out.println(); 
	}

}
/*
3. for, while, do while 버전
1 2 3 4 5 6 7 8 9 10


4. 이중 for 버전
다음과 같은 모양을 출력하는 프로그램을 작성하시오.
 
1234
1234
1234
1234  */