package com.the703.basic010_ex;
//클래스는 부품객체이다
//클래스는 상태(멤버변수 : 인스턴스변수, 클래스 변수 -static)와 행위(멤버함수 : 인스턴스 메서드, 클래스 메서드 - static)
//////////////////////////////////////////////////////
/* [RUNTIME DATA AREA]
------------------------------------
[METHOD:정보]        Sawon3.class , MemberVarEx001.class  ##1
Sawon3.su=10;  Sawon3.basicpay2;   Sawon3.basicpay;  Sawon3.showSu()   Sawon3.showAll002()
------------------------------------
[HEAP:동적]                           |  [STACK:지역]

1번지{pay=10000, showAll001()}        ←   sola[1번지]    -  1) new   2) 생성자  3) 번지 - new에서 객체생성 후 사용가능
                                          main    ##2
------------------------------------
*/
//////////////////////////////////////////////////////
class Sawon3{ 
	//멤버변수
    int pay      = 10000;  // 인스턴스변수 - new     -  heap area   - 생성자 관련   - this
    static int su = 10; //클래스 변수     -static   - method area   - 공용       - 클래스명.su
    //static int basicpay = pay;  //클래스 변수 = 인스턴스 변수  => static은 인스턴스 변수(this) 사용 불가
                                //Cannot make a static reference to the non-static field pay   
    static int basicpay2;  //클래스 변수  -static   - method area   - 공용       - ㅡ클래스명.변수
    
    public static void showSu() {   System.out.println(su);  }   //클래스 메서드        
    //public static void showPay() {   System.out.println(this.pay);  }   //클래스 메서드
    //=> static은 인스턴스 변수(this) 사용 불가                       //Cannot use this in a static context
    //멤버함수
    public  void  showAll001() {   // 인스턴스 메서드 (static X)
       System.out.println(su);  
       System.out.println(this.pay);  // new 객체를 만들어서 사용
    } 
    public static  void  showAll002() {  // 클래스메서드  (static O)
        //showAll001(); // 인스턴스 메스드 - this 사용불가
        //Cannot make a static reference to the non-static method showAll001() from the type Sawon3   
        //System.out.println(this.pay);
                           //Cannot use this in a static context
    } 
} //  Sawon3 end
public class MemberVarEx001 {	
	public static void main(String[] args) {
		//public static void main(String[] args) { //동일한 main 중복사용으로 인해 오류//void is an invalid type for the variable main 
			                             //중복 사용 //Duplicate local variable args
		Sawon3   sola = new Sawon3();  
		sola.showAll001();
	} //42라인 끝
//} //43라인 끝
	
} //MemberVarEx001 end 
/*1. 인스턴스변수, 클래스변수, 지역변수 를 구분하시오.
2. 인스턴스메서드, 클래스메서드 구분하시오.
3. 오류나는 이유는? */