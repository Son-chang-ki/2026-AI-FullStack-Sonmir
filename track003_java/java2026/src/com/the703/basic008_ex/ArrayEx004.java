package com.the703.basic008_ex;

public class ArrayEx004 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		char [] ch = { 'B' , 'a' , 'n' , 'a', 'n' , 'a' } ;  // 값 6 메모리 값 0~5
		int count =0;
		//		System.out.print(ch[1] + "\t");
		//		System.out.print(ch[3]+ "\t" );
		//		System.out.print(ch[5]+ "\t" );   
		
		// ver-0 'B'가 소문자 'a'라면 카운드
		
		// ver-1 ch[0] 소문자 'a'라면 카운드
		
		// ver-2 if (ch[0] 소문자 'a'라면) { 카운드 }
//		         //if (ch[0] == 'a') { count++;}
//		         / if (ch[1] == 'a') { count++;}
//		          if (ch[2] == 'a') { count++;}
//		          if (ch[3] == 'a') { count++;} 
//		          if (ch[4] == 'a') { count++;} 
//		          if (ch[5] == 'a') { count++;} 	 
		         for (int i=0; i<ch.length; i++)
		          {      if (ch[i] == 'a') { count++;} 	}
		         System.out.printf("a의 갯수 : %d", count);
		     
//		     if (ch[0] == 'a') { System.out.printf("%s\t", count = count + ch[0]); }
//		     else if (ch[1] == 'a') { System.out.printf("%s\t", count = count + ch[1]); }
//		     else if (ch[2] == 'a') { System.out.printf("%s\t", count = count + ch[2]); }
//		     else if (ch[3] == 'a') { System.out.printf("%s\t", count = count + ch[3]); }
//		     else if (ch[4] == 'a') { System.out.printf("%s\t", count = count + ch[4]); }
//		     else if (ch[5] == 'a') { System.out.printf("%s\t", count = count + ch[5]); }

	}

}
/*
1. 배열명 : ch
2. 값 넣기 : 'B' , 'a' , 'n' , 'a', 'n' , 'a'
3. ch 배열에서 a의 갯수 세기
4. 출력된화면 :  a의 갯수 3    
*/