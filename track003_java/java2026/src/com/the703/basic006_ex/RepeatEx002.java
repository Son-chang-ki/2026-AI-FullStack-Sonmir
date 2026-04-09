package com.the703.basic006_ex;

public class RepeatEx002 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		// 1 2 3 .... 10 사이의 3의 배수의 수는 ? 3 + 6 + 9 = 18    int a=0; a<=10; a*3
		int con = 0 ;
		//if (a <=10) {hap = hap + a;}
		//if (hap%3==0) {  hap ++;}  
		//System.out.println(hap);

		// if(1이 3의 배수라면) {갯수 카운드} ==> 카운드할 변수 필요
		// if(2이 3의 배수라면) {갯수 카운드}
		// if(3이 3의 배수라면) {갯수 카운드} 
	

		for(int i=1; i <=10; i++)
		{ if(i%3 == 0) { System.out.print( i + "\t"); con++;}  } 
		System.out.println();
		System.out.println("3의 배수의 수는 ? " + con);
		
		System.out.println();
		int i1=1;  con = 0 ; // 각각에 초기화 시키기 con = 0 ; 
		while( i1 <=10 )
		{ if(i1%3 == 0) { System.out.print( i1 + "\t"); con++;} i1++; } 
		System.out.println();
		System.out.println("3의 배수의 수는 ? " + con);
		
		
		System.out.println();
		int i2=1; con = 0 ;
		do
		{ if(i2%3 == 0) { System.out.print( i2 + "\t"); con++;} i2++; } while( i2 <=10 );
		
		System.out.println();
		System.out.println("3의 배수의 수는 ? " + con);

	}

}
