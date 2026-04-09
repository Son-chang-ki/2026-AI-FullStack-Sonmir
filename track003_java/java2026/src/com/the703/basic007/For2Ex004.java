package com.the703.basic007;

public class For2Ex004 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		// ver-1 작은 단위로 눈에 보이는 그대로 
		System.out.print('#');   System.out.print('#');  System.out.print('#');  System.out.print('#');  System.out.println();
		System.out.print('#');   System.out.print('#');  System.out.print('#');  System.out.println();
		System.out.print('#');   System.out.print('#');  System.out.println();
		System.out.print('#');   System.out.println(); 
		
		// ver-2 칸 정리
		 System.out.println();
		 for(int a=4; a>=1; a--)  { System.out.print('#'); }  System.out.println();
		 for(int a=3; a>=1; a--)  { System.out.print('#'); }  System.out.println();
		 for(int a=2; a>=1; a--)  { System.out.print('#'); }  System.out.println();
		 for(int a=1; a>=1; a--)  { System.out.print('#'); }  System.out.println();
		 
		 //for(int a=1; a<=4; a++)  { System.out.print('#'); }  System.out.println();
		 //for(int a=1; a<=3; a++)  { System.out.print('#'); }  System.out.println();
		 //for(int a=1; a<=2; a++)  { System.out.print('#'); }  System.out.println();
		 //for(int a=1; a<=1; a++)  { System.out.print('#'); }  System.out.println();
		
		// ver-3 층 정리
		  System.out.println();
		  for(int ch=4; ch>=1; ch--) // 변수 조건식 잘 판단할 것!!!
		  {
			  for(int a=ch; a>=1; a--)  { System.out.print('#'); }  System.out.println();
			  //for(int a=1; a<=ch; a++)  { System.out.print('#'); }  System.out.println();
		  }

	}

}
/* (이중 for 이용)
####
###
##
#
*/