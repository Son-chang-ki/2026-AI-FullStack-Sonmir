- Todo1:  JS
- Todo2:  OBJECT

---

### ■1. 복습문제   

■ OOP
class A11 {
    int a; // (1) 
    A11() { } 
    A11(int a) { this.a = a; } // (2) 

    //(3) void show()
    void show() { 
        this.a = 11;     System.out.println(this.a); 
    } 
    //(4) static void classMethod()
    static void classMethod() { this.a = 12; }

    //(5) int showZ()
    int showZ() { 
        int a;  return a; 
    }
}

public class RepeatQ123 {
    public static void main(String []args) { 
        A11 a1 = new A11();    (b) 
    }
} // end class

Q1. 위의 문제에서 (1),(2),(3),(4),(5)를 [ 클래스변수, 인스턴스변수, 지역변수, 클래스메서드, 인스턴스메서드 ]에서 고르시오.

(1) 인스턴스변수 - heap area - new O - 생성자 - this 각각
(2) 생성자 안 
  A11(int a) { this.a = a; } 
               인스턴스변수 = 지역변수
(3) 인스턴스 메서드 - heap area - new O - 생성자 - this 각각
(4) 클래스메서드 - method area - new X- 생성자 x - 공용
(5) 인스턴스 메서드 - heap area - new O - 생성자 - this 각각

> 클래스는 부품객체
> 상태(속성/멤버변수)와         행위(기능/멤버함수)
 클래스변수, 인스턴스변수        클래스메서드, 인스턴스메서드


Q2. 클래스 A11에서 오류나는 곳을 수정하고 그 이유를 적으시오.
(4)   static에서 instance(this) 사용불가
(5)   지역변수는 수동 초기화 - int a=0; 

Q3. (b)번 위치에서
메모리 빌려오고, 객체 생성하는 역할 : (  new    )
String은 null, int는 0으로 초기화하는 역할 : (  A11()   )
new A11()한 주소를 갖고 있는 것은 : ( a1   )

Q4. 기본생성자를 반드시 선언해야하는 경우를 적으시오.
오버로딩(다른 생성자 생성 시) , 상속
```
    A11() { } 
    A11(int a) { this.a = a; } 
```

Q5. 다음 중 오버로딩이 성립하기 위한 조건이 아닌 것은? (모두 고르시오)
a. 메서드의 이름이 같아야 한다.   o
b. 매개변수의 개수나 타입이 달라야 한다. o
c. 리턴타입이 달라야 한다.  x
d. 매개변수의 이름이 달라야 한다.  x

c,d


Q6. 다형성이란? 
> 하나의 타입(부모)으로 여러타입(자식)을 관리
> 여러개의 형태를 띄는 성질

Q7. 다음코드에서 다음에 해당하는 부분을 작성하시오.
//7-1. 상속도 / 7-2. 각 클래스에서 사용할수 있는 멤버변수, 멤버함수

class Parent7  extends Object{
      int x = 100;
      public Parent7() { super(); }
      void method() { System.out.println("Parent Method"); }
} 
class Child7 extends Parent7 {
   int x = 200;
   public Child7() { super(); }
   @Override  void method() { System.out.println("Child Method"); }
} 
public class PolyEx002 {
   public static void main(String[] args) {
         Parent7 p = new Child7();     //부모  = 자식 (업캐스팅)
         // 7-3.    Parent7 p   보장하는 범위   
         // 7-4.    인스턴스화 했을때 사용가능한 범위  
         Child7 c = new Child7();  
         System.out.println("p.x = " + p.x);  // 7-5 출력되는 내용  
         p.method();  //7-6 출력되는 내용    
         System.out.println("c.x = " + c.x);   // 7-7  출력되는 내용 
         c.method();   //7-8. 출력되는 내용     
   }
}
/*      7-1         7-2
        Object   #3{                  }#4
          ↑
        Parent7  #2{ x=100 , method()}#5
          ↑
        Child7   #1{ x=200 , @method()}#6

        7-3  Parent7 p  (1번지)  => { x=100 , method()}
        7-4  new Child7() => 1번지{ x=200 , @method()} - { x=100 , method()}
        7-5. x=100
        7-6. Child Method
        7-7. x=200
        7-8. Child Method
*/
 
