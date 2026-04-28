package com.the703.basic013_ex;

import java.util.Scanner;

interface Animal { public void sound(); }
/*            Animal { sound() }         ← ZooKeeper { show(Animal a) }
       ↑			  ↑				↑
       Dog           Cat          Bird
   { @sound() }  { @sound() }  { @sound() }
   playFetch()     scratch()       fly()
*/
class Dog implements Animal {
   @Override public void sound() { System.out.println("멍멍!"); }
   public void playFetch() { System.out.println("강아지가 공을 물어옵니다."); }
}
class Cat implements Animal {
   @Override public void sound() { System.out.println("야옹~"); }
   public void scratch() { System.out.println("고양이가 발톱을 세웁니다."); }
}
class Bird implements Animal {
   @Override public void sound() { System.out.println("짹짹!"); }
   public void fly() { System.out.println("새가 하늘을 납니다."); }
}
class ZooKeeper {
	 public void show(Animal a) {  a.sound(); 
		 if (a instanceof Dog)       { ((Dog) a).playFetch();}
		 else if (a instanceof Cat)  { ((Cat) a).scratch();  }
		 else if (a instanceof Bird) { ((Bird) a).fly() ;    }
	 //if (지역변수 instanceof 클래스명(자식특징)) { ((자식 특징)변수).메서드명(파라미터) (); }
	 } 
}

public class InterfaceEx003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Animal [] animal = {new Dog(), new Cat(), new Bird() };
        ZooKeeper keeper = new ZooKeeper();
	    while (true) {
	         System.out.println("=== 동물원 메뉴판 ===");
	         System.out.println("1. 강아지");  //animal[0]
	         System.out.println("2. 고양이");
	         System.out.println("3. 새");
	         System.out.println("0. 종료");
	         System.out.print("선택: ");
	         int choice = sc.nextInt();

	         if (choice == 0) {
	            System.out.println("동물원 관람을 종료합니다.");
	            break;
	         }
            //ver-1
	        // Animal animal = null;
//	         switch (choice) {
//	            case 1: animal = new Dog(); break; // 부모 = 자식 (Dog, Cat,  Bird)
//	            case 2: animal = new Cat(); break; //업캐스팅
//	            case 3: animal = new Bird(); break; // 부모타입으로 메서드호출시 오버라이드된 최신 자식 메서드가 호출
//	            default: System.out.println("잘못된 선택입니다."); continue;
//	         }
	         // animal {sound}  = [1번지] {@sound(), playFetch()}--{-----}
	         // animal {sound}  = [2번지] {@sound(), scratch()  }--{-----}
	         // animal {sound}  = [3번지] {@sound(), fly()      }--{-----}
	         
	         //ver-2
	         if (choice >= 1 && choice <= animal.length) {
	        	 Animal a = animal[choice - 1]; // 배열에서 꺼내오기  menu[0]
	        	  // ZooKeeper 클래스의 show() 메서드 호출
			         
			     //void       show(Animal ani)  { }
			     //리턴값       메서드명(파라미터) { }     
			         keeper.show(a);
		         } else {
		            System.out.println("잘못된 선택입니다.");
		         }
	      
	         System.out.println();
	      }
	      sc.close();
	}
}

/*
1. ZooKeeper 클래스를 작성하시오.  
2. 주어진조건
interface Animal { public void sound(); }
class Dog implements Animal {
   @Override public void sound() { System.out.println("멍멍!"); }
   public void playFetch() { System.out.println("강아지가 공을 물어옵니다."); }
}
class Cat implements Animal {
   @Override public void sound() { System.out.println("야옹~"); }
   public void scratch() { System.out.println("고양이가 발톱을 세웁니다."); }
}
class Bird implements Animal {
   @Override public void sound() { System.out.println("짹짹!"); }
   public void fly() { System.out.println("새가 하늘을 납니다."); }
}

3. 메인화면
public class InterfaceEx003 {
   public static void main(String[] args) {
      java.util.Scanner sc = new java.util.Scanner(System.in);

      while (true) {
         System.out.println("=== 동물원 메뉴판 ===");
         System.out.println("1. 강아지");
         System.out.println("2. 고양이");
         System.out.println("3. 새");
         System.out.println("0. 종료");
         System.out.print("선택: ");
         int choice = sc.nextInt();

         if (choice == 0) {
            System.out.println("동물원 관람을 종료합니다.");
            break;
         }

         Animal animal = null;
         switch (choice) {
            case 1: animal = new Dog(); break;
            case 2: animal = new Cat(); break;
            case 3: animal = new Bird(); break;
            default: System.out.println("잘못된 선택입니다."); continue;
         }

         // ZooKeeper 클래스의 show() 메서드 호출
         ZooKeeper keeper = new ZooKeeper();
         keeper.show(animal);
         System.out.println();
      }
      sc.close();
   }
}

4. 실행화면
=== 동물원 메뉴판 ===
1. 강아지
2. 고양이
3. 새
0. 종료
선택: 1
멍멍!
강아지가 공을 물어옵니다.

선택: 2
야옹~
고양이가 발톱을 세웁니다.

선택: 3
짹짹!
새가 하늘을 납니다.

선택: 0
동물원 관람을 종료합니다.
*/