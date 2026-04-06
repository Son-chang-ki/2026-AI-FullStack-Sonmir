package com.the703.days;

import java.util.Scanner;

public class Day008 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		String std ="", pass = "", level ="" , best ="";
		int kor =0, eng =0, math =0, tot =0;
		double agv = 0.2f;
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.println(" 학번 입력 > "); 	std = scanner.next();
		System.out.println(" 국어점수 입력 > "); kor = scanner.nextInt();
		System.out.println(" 수학점수 입력 > "); math = scanner.nextInt();
		System.out.println(" 영어점수 입력 > "); eng = scanner.nextInt();
		
		tot = (kor + math + eng) ;
		agv = tot/3.0f; 
		/* pass = avg<60? "불합격" : kor >= 40 && math >= 40 && eng >= 40 ? "합격" : "불합격"; */
		if (agv >= 60 && kor >= 40 && math >= 40 && eng >= 40)  {pass = "합격" ;}
		if (agv >= 95) { best = "장학생" ;}
		/* level = avg >= 90 ? "수" : avg >= 80 ? "우"  : avg >= 70 ? "미" : avg >= 60 ? "양" : "가" ; */
		
		if (agv >= 90 ) { level = "수" ;}
		else if (agv >= 80) { level = "우" ;}
		else if (agv >= 70) { level = "미" ;}
		else if (agv >= 60) { level = "양" ;}
		else  { level = "가" ;}
		
		System.out.println("==========================================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t합격여부\t레벨\t장학생");
		System.out.println("==========================================================================");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\t%s\t%s\n", std,kor,eng,math,tot,agv,pass,level,best );			
	}

}
/*3. 필수조건
q1-1 int형 변수 x가 60이상일때 조건식                    System.out.println( x>60 );
q1-2 char형 변수 ch가 'a' 또는 'A'일때   true인 조건식    System.out.println (ch =='a' || ch=='A');
q1-3 char형 변수 ch가 숫자('0'~'9')일때   조건식         System.out.println (ch >='0' && ch <='9');
q1-4 char형 변수 ch가 영문자(대문자) 일때    조건식         System.out.println(ch=='A' && ch=='Z');

4.  eclipse 열어서 작성해주세요! [20분]

   패키지명 : com.the703.days
   클래스명 :  Day008
   출력내용 :  성적처리 프로그램입니다.
   1. 총점 구하기
   2. 평균 구하기
   3. 평균이 60점이상이고  각과목이 40점 미만이면 아니라면 합격/ 아니면 불합격
   4. 평균이 95점이상이면 장학생
   5. 평균이  90점이상이면 수, 80점이상이면 우, 70점이상이면 미, 60점이상이면 양, 아니라면 가 

   학번 입력 > std111
   국어점수 입력 > 100
   수학점수 입력 > 100
   영어점수 입력 > 99
   ======================================================== 
   학번   국어   영어   수학   총점   평균   합격여부   레벨   장학생
   ======================================================== 
   std111   100   100   99   299   99.67   합격   수   장학생
*/

