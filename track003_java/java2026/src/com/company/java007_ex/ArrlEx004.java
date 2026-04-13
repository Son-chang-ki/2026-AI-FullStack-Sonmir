package com.company.java007_ex;

public class ArrlEx004 {

	public static void main(String[] args) {
		// [같은타입]의 데이터 [연속된 공간에] 저장하는 자료구조
		// new 공간빌리기   int 형태의 자료형 몇개
		char [] ch = {'B', 'a', 'n', 'a', 'n', 'a'};
		char [] ch1 = new char[6];
		
		//3. for + length 대입
		// ver-1   
		     ch1 [0] = 'b';
		     ch1 [1] = 'A';
		     ch1 [2] = 'N';
		     ch1 [3] = 'A';
		     ch1 [4] = 'N'; 
		     ch1 [5] = 'A';
		// ver-2
		//	int data = 'B';
		//	ch1 [0] = data; data='b';   ch1[1] = data; data='A';   ch1[2] = data; data='N';  ch1[3] = data; data='A'; 
		//  ch1 [4] = data; data='N';   ch1[5] = data; data='A'; 
		if (ch[0] != 'B' ) { System.out.println(ch[0]) ; } 
		else if (ch[1] != 'a' )   { System.out.println(ch[1]) ; }
		

	}

}


//ArrlEx004
//대소문자 바꿔 출력
//char [ ] ch = {'B', 'a', 'n', 'a', 'n', 'a'};  