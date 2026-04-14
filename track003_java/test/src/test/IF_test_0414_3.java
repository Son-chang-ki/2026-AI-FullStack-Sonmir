package test;

public class IF_test_0414_3 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		int [] arr2 = {1,2,3}; // 값은 3 인덱스 범위 0~2

		//ver-1 있는 그대로 
		arr2[0] = 1;   arr2[1] = 2;   arr2[2] = 3;
		System.out.println(arr2[2]);
		
		// [같은타입]의 데이터 [연속된 공간에] 저장하는 자료구조
		// new 공간빌리기   int 형태의 자료형 몇개	
		
		double [] arr = {1.1  , 1.2  , 1.3  , 1.4  , 1.5};
		double [] arr1 = new double [5];
		//ver-1 있는 그대로 
		//arr[0] = 1.1; arr[1] = 1.2; arr[2] = 1.3;  arr[3] = 1.4;  arr[4] = 1.5;
		// ver-2
		//	int data = 0;
		//	arr2[0] = data;  /* 1.1 넣고 */  data+=0.1;   /* 0.1 증가 */
		double data = 1.1;
		  for (int i=0; i<arr1.length; i++)    {arr1[i] = data; data +=0.1; }
		  for (int i=0; i<arr1.length; i++)    {System.out.printf("%.1f\t", arr1[i] ); }

	}

}
/* 5. 1차원배열  다음에 해당하는 값에서 index를 이용하여 3을 출력해주세요!
		int   [] arr2         =    {1,2,3}; 

6. 1차원배열      new 연산자 이용해서 배열만들기
    1. 배열명 : arr     
    2. 값 넣기 : 1.1  , 1.2  , 1.3  , 1.4  , 1.5    
       for+length 이용해보기
    3. for + length 로 출력
*/