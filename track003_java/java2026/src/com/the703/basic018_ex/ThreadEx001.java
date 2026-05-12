package com.the703.basic018_ex;

import javax.swing.JOptionPane;

class QuestionCount extends Thread { //1. extends Thread 상속받기
	@Override public void run() { //2. @Override  run() 생성하기
		
		//try { Thread.sleep(10); } catch (InterruptedException e) {  e.printStackTrace(); } 
		for (int i = 10; i>0; i--) {
			   System.out.println(i);
			   try { Thread.sleep(1000); } // 1초 쓰기
			   catch (InterruptedException e) {  e.printStackTrace(); }
	}
  }
}
public class ThreadEx001 {
	public static void main(String[] args) {
		Thread count = new QuestionCount(); count.start(); //3. start() 로 카운트 시작하기
		
		String answer = JOptionPane.showInputDialog(" 사과알파벳을 입력하세요.");
		System.out.println(answer.toLowerCase().equals("apple") ? "정답입니다 " : "정답이 아닙니다.");
		//                         다 소문자로         apple 맞아?
	}
}
/*
1.  QuestionCount  - 10부터 1까지 
      카운트 1초에 10 ,
                2초에 9, 
                3초에  8.....

2. 사과알파벳을 입력하세요.
   사과를 입력을받으면 정답입니다 / 정답이 아닙니다.

*/