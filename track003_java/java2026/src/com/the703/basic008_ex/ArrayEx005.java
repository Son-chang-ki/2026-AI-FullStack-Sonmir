package com.the703.basic008_ex;

public class ArrayEx005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] ch = { 'B' , 'a' , 'n' , 'a', 'n' , 'a'}; //갯수 6개 카운트 범위 0~5
		int count1 = 0, count2 = 0;
		//ver-0 'B'가 대문자라면 대문자 카운트, 소문자의 갯수 카운트
		//ver-1 if( 'B'가 대문자라면 ) { 대문자 카운트} else if (소문자라면)  { 소문자 카운트}
		//ver-2 if (ch[0] 대문자라면) { 대문자 카운트} else if (ch[0] 소문자라면)   { 소문자 카운트}
		//if (ch[0] >= 'A' && ch[0] <= 'Z') { count1++ ; } else if (ch[0] >= 'a' && ch[0] <= 'z')   { count2++ ;}
		//if (ch[1] >= 'A' && ch[1] <= 'Z') { count1++ ; } else if (ch[1] >= 'a' && ch[1] <= 'z')   { count2++ ;}
		
		       for (int i= 0; i<ch.length; i++   )
		           { if(ch[i] >= 'A' && ch[i] <= 'Z') { count1++ ; } 
		              else if (ch[i] >= 'a' && ch[i] <= 'z')   { count2++ ;}   
		              }
		System.out.println("대문자의 갯수카운트 : "+ count1);
		System.out.println("소문자의 갯수카운트 : "+ count2);
		
	}

}
/*
클래스명 :  ArrayEx005
1. 배열명 : ch
2. 값 넣기 : 'B' , 'a' , 'n' , 'a', 'n' , 'a'
3. ch 배열에서 대문자의 갯수카운트, 소문자의 갯수 카운트

*/