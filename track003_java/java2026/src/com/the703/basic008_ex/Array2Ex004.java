package com.the703.basic008_ex;

public class Array2Ex004 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		int [][] arr = { {100,   200,   300 } , { 400,   500,   600 }  };
		int [][] arr1 = new int [2][3] ;
		
		int data = 100;
		for(int ch=0; ch<arr1.length; ch++) { 
			for (int kan=0; kan<arr1[ch].length; kan++) 
			    { arr1[ch][kan] = data; data += 100;}
			}
		// 출력
		for(int ch=0; ch<arr1.length; ch++) { 
			for (int kan=0; kan<arr1[ch].length; kan++) 
			    { System.out.print(arr1[ch][kan] + "\t");}
			System.out.println();
		}

	}

}
/*1. new 연산자 이용하여 다차원배열만들기
2. for + length 이용해서 대입   
3. for + length 이용해서 출력 
   100   200   300   
   400   500   600 */
