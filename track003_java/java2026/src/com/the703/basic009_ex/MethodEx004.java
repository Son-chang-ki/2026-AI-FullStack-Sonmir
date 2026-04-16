package com.the703.basic009_ex;

import java.util.Scanner;

public class MethodEx004 {

	//public static int process_total(int kor, int eng, int math) { return (kor, eng, math); }
	public static int process_total(int kor , int eng, int math) { return kor + eng + math ; }
	public static float process_avg(float total) { return (float) total/3f ; }
	public static String process_pass(float avg, int kor, int eng, int math) {
		if (avg >= 60 && kor > 40 && eng > 40 && math > 40) { return  "합격"; }
		else {	return "불합격/재시험";  }
	  }
	public static String process_scholar(float avg )  { 
		if (avg >= 95) { return "장학생";}    else {return "---"; } }
	
	
	public static String process_show 
	     (String name, int kor, int eng, int math, int total, float avg, String pass, String jang, String star)
	     { return show;
		
	     }
	public static void main(String[] args) {
	//(1)  변수
	String name  = ""; 
	int kor, eng, math, total ;
	float avg = 0.0f; 
	String pass = "";
	String jang = "";
	String star= "";  
	Scanner scanner = new Scanner(System.in);
	
	//(2) 입력 : 이름, 국어, 영어, 수학점수를 입력받으시오.
	System.out.println("이름을 입력하시오. > " );
	name = scanner.next();
	System.out.println("국어점수를 입력하시오. > " );
	kor = scanner.nextInt();
	System.out.println("영어점수를 입력하시오. > " );
	eng = scanner.nextInt();
	System.out.println("수학점수를 입력하시오. > " );
	math = scanner.nextInt();
	
	//(3) 처리 // public static 리턴값 메서드명(파라미터) { 해야할일 }
	total = process_total(kor , eng, math);    // 1. 총점처리
	// public static int process_total(int kor , int eng, int math) { return kor + eng + math ; }
	avg = process_avg(total);    //2.  평균처리
	// public static int process_avg(int total) { return (float) total/3f; }
    //3.  합격  평균이60이상이고, 각각 국어, 영어, 수학40이상/불합격/재시험-각각 40미만인게 있다면  
	pass = process_pass(avg , kor, eng, math);  
	// 4. 평균이 95점이상이면 장학생
	jang = process_scholar(  avg  ); 
	// public static String process_scholar(float avg) { 
	//   if (avg >= 95) { return jang ;}   else  {return "---" }  ;}
    // 5. 평균점수대로 별표 붙이기 , 예) 70점대이면 별7개, 80점대이면 별8개, 90점대이면 별9개 , 100점이면 별10개 
//		star = process_star(avg);  
	// public static string process_star(float avg) 
	//  { if (int a
	//    }
//		/////////////////////(4) 출력
		process_show(name, kor, eng, math, total, avg, pass, jang, star);
	   // public static string process_show
	   //  (String name, int kor, int eng, int math, int total, float avg, String pass, String jang, String star) 
	   //  { return show; }


	}

}
/* public static void main(String[] args) {
/////////////////////(1)  변수
String name  = ""; 
int kor, eng, math, total ;
float avg = 0.0f; 
String pass = "";
String jang = "";
String star= "";  
Scanner scanner = new Scanner(System.in);
/////////////////////(2) 입력 : 이름, 국어, 영어, 수학점수를 입력받으시오.
/////////////////////(3) 처리 : 
total = process_total(kor , eng, math);    // 1. 총점처리
avg = process_avg(total);    //2.  평균처리
////////3.  합격  평균이60이상이고, 각각 국어, 영어, 수학40이상/불합격/재시험-각각 40미만인게 있다면  
pass = process_pass(avg , kor, eng, math);  
//////// 4. 평균이 95점이상이면 장학생
jang = process_scholar(  avg  ); 
//////// 5. 평균점수대로 별표 붙이기 , 예) 70점대이면 별7개, 80점대이면 별8개, 90점대이면 별9개 , 100점이면 별10개 
star = process_star(avg);  
/////////////////////(4) 출력
process_show(name, kor, eng, math, total, avg, pass, jang, star);

}// end main

}// end class

::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: 
이름      국어   영어   수학   총점  평균    합격여부   장학생   랭킹
--------------------------------------------------------------------------------------------
아이언맨   100   100   100   300    100.0    합격      장학생   **********
--------------------------------------------------------------------------------------------
*/