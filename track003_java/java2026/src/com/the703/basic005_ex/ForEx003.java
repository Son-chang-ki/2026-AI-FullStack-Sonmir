package com.the703.basic005_ex;

public class ForEx003 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		int sum=0;
		
		// 패턴 : 시작 1; 종료 10; 변화 ++1
		// 1+2+3+4+++10 
		// sum [누적박스:0] = 0
		// sum [누적박스:1] = 0+1        sum = sum +1
		// sum [누적박스:3] = 0+1+2      sum = sum +2 
		// sum [누적박스:6] = 0+1+2+3    sum = sum +3
		
		// for(int i=0; i<=10; i++)
		// {System.out.print(sum = sum + i); System.out.println(); } ==> 결과값이 출력되는 구문
		// ==> 각 라인에서 합이 출력 됨 
		// 출력 { }  {변수}
		for(int i=0; i<=10; i++) { sum = sum +i;}
		   System.out.println(sum);
	}

}
/*
출력내용 :   for 이용
1~10까지의 합을 구하시오.  */