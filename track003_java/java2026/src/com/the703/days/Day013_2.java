package com.the703.days;

public class Day013_2 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		int a = 0;
		//System.out.print("1" + "\t");  System.out.print("2" + "\t");  System.out.print("3" + "\t");
		//System.out.print("4" + "\t");  System.out.print("5" + "\t");  System.out.print("1" + "\t");

		System.out.println(" 1  2  3  4  5  6  7  8  9  10 ");
		
		 for   (int a1=1; a1<=10; a1++)       {  System.out.print(a1 + "\t");    }
		 System.out.println();
		
		 
		 int a11=1; // 변수 초기화
		 while   (a11<=10 )       {  System.out.print(a11 + "\t");  a11++ ; }
		 System.out.println();
		 
		 
		 int a111=1;  // 변수 초기화
		 do {  System.out.print(a111 + "\t");  a111++ ; }    while   (a111<=10 ) ;
		 
	}

}
/*
3. for, while, do while 버전
1 2 3 4 5 6 7 8 9 10   */