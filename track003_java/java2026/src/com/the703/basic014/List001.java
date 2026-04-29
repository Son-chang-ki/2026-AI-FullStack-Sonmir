package com.the703.basic014;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;  //i : interface
import java.util.Vector;

public class List001 {
	public static void main(String[] args) {
		//step1. Array
		String [] arr = new String[3]; // 객수 지정되어 있음. 
		arr[0] = "헐크"; //arr[1] = 1;    // 같은 자료형만 사용 가능함
		System.out.println(Arrays.toString(arr) );
		
		//step2. 동적배열 - List 사용법
		// 부모는      자식   ==> 부모는 자식을 담을 수 있다
		List list = null; //ctrl + shift + o
		     list = new ArrayList();  //자식
		     list = new LinkedList(); //자식
		     list = new Vector();     //자식
		     
	    //step3. <> add, get, size, remove, contains
		List list2 = new ArrayList();
		list2.add("one");  // Object obj = "one"
		list2.add(1);      // Object obj = 1
		list2.add(3.14);
		System.out.println(list2);
		
		//
		List<String> list3 = new ArrayList<String>();
		list3.add("one");  // Object obj = "one"
//		list3.add(1);      // Object obj = 1
//		list3.add(3.14);
		System.out.println(list3);
		
		//step4. add(추가), get(가져오기), size(갯수), remove(삭제), contains
		List<String> list4 = new ArrayList<String>(); // 받는 쪽 고정 List<String>
		list4.add("apple");
		list4.add("banana");
		list4.add("coconut");
		list4.add("mango");
		
		System.out.println(list4);        //apple
		System.out.println(list4.get(0)); //apple
		System.out.println(list4.size()); //4
		System.out.println(list4.remove(0)); //apple
		System.out.println(list4.contains("mango")); //true
		System.out.println(list4);  //[banana, coconut, mango]

	}

}
/*
Collection Framework

1. 저장단위
 - 변수 < 배열 < 클래스 < 콜렉션프레임워크 < 파일 < DB
 
2. 콜렉션프레임워크
 - [배열]의 단점을 개선한 클래스, 객체(클래스)만 저정가능
 - 동적배열
 ※ 배열은 같은 타입만 묶어서 저장가능, 배열 생성시 크기를 지정해서 사용, 추후 변경이 불가능 
   String [] arr = new String[3]
3. 핵심 인터페이스
 1) List - 기차 (순서 O, 중복허용 O)
           add,  get,  size,  remove,  contains
 2) Set - 주머니 (순서 X, 중복허용 X)
    	   add,  get(X) 향상된 for/Iterator ,  size,  remove,  contains
 3) Map - 사전 - key, value 쌍으로 사용
           add(X) put,  get(key),  size,  remove,  contains







*/