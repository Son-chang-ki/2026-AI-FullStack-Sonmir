package com.the703.basic004;

public class Casting001 {

	public static void main(String[] args) {
		// 1. 자료형 (기본형 / 참조형)
		// 2. 기본형 - 논리형 : boolean - true/false
		//           정수형 : byte 1 < short 2 < int★ 4 < long 8L 
		//           실수형 : float 4f < double★ 8
		// 3. #1.형변환 - 자동타입변환 (boolean X)
		byte by = 1; short sh = 2; int in = 4; long lo = 8L;
		float fl = 3.14f; double dou = 3.14; boolean bl = true;
		
		sh = by; // 정수형(2byte) - 정수형(1byte)
		in = by; // 정수형(4byte) - 정수형(1byte)
		lo = by; // 정수형(8byte) - 정수형(1byte)
		// lo = fl; // Type mismatch: cannot convert from float to long
		fl = lo; // 실수형(4byte) - 정수형(8byte)
		
		// in = bl; // 정수형(4byte) - 논리형(1byte)
		         // Type mismatch: cannot convert from boolean to int
		by = -128;
		by = 0;
		//by = 128; // byte = -128 ~ 127
		          //Type mismatch: cannot convert from int to byte
		// 1) bit : 1  0  <8bit - 1 byte
		//      1  0 (2개) / 10 10 -> 11 10 01 00 (4개)
		//      2^1 = 2      2^2 = 4          2^3 = 8,,,,, 2^8
		//      2     4     8    16     32    64    128    256    512    1024    2048   
		// 2) 양수 음수 -128 ~ (128 - 1 : 0포함)		
		
		//    #2.형변환 - 강제타입변환
		by = (byte) in; // 정수형(1byte) - 정수형(4byte) Type mismatch: cannot convert from int to byte
		
		int in2 = (int) 1.2;  // => int in2 = 1.2;
		float f12 = (float) 1.2;  //==> float f12 = 1.2; Type mismatch: cannot convert from double to float
		
		System.out.println(in2 + "\t" + f12);
		
		//Q1) System.out.println( 1.5 + 2.7 ); 형변환 이용해서 3으로 나오게 만들기
		System.out.println( (int)1.5 + (int)2.7);
		
		// 

	}

}
