package com.the703.basic007_ex;

public class ArrayNewEx001 {

	public static void main(String[] args) {
	    //1. 배열명 : arr       new 연산자 이용해서 배열만들기
	    //2. 값 넣기 : 1.1  , 1.2  , 1.3  , 1.4  , 1.5      for+length 이용해보기
	    //3. for + length 로 출력 
		// [같은타입]의 데이터 [연속된 공간에] 저장하는 자료구조
		// new 공간빌리기   int 형태의 자료형 몇개
		
		double [] arr = { 1.1  , 1.2  , 1.3  , 1.4  , 1.5 };
		double [] arr2 = new double[5]; 
		double data= 1.1; 
		//3. for + length 대입
		// ver-1 arr2[0] = 0;   arr2[1] = 10;   arr2[2] = 20;
		// ver-2
		//	int data = 0;
		//	arr2[0] = data;  /* 1.1 넣고 */  data+=0.1;   /* 0.1 증가 */
		//arr2[1] = data; data+=10;   arr2[2] = data; data+=10;
		//arr2[0] = data; data+=0.1;   arr2[1] = data; data+=0.1;  arr2[2] = data; data+=0.1; 
		//arr2[3] = data; data+=0.1;   arr2[4] = data; data+=0.1;
		
		     for(int i=0; i<arr2.length; i++)          { arr2[i] = data; data+=0.1;     }
		     for(int i=0; i<arr2.length; i++)  {System.out.printf("%.1f\t", arr2[i] ); }
	}

}
