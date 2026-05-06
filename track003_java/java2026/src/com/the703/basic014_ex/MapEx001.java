package com.the703.basic014_ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx001 {

	public static void main(String[] args) {
		Map<String, String> maps = new HashMap<>();
		maps.put("피구왕", "통키");
		maps.put("제빵왕", "김탁구");
		maps.put("요리왕", "비룡");
	    // System.out.println("==============================\r\n" 
		//                +   "  KING"  "NAME\r\n"	 
		//                +  "==============================");
		
		System.out.println("==============================" );
		System.out.println("KING" + "\t"    +  "NAME");		 
		System.out.println("==============================");
		for (String king : maps.keySet()) {
			System.out.println(king + "\t" + maps.get(king) + "\n" + "---------------------");
		}
		
		Scanner scanner = new Scanner(System.in);
		String king = "";
		
		System.out.println("KING의 정보를 제공중입니다\n 이름을 입력하세요> ");
		king = scanner.next();
		
		System.out.println(maps.containsKey(king) ? "ㅁ" + king + ":\t" + maps.get(king) : "찾으시는 왕이 없어요...");
		// 만약 key가 있다면... key를 주면 value 값을 줄께....
		//if (maps.containsKey(king)) { System.out.println(maps.get(king));   };
	}
}
/*
1. MAP 만들기
KEY   VALUE
피구왕   통키
---------------------
제빵왕   김탁구
---------------------
요리왕   비룡

Map<String, String> map = new HashMap<>();

2 다음과 같이 문제풀기
2-1. 다음과 같이 출력
2-2. 사용자에게 KING의 이름을 입력받아 해당하는 값 출력
==============================
KING   NAME
==============================
피구왕   통키
---------------------
제빵왕   김탁구
---------------------
요리왕   비룡
---------------------
KING의 정보를 제공중입니다
이름을 입력하세요> 제빵왕

ㅁ제빵왕 : 김탁구 
*/