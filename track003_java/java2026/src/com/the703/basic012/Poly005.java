package com.the703.basic012;
//1. 클래스는 부품객체
//2. 클래스는 상태와 행위
//1. 다형성
//   하나의 타입(부모)으로 여려타입의 객체(자식들)를 관리
/*    Object
 *      ↑
 *    Animal { String name; int age / show()}
      ↑    ↑
     Cat   Person
{ num, @show() }   {jumin, @show()}
 */
class Animal {
	String name; 	int age;
	void show() {System.out.println("Animal🐴🐯🦁🐷 "); } //이모지 삽입 은 윈도우 버튼과 . 버튼 동시에 
}
class Cat extends Animal { 
    String num;
    void show() { System.out.println("Cat😺 " + super.name + "/" + super.age); }
}
class Person extends Animal { 
    String jumin;
    void show() { System.out.println("Person😀 " + super.name + "/" + super.age); }
}

public class Poly005 {
	public static void main(String[] args) {
		// 하나의 타입(부모)으로 여려타입의 객체(자식들)를 관리
		Animal [] anis = { new Cat(), new Cat(), new Person(), new Person() };
		anis[0].show();  anis[1].show(); anis[2].show(); anis[3].show();

	}

}
