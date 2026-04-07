package com.the703.basic006_ex;

import java.util.Scanner;

public class ForIn002 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		// 자료형 : 기본형 /참조형 (String)
		// 기본형 - 정수 : byte(1)<short(2)/char(2)<int★(4) <long(8) // 실수 :
		// flaot(4)<bouble★(8)
		// boolean 빼고 타입형변환가능
		int kor = -1, math = -1, eng = -1, tot = -1; /* 1) 0~100 사이의 아닌 값 */
		double avg = -1;
		String std = "", pass = "불합격", best = "", level = "가";

		Scanner scanner = new Scanner(System.in);
		// 입력 0. 국어,영어, 수학(0~100만입력받기) 무한반복
		// 문자열: next() / 정수형(10) : nextInt() / 실수형(1.23) : nextDouble()
		// 문자 : next().charAt(0)
		System.out.println("학번 입력 >");
		std = scanner.next();

		for (;;) { // for(초기값 ; 조건; 증감) //5) 여기와서
			// if ( !(kor >= 0 && kor <= 100)) { // 2) kor = -1
			if (kor < 0 || kor > 100) { // 2)
				System.out.println("국어점수 입력 >");
				kor = scanner.nextInt(); // 3)
				continue; // 4) 이 아래 코드 진행 안함
			}

			// if ( !(math >= 0 && math <= 100)) {
			if (math < 0 || math > 100) {
				System.out.println("수학점수 입력 >");
				math = scanner.nextInt();
				continue;
			}

			// if ( !(eng >= 0 && eng <= 100)) {
			if (eng < 0 || eng > 100) {
				System.out.println("영어점수 입력 >");
				eng = scanner.nextInt();
				continue;
			}
			// 처리 - 연산자 먼저 () 값(++,--,산술) 비교(<,>) 조건(&& || 삼항) 대입(=)
			// - 제어문 (# if/ # switch) 반복(#for / whith / do while)
			tot = kor + math + eng; // 1. 총점 구하기
			avg = tot / 3.0f; // 2. 평균 구하기 (강제형변화) 정수/실수
			// 3. 평균이 60점이상이고 각과목이 40점 미만이면 아니라면 합격/ 아니면 불합격

			if (avg >= 60 && kor >= 40 && math >= 40 && eng >= 40) {
				pass = "합격";
			}
			// pass = avg < 60 ? "불합격" : kor < 40 || eng < 40 || math < 40 ? "불합격" : "합격";
			if (avg >= 95) {
				best = "장학생";
			} // 4. 평균이 95점이상이면 장학생

			switch ((int) avg / 10) { // 95-> 9 수
			case 10:
			case 9:
				level = "수";
				break;
			case 8:
				level = "우";
				break;
			case 7:
				level = "미";
				break;
			case 6:
				level = "양";
				break;
			}
				// 삼항연산자 조건 ? 참 : 거짓
				level = avg >= 90 ? "수" : avg >= 80 ? "우" : avg >= 70 ? "미" : avg >= 0 ? "양" : "가";

				System.out
						.println("===================================================================================");
				System.out.println("학번\t 국어\t영어\t수학\t총점\t평균\t합격여부\t레벨\t장학생\n");
				System.out
						.println("===================================================================================");
				System.out.printf("%s\t" + "%d\t" + "%d\t" + "%d\t" + "%d\t" + "%.2f\t" + "%s\t" + "%s\t" + "%s\n", std,
						kor, eng, math, tot, avg, pass, level, best);
			

		}
	}
}
/*
 * 성적처리 프로그램입니다. 0. 국어,영어, 수학(0~100만입력받기) 1. 총점 구하기 2. 평균 구하기 3. 평균이 60점이상이고
 * 각과목이 40점 미만이면 아니라면 합격/ 아니면 불합격 4. 평균이 95점이상이면 장학생 5. 평균이 90점이상이면 수, 80점이상이면
 * 우, 70점이상이면 미, 60점이상이면 양, 아니라면 가
 * 
 * 학번 입력 > std111 국어점수 입력 > 100 수학점수 입력 > 100 영어점수 입력 > 99
 * =============================================================================
 * ====== 학번 국어 영어 수학 총점 평균 합격여부 레벨 장학생
 * =============================================================================
 * ====== std111 100 100 99 299 99.67 합격 수 장학생
 */