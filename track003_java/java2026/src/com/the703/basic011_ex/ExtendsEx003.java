package com.the703.basic011_ex;
//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수:클래스변수(static), 인스턴스 변수)와 행위(멤버함수)
//3. static(공용), final(하지마), public(접근)
//4. 상속 - 부품객체 재사용 (extends, 오버로딩, 오버라이딩, 다형성)
/*
Object  #3  {         } #4
  ↑
 Papa   #2  { int brain / sing(이문세 - 붉은 노을)} ※ 생성자 : default, filed
  ↑
 Son   #1   { int money/ @Override sing(빅뱅 - 붉은 노을)} 
*/     
class Papa extends Object{ 
   int brain;
   void sing () { System.out.println("이문세 - 붉은 노을"); }
   
   public Papa() { super();  }  
   public Papa(int brain) { super(); this.brain = brain; } //Papa
}//end Papa
   
class Son extends Papa{
   int money;
   //오버라이딩 (상속시 자식에게 맞께 수정해서 사용)
   @Override void sing() { { System.out.println("빅뱅 - 붉은 노을");
   System.out.println("IQ > " + brain);
   System.out.println("Money > " + money );
   } 
 }
   //생성자 오버로딩
   public Son() { super();  }
   public Son(int brain) { super(brain);  }
   //public Son(int money) { this.money = money; } 바로위에 파라미터 int brain 자료형 같음
   public Son(int brain, int money) { super(brain); this.money = money; }
   
} 

public class ExtendsEx003 {
	public static void main(String[] args) {
		Son myson = new Son(148, 100);
		myson.sing();
	}
}
/*
 Son myson = new Son(148, 100); Papa(brain)   this.money = money; 
 
 
=======================================================
[method] ExtendsEx003.class    Papa.class          Son.class
=======================================================
[heap]                                                 [stack]
      #3. Object()     {                  }#4.         
[2번지]#2. Papa(148)    {bring=148 / sing  }#5.                                   
[1번지]#1. Son(148,100) {money=100 / @sing }#6.        ← myson[1번지]          
                                                        main
*/


