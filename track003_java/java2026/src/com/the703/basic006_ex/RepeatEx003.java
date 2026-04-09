package com.the703.basic006_ex;

public class RepeatEx003 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		int hap = 0 ;
		// if(1이 3의 배수라면) {hap에 1 누적}
		// if(2이 3의 배수라면) {hap에 2 누적}
		// if(3이 3의 배수라면) {hap에 3 누적} 
				
		//if(1%3== 0) {hap+= 1;}
		//if(2%3== 0) {hap+= 2;}		// if(2이 3의 배수라면) {hap에 2 누적}
		//if(3%3== 0) {hap+= 3;}		// if(3이 3의 배수라면) {hap에 3 누적} 

		for(int i=1; i <=10; i++)
		{ if(i%3 == 0) {hap+= i;} } // 1%3==0 ==> 1을 3으로 나눴을때 나머지값을 표현함 (d%3) 
		System.out.println(hap); 
				
		int i1=1;
		while( i1 >=10 )
		{ if(i1%3 == 0) {hap+= i1;} i1++;}
		System.out.println(hap); 
				
		int i2=1;
		do
		{ if(i2%3 == 0) {hap+= i2;} i2++;}    while( i2 >=10 );
		System.out.println(hap); 

	}

}
/* 1 ~10 까지 3의 배수의 합 ? 18
for,  while, do while
ver-1 말로 풀어쓰기 => 
만약 1이 3의 배수의 누적합
만약 2이 3의 배수의 누적합
만약 3이 3의 배수의 누적합
ver-2 구조로 바꾸기 - 제어 , 반복
  if (만약 1이 3의 배수의) { 누적 합 }
  if (만약 2이 3의 배수의) { 누적 합 }
  if (만약 3이 3의 배수의) { 누적 합 }
ver-3 code로 풀기
int hap=0;
if (1%3==0) { hap +=1;}  
if (2%3==0) { hap +=2;}  
if (3%3==0) { hap +=3;}  */