package com.the703.basic008_ex;

public class ArrayEx001 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		double [] arr  = {1.1  , 1.2  , 1.3  , 1.4  , 1.5}; // 갯수 5, 0~4
		
		   System.out.print(arr[0] + "\t");
		   System.out.print(arr[1] + "\t");
		   System.out.print(arr[2] + "\t");
		   System.out.print(arr[3] + "\t");
		   System.out.println(arr[4] );
		   
		   for (int i=0; i<5; i++)      { System.out.print(arr[i] +"\t");}
		   
		   System.out.println();
		   System.out.println();
		   System.out.println(arr.length); // 갯수 5
		   for (int i=0; i<arr.length; i++)           { System.out.print(arr[i] +"\t") ;}

	}

}
/*
    1. 배열명 : arr
    2. 값 넣기 : 1.1  , 1.2  , 1.3  , 1.4  , 1.5
    3. for + length 로 출력

연습문제2)  array
패키지명 : com.the703.basic008_ex
클래스명 :  ArrayEx002
    1. 배열명 : arr
    2. 값 넣기 : 'A' , 'B' , 'C' , 'D'
    3. for + length 로 출력

연습문제3)  array
패키지명 : com.the703.basic008_ex
클래스명 :  ArrayEx003
    1. 배열명 : arr
    2. 값 넣기 : "아이언맨" , "헐크" , "캡틴"
    3. for + length 로 출력
    */
