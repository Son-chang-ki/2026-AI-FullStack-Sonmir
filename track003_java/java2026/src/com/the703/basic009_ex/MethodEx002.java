package com.the703.basic009_ex;

public class MethodEx002 {

	public static void test1(int num) {  System.out.printf("%d\n", num );  }
	public static void test2(double num1) { System.out.printf("%.1f\n" , num1 ) ; }
	//public static void hap(int num2) { num2 = (3+4+5); 	System.out.printf("%d\n" , num2 ); }
	//public static void disp(char ch) {  ch = ('*' * 7);   System.out.println(ch); } 
	
	public static void hap(int st, int end) 
	  { int box =0; for(int i=st; i<=end; i++) { box+=i; }	System.out.println(box ); }
	
	public static void disp(int in, char ch)
	   { for(int i=0; i<in; i++) { System.out.print(ch); } }
	
	public static void main(String[] args) {
		test1(10);
		test2(1.2);
		hap(1,2); // (숫자, 숫자)
		disp(7,'*'); //

	}

}
/* 다음과 같이 test1(), test2(), hap(), disp()메서드를 정의하시오.

public static void main(String[] args) {
    // public static  리턴값 메서드명(파라미터)
    test1(10);    //10 출력
     test2(1.2);   // 1.2 출력
     hap(3,5);     // 3+4+5한값  12 출력
     disp(7, '*');  // *******출력
} */
