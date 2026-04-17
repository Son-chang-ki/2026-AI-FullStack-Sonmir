package com.the703.basic008_ex;

public class Array2Ex005 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		char [][] arr = { {'A',   'B',   'C'} , { 'B',   'C',   'D' }  } ;
		char [][] arr1 = new char[2][3] ; 
		
		char data = 'A' ;
		for (char ch=0; ch<=arr1.length; ch++) {
			for (char kan = 0; kan<=arr1[ch].length; kan++)
			{
				arr1[ch][kan]= data; data+=1;
			}
		}
		
		// 출력
		for (char ch=1; ch<=arr1.length; ch++) {
			for (char kan =0; kan<=arr1[ch].length; kan++)
			{
				System.out.print(arr1[ch][kan] + "\t");
			}
			System.out.println();
		}

	}

}
/* 1. new 연산자 이용하여 다차원배열만들기
2. for + length 이용해서 대입   
3. for + length 이용해서 출력 
   A   B   C
   B   C   D */
