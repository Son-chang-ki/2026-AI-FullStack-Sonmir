package com.the703.basic005_ex;

public class ForEx001 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		
		//q1  for문을 이용해서 다음과 같이 출력하시오 :   1 2 3 4 5
		// 패턴 : 시작 1; 종료 5; 변화 1
		for (int a=1;a<=5 ; a++) 
			{System.out.print(a + "\t");}  System.out.println();
		
		//q2  for문을 이용해서 다음과 같이 출력하시오 :   5 4 3 2 1 
		// 패턴 : 시작 5; 종료 1; 변화 -1
		for( int a=5; a>=1; a=a-1)	
			{System.out.print(a + "\t");}  System.out.println();
		
		//q3  for문을 이용해서 다음과 같이 출력하시오 :   JAVA1 , JAVA2 , JAVA3 	
		// 패턴 : 시작 1; 종료 3; 변화 1	
		for(int a=1; a<=3; a++ )
		    {System.out.print("java" + a + "\t"); }
		// {System.out.print("," + "java" + a + "\t"); }
		
		// for(int a=1; a<=3; a++ )
		// {System.out.print((a==1 ? "" : ",") + "java" + a + "\t"); }
		
		
		//q4  for문을 이용해서 다음과 같이 출력하시오 :   HAPPY3 ,HAPPY2, HAPPY1
		// 패턴 : 시작 1; 종료 1; 변화 1	
		System.out.println();
		for(int a=3; a>=1; a=a-1 )
			{System.out.print("HAPPY" + a + "\t"); }

		//q5  for문을 이용해서 다음과 같이 출력하시오 :   0,1,2 
		// 패턴 : 시작 0; 종료 2; 변화 1	
		System.out.println();
		for(int a=0; a<=2; a++ )
			{System.out.print(a + "\t"); }  System.out.println();
		
		//q6  for문을 이용해서 다음과 같이 출력하시오 :   0,1,2, ,,,중간생략 ,,, 99	
		// 패턴 : 시작 0; 종료 99; 변화 1	
		System.out.println();
		for(int a=0; a<=99; a++ )
		{System.out.print(a + "\t"); }  System.out.println();

		//q7  for문을 이용해서 다음과 같이 출력하시오 :   10, 9,,,,중간생략 ,,, , 1
		// 패턴 : 시작 10; 종료 1; 변화 -1	
		System.out.println();
		for(int a=10; a>=1; a-- )
		{System.out.print(a + "\t"); }  System.out.println();
		
		//q8  for문을 이용해서 다음과 같이 출력하시오 :   0, 2, 4, 6, 8 
		// 패턴 : 시작 0; 종료 2; 변화 2	
		System.out.println();
		for(int a=0; a<=8; a=a+2 )
		{System.out.print(a + "\t"); }  System.out.println();
		
		//q9  for문을 이용해서 다음과 같이 출력하시오 :   0, 2, 4, 6, 8 ,,,중간생략 ,,, 18  
		// 패턴 : 시작 0; 종료 2; 변화 2	
		System.out.println();
		for(int a=0; a<=18; a=a+2 )
		{System.out.print(a + "\t"); }  System.out.println();
	
	}

}
