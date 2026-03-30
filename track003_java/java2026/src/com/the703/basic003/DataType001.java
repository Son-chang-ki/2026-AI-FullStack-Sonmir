package com.the703.basic003;

public class DataType001 {

	public static void main(String[] args) {
		// 1. 자바의 자료형 분류 (기본형 / 참조형)
		// 2. 기본형 : 값
		// 2-1. 논리형 : boolean - true/false
		boolean b1=true;
		System.out.println("1. 논리 : " + b1);
		
		// 2-2. 정수형 : byte - short - int★ - long(L) / 1,2,3 / 1byte-2byte-4byte-8byte)
		byte  by=1; 		short sh=2; 		int   i=4; 		long  l=8L;
		
		// byte hap = by + 1; // byte(1) + int(4)
		int hap = by + 1; 
		System.out.println("2. 정수 : byte - short - int★ -long" );
		
		// 2-3. 실수형 : float(f), double★ / 3.14 / 4byte-8byte)
		float f1=3.14f;
		double dou=3.14;
		
		float fp1 = 1.0000001f; //0 6개 + 1 = 7개
		float fp2 = 1.00000001f; //0 7개 + 1 = 8개
		float fp3 = 1.11111111f; //0 7개 + 1 = 8개
		
		//3. 참조형 : 주소값

	}

}
