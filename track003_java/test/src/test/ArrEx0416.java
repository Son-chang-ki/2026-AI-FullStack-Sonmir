package test;

public class ArrEx0416 {

	public static void main(String[] args) {
		// 암기할 것!!

		int [][] arr = { {101, 102, 103}, {104,   105,   106} };
		int [][] arr1 = new int[2][3];
		
		// 층, 칸 줄이기 for
		int data = 101;
		for(int ch=0; ch<arr1.length; ch++) {
			for (int kan=0; kan<arr1[ch].length; kan++)
			     { arr1[ch][kan] = data ;   data+=1; }
		   }
		// 출력 처리
		for (int ch1 = 0; ch1 < arr1.length; ch1++) {
			for (int kan = 0; kan < arr1[ch1].length; kan++) {
				System.out.print(arr1[ch1][kan] + "\t");
			}
			System.out.println();
		} 	

    }
	
}

/* 
1. new 연산자 이용하여 다차원배열만들기
2. for + length 이용해서 대입   
3. for + length 이용해서 출력 
   101   102   103
   104   105   106  */