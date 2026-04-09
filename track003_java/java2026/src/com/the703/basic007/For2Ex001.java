package com.the703.basic007;

public class For2Ex001 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		// ver-1 눈에 보이는 그대로
		char ch = '\u0000';
		System.out.print('#');  System.out.print('#');  System.out.print('#');  System.out.print('#'); System.out.println();
		System.out.print('#');  System.out.print('#');  System.out.print('#');  System.out.print('#'); System.out.println();
		System.out.print('#');  System.out.print('#');  System.out.print('#');  System.out.print('#'); System.out.println();
		System.out.print('#');  System.out.print('#');  System.out.print('#');  System.out.print('#'); System.out.println();
		
		// ver-2 칸 정리
		System.out.println();
		for(int i=1; i <=4; i++) {	System.out.print('#'); 	}  System.out.println();
		for(int i=1; i <=4; i++) {	System.out.print('#'); 	}  System.out.println();
		for(int i=1; i <=4; i++) {	System.out.print('#'); 	}  System.out.println();
		for(int i=1; i <=4; i++) {	System.out.print('#'); 	}  System.out.println();
		
		// ver-3 층 정리 
		System.out.println();
        for(ch=1; ch<=4; ch++)
		{
			for(int i=1; i <=4; i++) {	System.out.print('#'); 	}  System.out.println();
		}
	
	}

}
/* 이중 for 이용 
####
####
####
#### */ 