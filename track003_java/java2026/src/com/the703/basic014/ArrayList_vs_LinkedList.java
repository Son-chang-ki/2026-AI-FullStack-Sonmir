package com.the703.basic014;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_vs_LinkedList {
	public static void main(String[] args) {
		//Q. ArrayList vs LinkedList 차이점을 설명   ★기업 면접시 주로 질문하는 예.. 중요..
		// ArrayList : 배열기반(순번)으로 동작, 검색속도 빠름, 삽입/삭제 느림
		// LinkedList : 노드기반 연결 구조(주소-값), 삽입/삭제시 빠름, 검색시 느림
		
		int size = 10000;
		
		//1. ArrayList 테스트
		List<Integer> arrayList = new ArrayList<>();
		long start = System.currentTimeMillis();   //###
		for ( int i =0; i<size; i++ ) { arrayList.add(i); }
		long end = System.currentTimeMillis();   //###
		System.out.println("1. ArrayList 삽입시간 : " + (end-start) + "ms");  //ArrayList 삽입시간 : 65ms
		
		//2. LinkedList 테스트
		List<Integer> linkedList = new LinkedList<>();
	    start = System.currentTimeMillis();   //###
	    ///////////////////////////////////////////////////////////
		for ( int i =0; i<size; i++ ) { linkedList.add(i); }
		///////////////////////////////////////////////////////////
		end = System.currentTimeMillis();   //###
		System.out.println("2. LinkedList 삽입시간 : " + (end-start) + "ms"); // LinkedList 삽입시간 : 169ms
		
		//3. 중간삽입 테스트
		
		start = System.currentTimeMillis();   //###
		for ( int i =0; i<size; i++ ) { arrayList.add(size/2, i); }  // 삽입되는 위치, 값
		end = System.currentTimeMillis();   //###
		System.out.println("3. ArrayList 삽입시간 : " + (end-start) + "ms");
		
		start = System.currentTimeMillis();   //###
	    ///////////////////////////////////////////////////////////
		for ( int i =0; i<size; i++ ) { linkedList.add(size/2, i); }
		///////////////////////////////////////////////////////////
		end = System.currentTimeMillis();   //###
		System.out.println("4. LinkedList 삽입시간 : " + (end-start) + "ms");
		
	}
}
/*
int size = 10000;
1. ArrayList 삽입시간 : 2ms
2. LinkedList 삽입시간 : 9ms
3. ArrayList 삽입시간 : 27ms
4. LinkedList 삽입시간 : 105ms
*/