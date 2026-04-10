package com.the703.days;

import java.util.Scanner;

public class Day012 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		int num = 0, avg = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력받아? ");
		num = scanner.nextInt();
		
		if (num >= 90) { System.out.println("A학점"); System.out.println();} 
		else if (num >= 80) { System.out.println("B 학점"); System.out.println();} 
		else if (num >= 70) { System.out.println("C 학점"); System.out.println();} 
		else if (num < 70) { System.out.println("F 학점"); System.out.println();} 
		
	
		System.out.println();
		//Scanner scanner = new Scanner(System.in);
		System.out.print("평균입력 > ");  
		avg = scanner.nextInt();
		
		switch (avg /10) { 
		  case 10 : case 9 :   System.out.println("A 학점"); break; 
		  case 8 : System.out.println("B 학점"); break; 
		  case 7 : System.out.println("C 학점"); break; 
		  default : System.out.println("F 학점");  
		  
		}
		
		// ver-1 눈에 보이는 그대로
		// 1  2  3
		// 1  2  3
		System.out.print("1");   System.out.print("2");   System.out.print("1");   System.out.println();
		System.out.print("1");   System.out.print("2");   System.out.print("1");   System.out.println();
		// ver-2 칸 정리
		
		// ver-3 층 정리 
	}

}


/* 1. if버젼에 해당하는 다음에 연결해서 문제를 작성하시오.
정수를 하나 입력받아 다음 조건에 따라 성적을 출력하는 프로그램을 작성하시오.
90점 이상 → "A 학점"
80점 이상 → "B 학점"
70점 이상 → "C 학점"
그 외 → "F 학점"

2. switch버젼에 해당하는 다음에 연결해서 문제를 작성하시오.
위의 문제를 switch 로

int avg=0;
Scanner scanner = new Scanner(System.in);
System.out.print("평균입력 > ");  avg = scanner.nextInt();

3. for, while, do while 버젼으로  문제를 풀으시오!  
1 2 3

4. 이중 for를 이용해서 다음문제를 풀으시오.
★★★★
★★★★
★★★★
★★★★ */
