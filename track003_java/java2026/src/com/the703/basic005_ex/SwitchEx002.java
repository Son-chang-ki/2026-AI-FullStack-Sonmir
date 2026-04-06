package com.the703.basic005_ex;

import java.util.Scanner;

public class SwitchEx002 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		int a = 0;
		Scanner scanner = new Scanner(System.in);
		// 입력
		System.out.println("숫자한개 입력받아" + a);
		a = scanner.nextInt();
		// 처리 + 출력
		switch ( a) { // 3/3=1(몫)     4/3=1(몫)   5/3=1(몫)
		  // case 3: case 4 : case 5 : System.out.println("봄"); break;
		  case 3 : System.out.println("여름"); break;
		  case 4 : System.out.println("가을"); break;
		  case 5 : System.out.println("겨울"); break;
		  
		  case 6 : System.out.println("여름"); break;
		  case 7 : System.out.println("여름"); break;
		  case 8 : System.out.println("여름"); break;
		  // case 6 : case 7 : case 8 : System.out.println("여름"); break;
		  // 6/3=2(몫)   7/3=2(몫)    8/3=2(몫)
		  
		  case 9 : System.out.println("가을"); break;
		  case 10 : System.out.println("가을"); break;
		  case 11 : System.out.println("가을"); break;
		  // case 9 : case 10 : case 11 : System.out.println("가을"); break;
		  
		  case 12 : System.out.println("겨울"); break;
		  case 1 : System.out.println("겨울"); break;
		  case 2 : System.out.println("겨울"); break;
		  // case 12 : case 1 : case 2 : System.out.println("겨울"); break;
		  //  12/3 =4 (몫)     1/3=0 (몫)     2/3 = 0 (몫)
		
		   // 버젼 2
		   //switch (a/3) { 
			 // case 1 : System.out.println("봄"); break;
			 // case 2 : System.out.println("여름"); break;
			 // case 3 : System.out.println("가을"); break;
			 // case 12 : case 0 : System.out.println("겨울"); break; 
		    }

	    }

    }
	

/* switch 이용
숫자한개 입력받아
3,4,5이면 봄
6,7,8이면 여름
9,10,11이면 가을
12,1,2이면 겨울 */