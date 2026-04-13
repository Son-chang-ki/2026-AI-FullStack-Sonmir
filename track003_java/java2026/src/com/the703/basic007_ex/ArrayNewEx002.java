package com.the703.basic007_ex;

public class ArrayNewEx002 {

	public static void main(String[] args) {
		// [같은타입]의 데이터 [연속된 공간에] 저장하는 자료구조
		// new 공간빌리기   int 형태의 자료형 몇개
		char [] arr = {'A',   'B',   'C',   'D',   'E'};
		char [] arr2 = new char[5] ;
		
		//3. for + length 대입
		// ver-1 arr2[0] = 'A';   arr2[1] = 'B';   arr2[2] = 'C';  arr2[3] = 'D';   arr2[4] = 'E';
		
		// ver-2
		// arr[0]=data++; /* data('A') 대입; 빠져나와서 증가(B) */
		// arr[1]=data++; /* data('B') 대입; 빠져나와서 증가(C) */
		
			char data = 'A';
			arr2[0] = data; data+=1;   arr2[1] = data; data+=1;   arr2[2] = data; data+=1;    arr2[3] = data; data+=1; 
			for(int i=0; i<arr.length; i++ )      {  arr2[i] = data; data+=1;   }   
			for(int i=0; i<arr.length; i++ )      {  System.out.printf("%s\t" , arr[i]);   }  
			
			// 변수
			// char [] arr = { } ;
			// char [] arr = new char[5];
			// char data ='A';
			// 입력
			// arr[0] = 'A'; 
			
	}

}
/*
클래스명 :  ArrayNewEx002
new 연산자 이용해서 배열만들기
1. 배열명 : arr     
2. 값 넣기 : A   B   C   D   E    for+length 이용해보기
3. for + length 로 출력
*/