part1. 제어문-절차지향
part2. OOP  -객체지향 특징
2-1. 클래스 사용  ( 클래스 VS 객체)
2-2. 클래스 설정  ( static, final, public■캡슐화) 
2-3. 클래스 ■상속 ( 재활용 )
2-4. ■다형성(부모타입으로 자식타입들 관리)
2-5. ■추상화(공통적인 속성 뽑기)

 
---

### ■2. Todo1:  js
 


---

### ■3.   Todo2:  java  method
 
 

---

### ■4.  복습문제

다음 코드를 보고 질문에 답하시오.
Q1. OOP란 무엇인가?
Q2. OOP의 핵심 개념은 무엇인가?
Q3. 상속도를 그리시오.
Q4. 각 객체에서 사용할 수 있는 멤버변수와 메서드를 적으시오.
Q5. Parent p = new Child(); 실행 시 객체 생성, 초기화, 참조값을 설명하시오.
Q6. Parent 클래스의 멤버변수/메서드의 종류와 메모리 구조를 설명하시오.
Q7. 출력 결과를 쓰시오.
- p.x의 값은?  
- p.method() 실행 시 어떤 메서드가 호출되는가?  
- c.x의 값은?  
- c.method() 실행 시 어떤 메서드가 호출되는가?

Q8. @Override 키워드의 의미와 코드에서 오버라이딩된 부분을 설명하시오.
Q9. Child c = new Child(); 호출 시 생성자 호출 순서와 객체 생성 순서를 설명하시오.


 
class Parent {
    int x = 100;
    void method() { System.out.println("Parent method"); }
}

class Child extends Parent {
    int x = 200;
    void method() { System.out.println("Child method"); }
}

public class Repeat001_oop {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
    }
}


---


📝 문제: OOP 개념(2) — 캡슐화 / static / final
Q1. 캡슐화(Encapsulation)란 무엇이며, 위 코드에서 어떻게 구현되었는지 설명하시오.
Q2. 접근제어자의 범위를 넓은 것부터 좁은 것까지 순서대로 쓰시오.
Q3. static 키워드의 의미를 메모리 구조와 연결지어 설명하고, 위 코드에서 어떤 변수에 적용되었는지 쓰시오.
Q4. final 키워드의 의미를 설명하고, 위 코드에서 어떤 변수에 적용되었는지 쓰시오.
Q5. Account.accountCount의 값은 얼마인가? 왜 그렇게 되는지 설명하시오.
Q6. a1.id와 a2.id의 값은 각각 얼마인가?
Q7. 출력 결과를 쓰시오.
Q8. static 메서드와 인스턴스 메서드의 차이를 설명하시오.
Q9. final 키워드가 변수, 메서드, 클래스에 각각 적용될 때 의미를 설명하시오.
Q10. 캡슐화의 장점은 무엇인가?

```
class Account {
    private int balance;              
    public static int accountCount=0; 
    public final int id;              

	public Account(){this.id = ++accountCount;}
    public Account(int id, int balance) {
        this();
        this.balance = balance; 
    }

    // getter/setter
    public int getBalance() { return balance; }
    public void deposit(int amount) { balance += amount; }
    public void withdraw(int amount) { balance -= amount; }

    @Override
    public String toString() {
        return "Account [id=" + id + ", balance=" + balance + "]";
    }
}

public class Repeat002_oop {
    public static void main(String[] args) {
        Account a1 = new Account(1, 100);
        Account a2 = new Account(2, 200);

        a1.deposit(50);
        a2.withdraw(30);

        System.out.println(a1);  
        System.out.println(a2); 

        System.out.println("총 계좌 수 = " + Account.accountCount); 
        System.out.println("a1.id = " + a1.id); 
        System.out.println("a2.id = " + a2.id); 
    }
}
```



---

## 📝 문제: OOP 다형성

다음 코드를 보고 질문에 답하시오.

Q1. 상속도를 그리시오.
Q2. 상속도에서 각 객체에서 사용할 수 있는 멤버변수와 멤버함수를 적으시오.

```
class Papa{
	int money=10;

	public Papa() { super(); }
	public Papa(int money) { super(); this.money = money; }
	@Override public String toString() { return "Papa [money=" + money + "]"; }
}
class Son extends Papa{
	int money=150;
	int car=2;
	
	public Son() { super(); }
	public Son(int money) { super(money); }
	public Son(int money, int car) { super(); this.money = money; this.car = car; }
	@Override public String toString() { return "Son [money=" + money + ", car=" + car + "]"; }
}
```


