package com.the703.basic008_ex;

public class Array2Ex003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {  {10,   20,   30 } , { 40,   50,   60}   };
		int [][] arr1 = new int [2][3];
		// 층, 칸 줄이기 for
		int data = 10;
		for(int ch=0; ch<arr1.length; ch++) {
			for (int kan=0; kan<arr1[ch].length; kan++)
			  { arr1[ch][kan] = data ; 
			     data+=10; }
		}
		// 출력 처리
			for(int ch1=0; ch1<arr1.length; ch1++) {
			   for (int kan=0; kan<arr1[ch1].length; kan++)
			     { System.out.print(arr1[ch1][kan] + "\t");  }
			   System.out.println();
		  }   
			
	}

}
/* 1. new 연산자 이용하여 다차원배열만들기
2. for + length 이용해서 대입   
3. for + length 이용해서 출력 
   10   20   30   
   40   50   60  */