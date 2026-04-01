package com.the703.basic004_ex;

public class CastingEx004 {

	public static void main(String[] args) {
		// 변수
		  short sh1 = 1;
		  short sh2 = 2;
		  // short result = sh1 + sh2; // result (char, 2byte) = int(4) + int(4) 
		  // int 보다 작은 자료형 : byte, short / char
		  // 작은 정수형끼리 연산시 내부적으로 자동으로 int로 변환해서 계산
		// 입력

	    // 처리
		  short result = (short) (sh1 +sh2);
		// 출력

	}

}
/* short sh1 = 1;
short sh2 = 2;
short result = sh1 +sh2;*/