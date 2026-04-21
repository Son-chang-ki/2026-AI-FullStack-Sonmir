package com.the703.basic010_ex;

//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수)와 행위(멤버함수)
//3. 생성자 - 초기화
class Coffee{
    //멤버변수 : 
	String name;  int num, price;
    //멤버함수 :  //커피정보출력
	void show(){
		System.out.println("====================");
		System.out.println("커피");
		System.out.println("커피명 : " + name);
		System.out.println("커피잔수 : " + num );
		System.out.println("커피가격 : " + (price*num));
		System.out.println("====================");
	}   
	@Override
	public String toString() {
		return "Coffee [name=" + name + ", num=" + num + ", price=" + price + "]";
	}
	public Coffee(String name, int num, int price) {
		super();
		this.name = name;
		this.num = num;
		this.price = price; 
	}
	public Coffee() { 
		super();
		this.name = "아메리카노";
		this.num = 1;
		this.price = 2000;
	}
}
public class ClassEx3 {

	public static void main(String[] args) {
		 Coffee a1 = new Coffee("까페라떼" , 2 , 4000);  		 a1.show();
		 Coffee a2 = new Coffee();                     		 a2.show();
	}

}
/*
class Coffee{
멤버변수 : String name;  int  price, num;
멤버함수 : void show(){}   //커피정보출력
}
public class Class003 {
 public static void main(String[] args) {
 Coffee a1 = new Coffee("까페라떼" ,2 , 4000);  a1.show();  // 1)new 객체생성 2) 초기화 "카페라떼", 2, 4000  3)주소
 Coffee a2 = new Coffee();                   a2.show();  // 1)new 객체생성 2) 초기화 "아메리카노", 1, 2000  3)주소
}
}
출력내용 :
=====커피
커피명 : 까페라떼
커피잔수 : 2 
커피가격 : 8000
=====커피
커피명 : 아메리카노
커피잔수 : 1
커피가격 : 2000   */
//////////////////////////////////////////////////////
/* [RUNTIME DATA AREA]
------------------------------------------------------
[METHOD:정보]   Coffee.class , ClassEx003.class   #1
------------------------------------------------------
[HEAP:동적]                                           |  [STACK:지역]
2번지:{name="아메리카노", num=1, price=2000, show() }      ←   a2(2번지)
1번지:{name="까페라떼", num=2, price=4000, show() }       ←   a1(1번지)
{name=null, num=0, price=0, show() }                    main  #2
------------------------------------------------------
//////////////////////////////////////////////////////
/// */
