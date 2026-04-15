package com.the703.basic008_ex;

import java.util.Arrays;

public class Array2Ex001 {

	public static void main(String[] args) {
		// 
		int[][] arr2={{100,200,300},{400,500,600}};

		//ver1. 보이는 그대로
		arr2[0][0] = 100;  		arr2[0][1] = 200;    		arr2[0][2] = 300;
		arr2[1][0] = 400;       arr2[1][1] = 500;    		arr2[1][2] = 600;
		System.out.print(arr2[0][0] + "\t");
		System.out.print(arr2[0][1] + "\t");
		System.out.print(arr2[0][2] + "\t"); System.out.println();    
		// 칸 줄이기
		   for(int kan=0; kan<=2; kan++)    {   System.out.print(arr2[0][kan] + "\t");  }
		   for(int kan=0; kan<=2; kan++)    {   System.out.print(arr2[1][kan] + "\t");  }
		
		System.out.println();    
		System.out.println(); 
	     // 층 줄이기
		  for (int ch=0; ch<2; ch++)     
		  { for(int kan=0; kan<=2; kan++)    
		    {   System.out.print(arr2[ch][kan] + "\t");  }  }
		  
		System.out.println();    
		System.out.println(); 
		
		
		//ver-4. length 이용
		// 배열명(아파트).length 층 / 배열명[0](층).length
			for (int ch = 0; ch < arr2.length; ch++) // 아파트 층수  // 1. 배열의 갯수(층)
			{
				for (int kan = 0; kan < arr2[ch].length; kan++) // 층의 칸수 // 2. 배열의 갯수(층)의 칸수 - arr2[0].length
					{
						System.out.print(arr2[ch][kan] + "\t");
					} //3. 각 층이 끝나고 해야 할 일
					System.out.println();
				}
		 
	}

}
/*  배열을 이용하여 다음의 프로그램을 작성하시오.   
   int[][] arr2={{100,200,300},{400,500,600}};
   이중for+ length 이용해서 출력하기
*/
