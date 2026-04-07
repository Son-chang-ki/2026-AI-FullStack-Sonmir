package com.the703.basic005_ex;

public class ForEx004 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		int num =1;
		// 3,6,9,12 
		// 3*1 = 3   [1]
		// 3*2 = 6   [2]
		// 3*3 = 9   [3]
		for(int i=3; i<=10; i=i*1) { num = i*1; } 
		System.out.println(num);

	}

}
/* 출력내용 :   for 이용
1~10까지 3의 배수 갯수를 출력 
==> 무한반복 애러남  ==> 수정할것 */