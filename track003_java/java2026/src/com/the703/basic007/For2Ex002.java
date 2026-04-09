package com.the703.basic007;

public class For2Ex002 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		// ver-1 있는 그대로 반복 
		System.out.println('@');  System.out.println('#');  System.out.println('#');  System.out.println('#'); System.out.println();
		System.out.println('#');  System.out.println('@');  System.out.println('#');  System.out.println('#'); System.out.println();
		System.out.println('#');  System.out.println('#');  System.out.println('@');  System.out.println('#'); System.out.println();
		System.out.println('#');  System.out.println('#');  System.out.println('#');  System.out.println('@'); System.out.println();
		
		// ver-2 칸 정리
		System.out.println();   // 4번 출력            -  첫번째 자리에 오면 @
		  for(int i=1; i<=4; i++)    {  System.out.print( i == 1 ?  '@' : '#');  }  System.out.print("\t");
		                        // 4번 출력            -  2번째 자리에 오면 @
		  for(int i=1; i<=4; i++)    {  System.out.print( i == 2 ?  '@' : '#');  }  System.out.print("\t");
                                // 4번 출력            -  3번째 자리에 오면 @		  
		  for(int i=1; i<=4; i++)    {  System.out.print( i == 3 ?  '@' : '#');  }  System.out.print("\t");
                                // 4번 출력            -  4번째 자리에 오면 @		
		  for(int i=1; i<=4; i++)    {  System.out.print( i == 4 ?  '@' : '#');  }  System.out.print("\t");
		
		// ver-3 층 정리
		  System.out.println();
		  
		  for (int ch=1; ch<=4; ch++)
		  {
			  for(int i=1; i<=4; i++)    {  System.out.print( i == ch ?  '@' : '#');  }  System.out.print("\t");
		  }

	}

}
/* (이중for 이용)
@###
#@##
##@#
###@
*/