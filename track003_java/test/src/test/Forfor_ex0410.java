package test;

public class Forfor_ex0410 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		// ver-1 보이는 그대로 출력
		//System.out.println(1 + "층");
		//System.out.print(1);   System.out.print(2);  System.out.print(3);  System.out.println(4);
		
		//System.out.println(2 + "층");
		//System.out.print(1);   System.out.print(2);  System.out.print(3);  System.out.println(4);
		
		//System.out.println(3 + "층");
		//System.out.print(1);   System.out.print(2);  System.out.print(3);  System.out.println(4);
		
		//System.out.println(4 + "층");
		//System.out.print(1);   System.out.print(2);  System.out.print(3);  System.out.println(4);
		
		// ver-2 칸 줄이기  for 정리 {영역}  {변수 } for( 시작; 종료; 변화)
		//System.out.println();
		//System.out.println(1 + "층");
		//for(int kan=1; kan<=4; kan++)  {System.out.print(kan +"\t");}   System.out.println();
		
		//System.out.println();
		//System.out.println(2 + "층");
		//for(int kan=1; kan<=4; kan++)  {System.out.print(kan +"\t");}   System.out.println();
		
		//System.out.println();
		//System.out.println(3 + "층");
		//for(int kan=1; kan<=4; kan++)  {System.out.print(kan +"\t");}   System.out.println();
		
		//System.out.println();
		//System.out.println(4 + "층");
		//for(int kan=1; kan<=4; kan++)  {System.out.print(kan +"\t");}   System.out.println();
		
		// ver-3 층 줄이기
		    for(int ch=1; ch<=4; ch++)    { /*  System.out.println(ch); */
		     for(int kan=1; kan<=4; kan++)  {System.out.print(kan +"\t");}   System.out.println(); }

	}

}
/*4. 이중 for 버전
다음과 같은 모양을 출력하는 프로그램을 작성하시오.
 
1234
1234
1234
1234  */