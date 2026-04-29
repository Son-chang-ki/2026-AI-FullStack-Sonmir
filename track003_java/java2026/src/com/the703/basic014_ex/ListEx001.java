package com.the703.basic014_ex;

import java.util.ArrayList;
import java.util.List;

//1. 동적배열 : 콜렉션프레임워크
//    List,  Set,  Map
//    List(기차) : 순서 (index)O, 중복 O
//    add, get, size, remove, contains
public class ListEx001 {

	public static void main(String[] args) {
		List<String> colors  = new ArrayList<>();
		colors.add("red");
		colors.add ("green");
		colors.add ("blue");  // colors.add ("blue"); 중복 가능함
		
		//ver-1
		System.out.println("colors 만들기");
		System.out.println(colors.get(0));
		System.out.println(colors.get(1));
		System.out.println(colors.get(2));
		
		//ver-2
		System.out.println("colors 만들기");
		for (int i=0; i<colors.size(); i++) {System.out.println(colors.get(i)); }
		
		//ver-3 향상된 for
		System.out.println("colors 만들기");
		for (String c : colors) { System.out.println(c); }
	}
}
/*
다음과 같이 코드를 작성하시오.
1. ArrayList이용해서 colors 만들기
2. red, green, blue 데이터 추가
3. 출력

red
green
blue
*/