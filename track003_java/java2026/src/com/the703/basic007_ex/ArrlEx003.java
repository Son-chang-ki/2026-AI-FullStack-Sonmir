package com.the703.basic007_ex;

public class ArrlEx003 {

	public static void main(String[] args) {
		char [] ch = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		char [] ch1 = new char[10];
		int coun1 = 0, coun2 = 0 ;
		//3. for + length 대입
		// ver-1  ('a' ~ 'z' 사이 모음 갯수는?)  { 소문자 모음 카운트 }  else if ('A' ~ 'Z' 사이 모음 갯수는?)  { 대문자 모음 카운트 }  
		//arr2[0] = 0;   arr2[1] = 10;   arr2[2] = 20;
		// ver-2
		//	int data = 0;
		//	arr2[0] = data; data+=0.1;   arr2[1] = data; data+=10;   arr2[2] = data; data+=10;
		//if (ch[0] >= 'A' && ch[0] <= 'Z') { count1++ ; } else if (ch[0] >= 'a' && ch[0] <= 'z')   { count2++ ;}
		//if (ch[1] >= 'A' && ch[1] <= 'Z') { count1++ ; } else if (ch[1] >= 'a' && ch[1] <= 'z')   { count2++ ;}

	}

}
//new 이용하여 문자열 배열 ch 52
//대문자 A~Z, a~z for 이용해 ch 배열에 데이터 대입
//for 모음 갯수 구하기
//> 모음 : a, e, i, o, u, A, E, I, O, U
