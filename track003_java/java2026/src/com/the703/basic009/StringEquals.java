package com.the703.basic009;

public class StringEquals {

	public static void main(String[] args) {
		String id = "abc";  // 기본값 X
		String id2 = "abc";  // 기본값 O
		String id3 = new String("abc");  //id, id2,id3 참조값 (주소값)
		
		System.out.println("1)"  + (id==id2) ) ;  //true
		System.out.println("2)"  + (id==id3) ) ;  //false
		
		System.out.println(System.identityHashCode(id)  );   // 1464642111
		System.out.println(System.identityHashCode(id2)  );  // 1464642111
		System.out.println(System.identityHashCode(id3)  );  // 105704967
		
		System.out.println("3)"  + (id.equals(id3)) ) ; 	// true
		// 문자열 비교는 equals 이용

	}

}
/*             heap      |           stack
                                  ←  id  [ 1464642111 ]       id = "abc"
 1464642111   ["abc"]             ←  id2 [ 1464642111 ]       id = "abc"
 105704967    ["abc"]             ←  id3 [ 105704967 ]   new 메모리를 빌리고  
*/                               
