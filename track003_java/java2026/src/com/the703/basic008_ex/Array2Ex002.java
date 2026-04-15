package com.the703.basic008_ex;

public class Array2Ex002 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		int [][] arr = { {101, 102, 103}, {104, 105, 106} };
		int [][] arr1 =	new int [2][3];  // 층, 칸 지정해주기
		//ver1. 보이는 그대로
		//		int data=101;
		//		arr1[0][0]=data; data+=1;
		//		arr1[0][1]=data; data+=1;
		//		arr1[0][2]=data; data+=1;
		//		
		//		arr1[1][0]=data; data+=1;
		//		arr1[1][1]=data; data+=1;
		//		arr1[1][2]=data; data+=1;
		//		
		//		System.out.println(arr1[1][0]);
		// 칸 줄이기
		int data=101;
		//for(int kan=0; kan<3; kan++)    { arr1[0][kan]=data; data+=1;   }
		//for(int kan=0; kan<3; kan++)    { arr1[1][kan]=data; data+=1;   }
		for(int ch=0; ch<arr1.length; ch++)      // 아파트 층수
		   {  for(int kan=0; kan<3; kan++)       // 층의 칸수
		      { arr1[ch][kan]=data; data+=1;   }   
		   }
		
		for (int ch=0; ch<arr1.length; ch++  ) {  //1. 아파트.length  (층)
			for (int kan=0; kan<arr1[ch].length; kan++  ) { //2. 아파트[층].length  (칸)
				  System.out.print(arr1[ch][kan]+"\t");
			} // 각 층이 끝나고 해야할 일
			System.out.println();
		}
		//ver-4. length 이용
		// 배열명(아파트).length 층 / 배열명[0](층).length

	}

}
/* 배열을 이용하여 다음의 프로그램을 작성하시오.   
1. new 연산자 이용하여 다차원배열만들기
2. for + length 이용해서 대입   
3. for + length 이용해서 출력 
   101   102   103
   104    105    106   */