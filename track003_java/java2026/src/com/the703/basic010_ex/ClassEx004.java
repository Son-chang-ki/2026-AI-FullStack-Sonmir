package com.the703.basic010_ex;

import java.util.Scanner;
//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수)와 행위(멤버함수)
//3. 생성자 - 초기화
class TV{//멤버변수_특징
	String channel; int volume; 
	// 멤버함수      채널, 볼륨 입력:
	void input() {// channel입력> youtube     // volume 입력> 10
		  Scanner scanner = new Scanner(System.in);
	      System.out.println("channel입력> "  );
	      channel = scanner.next();
	      System.out.println("volume 입력> " );
	      volume = scanner.nextInt();
	     }
	 // 출력 : //	 출력내용 :    //	JDBC   8
	 void show() {
		 System.out.println("출력내용 :");
		 System.out.println(channel +"\t" + volume);
	     }
	 public TV(String channel, int volume) {
		super();
		this.channel = channel;
		this.volume = volume;
	    }
	 public TV() {
		super();
		// TODO Auto-generated constructor stub
	    }
	 @Override
	 public String toString() {
		return "TV [channel=" + channel + ", volume=" + volume + "]";
	 }
}
public class ClassEx004 {

	public static void main(String[] args) {
		 TV  t1 = new TV("JDBC" , 8);
		 t1.show(); 
		 TV  t2 = new TV();
		 t2.input();  
		 t2.show();
	}
}
/* class TV{
//상태-멤버변수  : 채널/볼륨 String channel; int volume;   
//행위-멤버함수  : 채널, 볼륨 입력: input() / 출력 : show()
}
public class ClassEx004 {
  public static void main(String[] args) {
 TV  t1 = new TV("JDBC" , 8);
 t1.show(); 
 TV  t2 = new TV();
 t2.input();  
 t2.show();
 }
}
출력내용 :
JDBC   8

* channel입력>youtube
* volume 입력>10
youtube   10
*/