public class Repeat002_oop {
	public static void main(String[] args) {
		// Q3. Papa p1 = new Papa(); 실행 시 메모리 구조와 출력 결과를 설명하시오.
		// System.out.println(p1);의 결과는 무엇인가?
		Papa p1 = new Papa();   
		System.out.println(p1); 
		
		// Q4. Son s2 = new Son(); 실행 시 메모리 구조와 출력 결과를 설명하시오.
		// System.out.println(s2);의 결과는 무엇인가?
		Son s2 = new Son();   
		System.out.println(s2);   
		
		// Q5.Son s3 = (Son) new Papa(); 실행 시 어떤 문제가 발생하는가?
		Son s3 = (Son) new Papa();  
		
		// Q6. Papa p4 = new Son(); 실행 시 메모리 구조와 출력 결과를 설명하시오.
		// System.out.println(p4);의 결과는 무엇인가?
		// System.out.println(p4.money);의 결과는 무엇인가?
		Papa p4 = new Son();                               
		System.out.println(p4); 
		System.out.println(p4.money); 

		// Q7. p4에서 Son의 moeny를 사용하는 방법은? 
		 
	}
}


Q8 오버로딩/오버라이딩이란?



---

📝 문제: OOP 개념(4) — 추상화 / 인터페이스
Q1. abstract란 무엇인가?  
Q2. interface란 무엇인가?  
Q3. abstract와 interface의 공통점과 차이점을 설명하시오.
Q4. 다음과 같이 출력되게 코드를 작성하시오.
1) 출력 화면:
사과는 빨갛다.
바나나는 노랗다.
코코넛은 코코하다.

2) 상속도:

코드
     Fruit
↑       ↑       ↑
Apple  Banana  Coconut

3) 주어진코드
abstract class Fruit {
    @Override public String toString() { return "Fruit"; }
    public abstract void myfruit();
}
public class Abstract005 {
    public static void main(String[] args) {
        Fruit[] fruits = { new Apple(), new Banana(), new Coconut() };
        for (Fruit f : fruits) {
            f.myfruit();
        }
    }
}



---



Q1.  다음코드를 확인하고 오류나는 부분을 체크하시오
Q2. interface의 멤버변수에 자동으로 붙는 속성은?
Q3. interface의 멤버함수에 자동으로 붙는 속성은?
Q4. ZooKeeper 클래스를 작성하시오. (조건: Animal의 sound()와 각 클래스의 고유 메서드를 모두 호출할 것)
 
조건:
- interface Animal { String Company="(주) Thejoa 703"; public void sound(); }
- Dog, Cat, Bird 클래스는 각각 Animal을 구현하고, 고유 메서드를 가진다.
- ZooKeeper 클래스의 show() 메서드에서 Animal의 sound()와 각 클래스의 고유 메서드를 호출한다.

1. 주어진조건
interface Animal {
   String Company="(주) Thejoa 703";  
   public void sound();
} 
class Dog implements Animal {
   @Override
   public void sound() {
      System.out.println("멍멍!");
   }
   public void playFetch() {
      System.out.println("강아지가 공을 물어옵니다.");
   }
}
class Cat implements Animal {
   @Override
   public void sound() {
      System.out.println("야옹~");
   }
   public void scratch() {
      System.out.println("고양이가 발톱을 세웁니다.");
   }
}
class Bird implements Animal {
   @Override
   public void sound() {
      System.out.println("짹짹!");
   }
   public void fly() {
      System.out.println("새가 하늘을 납니다.");
   }
}

2. 메인화면
public class Repeat005_oop {
   public static void main(String[] args) {
      java.util.Scanner sc = new java.util.Scanner(System.in);

      // Animal 배열에 미리 객체를 담아둠
      Animal[] animals = { new Dog(), new Cat(), new Bird() };

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

         if (choice < 1 || choice > animals.length) {
            System.out.println("잘못된 선택입니다.");
            continue;
         }

         // 배열에서 바로 꺼내오기
         Animal animal = animals[choice - 1];

         // ZooKeeper 클래스의 show() 메서드 호출
         ZooKeeper keeper = new ZooKeeper();
         keeper.show(animal);
         System.out.println();
      }
      sc.close();
   }
}

3. 실행화면
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
 

---



### ■4.  복습문제

