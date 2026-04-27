package com.the703.basic010_ex;

//다음코드에서 오류나는 부분을 찾아 주석달고 이유를 적으시오.
// 클래스는 부품객체
// 클래스는 상태(멤버변수-인스턴스변수/ 클래스변수)와 행위(멤버함수-인스턴스메서드/ 클래스메서드)
class User002 {
	final String nation = "Korea";   // 인스턴스 변수
    final String jumin;   //인스턴스 변수
	String name;          //인스턴스 변수

	public User002() { jumin="00000"; }  //인스턴스 변수
	public User002(String jumin, String name) { //인스턴스 변수
	this.jumin = jumin;
	this.name = name;
		 }
    }

	public class FinalEx { //이미 지정되어 있음 //The type FinalEx is already defined
	   public static void main(String[] args) { // 클래스 변수
		 User002 user1 = new User002("123456-1234567", "아이유");
		 System.out.println(user1);   
		      
		 //user1.nation = "USA";      // The final field User002.nation cannot be assigned //수정X
		 //user1.jumin  = "123123-1234321";  // The final field User002.nation cannot be assigned //수정X
		 user1.name = "IU"; 
		 System.out.println(user1);   
		   }
     }

