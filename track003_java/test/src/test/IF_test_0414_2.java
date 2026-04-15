package test;

public class IF_test_0414_2 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		// {변화}  {  }   for(초기값 ; 조건문; 증감문)
		// ver1 있는 그대로
		   System.out.println('★');
		   System.out.print('★'); System.out.print('★'); System.out.println();
		   System.out.print('★'); System.out.print('★'); System.out.print('★');  System.out.println();
		   
		// ver2 층 정리 
		   System.out.println();
		   for(int a = 1; a <= 1; a++)     { System.out.print('★') ; }   System.out.println();
		   for(int a = 1; a <= 2; a++)     { System.out.print('★') ; }   System.out.println();
		   for(int a = 1; a <= 3; a++)     { System.out.print('★') ; }   System.out.println();
		    
		// ver3 칸 정리     
		System.out.println();
		for (int i = 1; i <= 3; i++) {
			for (int a = 1; a <= i; a++) {
				System.out.print('★');
			}
			System.out.println();
		}
	}

}
