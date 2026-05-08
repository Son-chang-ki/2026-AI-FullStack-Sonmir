package com.the703.basic015;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream001 {
	public static void main(String[] args) {
		Integer [] arr = {1,2,3,4,5};  //배열
		List<Integer> list = Arrays.asList(arr);  //리스트
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		
		System.out.println();
		//1. Stream (흐름)
		Arrays.stream(arr); // Stream<Integer>
		list.stream();      // Stream<Integer>
		
		Stream<Integer> sarr = Arrays.stream(arr); // Stream<Integer>
		Stream<Integer> slist = list.stream();     // Stream<Integer>
		
		//2.처리
		// () -> { } 
		//void java.util.stream.Stream.forEach( Consumer<? super Integer> action )
		//sarr.forEach((t) -> { System.out.print(t); } );
		//sarr.forEach(  t ->  System.out.print(t) );  //ver-1 람다식
		sarr.forEach(        System.out::print );      //ver-2 참조형
		
		System.out.println();
		
		slist.forEach((t) -> { System.out.print(t); } );
		//slist.forEach(  t ->  System.out.print(t) );  //ver-1 람다식
		//slist.forEach(        System.out::print );      //ver-2 참조형

	}

}
/*
Stream - 데어터 종류에 상관없이 같은방식으로 처리








*/