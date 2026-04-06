package com.the703.basic006_ex;

import java.util.Scanner;

public class ForIn001 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		int kor = -1, math = -1, eng = -1, tot = 0;
		double avg =0.2f; String std="", pass="", best="", level ="";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("학번 입력 >"); std = scanner.next();
		System.out.println("국어점수 입력 >"); //for(초기값 ; 조건; 증감)
		kor = scanner.nextInt();
		  for(; kor<0 || kor>100; ) {
		     if (kor < 0) {System.out.println("국어점수 입력 >");  break;}
			   // 1. 국어점수 입력 >100 입력받기  2. 건너뛰기(continue)
		  }
		  
		System.out.println("수학점수 입력 >"); 
		math = scanner.nextInt();
		  for(; math<0 || math>100; ) { 
	        if (math < 0) {System.out.println("수학점수 입력 >"); break; }
		  }
		
		System.out.println("영어점수 입력 >"); 
		eng = scanner.nextInt();
		  for(; eng<0 && eng>100; ) { 
	         if (eng < 0) {System.out.println("영어점수 입력 >"); break; }
		}
		tot = kor + math + eng;
		avg = tot/3.0f;
		
		if ( avg >= 60 && kor >= 40 && math >= 40 && eng >=40 ) {pass = "합격" ;}
		if (avg >= 95) { best = "장학생" ;}
		// 삼항연산자          조건    ?   참   :  거짓
		level = avg >= 90 ? "수" : avg >= 80 ? "우" : avg >= 70 ? "미" : avg >= 0 ? "양" :  "가" ;
		
		System.out.println("===================================================================================");
		System.out.println("학번\t 국어\t영어\t수학\t총점\t평균\t합격여부\t레벨\t장학생\n");
		System.out.println("===================================================================================");
		System.out.printf("%s\t"+"%d\t"+"%d\t"+"%d\t"+"%d\t"+"%.2f\t"+"%s\t"+"%s\t"+"%s\n",
                std, kor, eng, math, tot, avg, pass, level, best);
	}

}
/*성적처리 프로그램입니다.
0. 국어,영어, 수학(0~100만입력받기)  
1. 총점 구하기
2. 평균 구하기
3. 평균이 60점이상이고  각과목이 40점 미만이면 아니라면 합격/ 아니면 불합격
4. 평균이 95점이상이면 장학생
5. 평균이  90점이상이면 수, 80점이상이면 우, 70점이상이면 미, 60점이상이면 양, 아니라면 가 

학번 입력 > std111
국어점수 입력 > 100  
수학점수 입력 > 100
영어점수 입력 > 99
=================================================================================== 
학번   국어   영어   수학   총점   평균   합격여부   레벨   장학생
=================================================================================== 
std111   100   100   99   299   99.67   합격   수   장학생
*/