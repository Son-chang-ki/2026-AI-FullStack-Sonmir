package com.the703.basic010_ex;
//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수)와 행위(멤버함수)
//3. 설계도 => 부품객체 => 사용
import java.util.Scanner;

class MyPrice001{
	//멤버변수
	String name;  	int price;
	//멤버함수
	//1)모든 클래스는 생성자 - 컴파일러가 기본생성자를 자동생성  MyPrice001()
	void input() {//입력받는 기능  Scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("상품이름 입력 > ");
		name = scanner.next();
		System.out.println("상품가격 입력 > ");
		price = scanner.nextInt();
	}
	void show() { //출력해주는 기능    
		// System.out.println("상품이름 : \t" + name);
		// System.out.println("상품가격 : \t" + price);
		 System.out.printf("상품정보입니다\n" + " 상품이름 : %s  / 상품가격 : %d " , name, price);
	}
}
public class ClassEx002 {

	public static void main(String[] args) {
		MyPrice001   p1 = new MyPrice001();
		//1) new 객체생성   2) MyPrice001()   name==null, price=0  초기화  3) p1  1번지
	      p1.input();   // 1번지.input()
	      p1.show();    // 1번지.show()	
	}
}
//////////////////////////////////////////////////////
/* [RUNTIME DATA AREA]
------------------------------------------------------
[METHOD:정보]     MyPrice001.class , ClassEx002.class   #1
------------------------------------------------------
[HEAP:동적]                                   |  [STACK:지역]

1번지: MyPrice001 
{name=null, price=0, input(), show() }       ←   p1(1번지)
                                                 main  #2
------------------------------------------------------
//////////////////////////////////////////////////////
/* class MyPrice001{
멤버변수 : String name;  int price;
멤버함수 : void input()  입력받는 기능 / void show()  출력해주는 기능
}
public class ClassEx002{
 public static void main(String[] args) {
      MyPrice001   p1 = new MyPrice001();
      p1.input();
      p1.show();
 }
}
출력내용 : 
상품이름 입력 >  apple
상품가격 입력 >  1500

상품정보입니다
상품이름 : apple  / 상품가격 : 1500   */