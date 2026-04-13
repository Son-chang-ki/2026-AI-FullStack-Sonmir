package com.the703.basic008_ex;

public class ArrayEx002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] arr  = {'A' , 'B' , 'C' , 'D'};  // 값 4 0~3
		System.out.println();
		    for (int a = 0; a<4; a++)            { System.out.print(arr[a] +"\t"); }
		
		    
		    System.out.println();
		    System.out.println(arr.length);   // 값 4 
		    for (int i = 0; i<4; i++)            { System.out.print(arr[i] +"\t"); }

	}

}
/*
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