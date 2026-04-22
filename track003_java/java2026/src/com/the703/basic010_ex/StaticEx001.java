package com.the703.basic010_ex;

//클래스는 부품객체이다
//클래스는 상태(멤버변수 : 인스턴스변수, 클래스 변수 -static)와 행위(멤버함수 : 인스턴스 메서드, 클래스 메서드 - static)
class Area1 {
	//멤버변수
	//Area1.pi          (클래스 변수 - static)
	static double pi = 3.14159;
	//Area1.rect(10,5)  (클래스 메서드 - static)
	static double rect(int a, int b) { return a*b;}
	static double triangle(int c, int d) { return (c*d)/2.0 ;}
    }

public class StaticEx001 {
	public static void main(String[] args) {
		System.out.println("원의 면적    : " + 10 * 10 * Area1.pi);
		System.out.println("사각형의 면적 : " + Area1.rect(10, 5));
		System.out.println("삼각형의 면적 : " + Area1.triangle(10, 5));
	}
}
/*
※ pi값은 3.14159
 public class StaticEx001{
  public static void main(String[] args) {  
   System.out.println("원의 면적    : " + 10 * 10 * Area1.pi); //원의 면적    : 314.159
   System.out.println("사각형의 면적 : " + Area1.rect(10, 5));   // 사각형의 면적 : 50.0
                                       public static 리턴값 메서드명(재료) { 해야할 일 }
                                       public static 50.0 rect(10,5) {사각형의 면적};
                                       public static double rect(int a, int b)  { return a*b;}
   System.out.println("삼각형의 면적 : " + Area1.triangle(10, 5));  // 삼각형의 면적 : 25.0
                                       public static 25.0 triangle(10,5) {삼각형의 면적};
                                       public static double triangle(int c, int d) { return (c*d)/2.0 ;}
  }
} 
출력내용 : 
원의 면적    : 314.159
사각형의 면적 : 50.0
삼각형의 면적 : 25.0   */
