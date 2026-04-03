package com.the703.basic005_ex;

import java.util.Scanner;

public class IfEx008{

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		int  kor = 0, eng = 0, math = 0, total = 0 ;
		double avg = 0.2f; String level = "", pass = "", best = "", std = "";
		// String pass="불합격", level = "가", 
		Scanner scanner = new Scanner(System.in);
		// 입력
		System.out.println("학번 입력 > ");
		std = scanner.next(); //문자는 next()
		System.out.println("국어점수 입력 > ");
		kor = scanner.nextInt();
		System.out.println("수학점수 입력 > ");
		math = scanner.nextInt();
		System.out.println("영어점수 입력 > ");
		eng = scanner.nextInt();
		// 처리
		total = kor + eng + math;
		//System.out.println("총점" + total);
		avg = total/3.0; // avg = (double)total/3; 
		//System.out.println("평균" + avg);
		// 삼항연산자          조건    ?   참   :  거짓
		// System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : "ZERO"));
		//if(조건 ) {참일때의 결과값} 
		//if ( avg >= 60 && (kor >= 40 || math >= 40 || eng >= 40))   { pass = "합격" ; }
		if ( avg >= 60 && kor >= 40 && math >= 40 && eng >= 40)   { pass = "합격" ; }
		if ( avg >= 95 ) {best = "장학생" ; }
		if ( avg >= 90 ) {level = "수" ;}
		else if ( avg >= 80) { level = "우";}
		else if ( avg >= 70) { level = "미";}
		else if ( avg >= 60) { level = "양";}
		else   {level = "가" ;}
		// else if ( avg >= 60 && (kor >= 40 || math >= 40 || eng >= 40))   { pass = "합격" ; }
	
		// 출력
		System.out.println("=====================================================================\n");
		System.out.println("학번\t 국어\t영어\t수학\t총점\t평균\t합격여부\t레벨\t장학생\n");
		System.out.println("======================================================================");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\t%s\t%s\n",
		                  std, kor, eng, math, total, avg, pass, level, best);
		//if ( avg >= 60 && (kor >= 40 && math >= 40 && eng >= 40))   { pass = "합격" ; } else {pass = "불합격" ; }
	}

}
/* 출력내용 :  성적처리 프로그램입니다.

1. 총점 구하기
2. 평균 구하기
3. 평균이 60점이상이고  각과목이 40점 미만이면 아니라면 합격/ 아니면 불합격
4. 평균이 95점이상이면 장학생
5. 평균이  90점이상이면 수, 80점이상이면 우, 70점이상이면 미, 60점이상이면 양, 아니라면 가 

학번 입력 > std111
국어점수 입력 > 100
수학점수 입력 > 100
영어점수 입력 > 99
============================================= 
학번   국어   영어   수학   총점   평균   합격여부   레벨   장학생
============================================= 
std111   100   100   99   299   99.67   합격   수   장학생 */