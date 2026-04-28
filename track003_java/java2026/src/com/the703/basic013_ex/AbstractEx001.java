package com.the703.basic013_ex;
/*
                 Object
                   ↑
                 Robot   {   abstract charge() , move() , speak() }
    ↑             ↑               ↑ 
CleaningRobot  SecurityRobot   CookingRobot   
{@charge() ,    {@charge() ,    {@charge() ,
@ move() ,       @move() ,       @move() , 
@ speak() }}     @speak() }}     @speak() }}
*/
abstract class Robot {
	String model;
	int battery;
	abstract void charge(); //충전방식
	abstract void move();   //이동방식
	abstract void speak();  //말하기 방식
} //end class
//class CleaningRobot extends Robot {
//	@Override void charge() { System.out.print("청소로봇 충전 중...배터리");  }
//	@Override void move()   { System.out.print("청소로봇: 청소 중");  }
//	@Override void speak()  { System.out.println("청소로봇: 먼지를 제거합니다!");  }	
//}
//class SecurityRobot extends Robot {
//	@Override void charge() { System.out.print("경비로봇 태양광 충전 중... 배터리");  }
//	@Override void move()   { System.out.print("경비로봇: 경비 중");   }
//	@Override void speak()  { System.out.println("경비로봇: 이상 없음. 안전 확보!");  }	
//}
//class CookingRobot extends Robot {
//	@Override void charge() { System.out.print("요리로봇 인덕션 충전 중... 배터리");  }
//	@Override void move()   { System.out.print("요리로봇: 요리 중");  }
//	@Override void speak()  { System.out.println("요리로봇: 오늘의 메뉴는 파스타입니다!!");  }	
//}
class CleaningRobot extends Robot {
	@Override void charge() { System.out.println(super.model + "\t청소로봇 충전 중...배터리" + super.battery + "%");  }
	@Override void move()   { System.out.println(super.model + "\t청소로봇: 청소 중");  }
	@Override void speak()  { System.out.println(super.model + "\t청소로봇: 먼지를 제거합니다!");  }	
}
class SecurityRobot extends Robot {
	@Override void charge() { System.out.println(super.model + "\t경비로봇 태양광 충전 중... 배터리" + super.battery + "%");  }
	@Override void move()   { System.out.println(super.model + "\t경비로봇: 경비 중");   }
	@Override void speak()  { System.out.println(super.model + "\t경비로봇: 이상 없음. 안전 확보!");  }	
}
class CookingRobot extends Robot {
	@Override void charge() { System.out.println(super.model + "\t요리로봇 인덕션 충전 중... 배터리" + super.battery + "%");  }
	@Override void move()   { System.out.println(super.model + "\t요리로봇: 요리 중");  }
	@Override void speak()  { System.out.println(super.model + "\t요리로봇: 오늘의 메뉴는 파스타입니다!!");  }	
}
public class AbstractEx001 {
	public static void main(String[] args) {
		//Robot robot  = new Robot();  // Q1.why? 오류이유?
		//1. abstract : 일반클래스 + 설계
		//Robot robot = new Robot(); // new 메모리 빌리고 객체생성, Animal 초기화 { } 구현부가 없음
//		Robot robot = null ;
//		robot = new CleaningRobot ();
//		robot.charge 
		System.out.println("\n--- 로봇 배열 시뮬레이션 ---");
		// 부모             자식
		Robot [] bots = { new CleaningRobot(), new SecurityRobot() , new CookingRobot() };
		int[] levels = { 50, 70, 95 };
		//bots[0] = 1번지 { @charge(), @move(), @speak() }-Robot { model , battery / ---,---,---}
		//bots[1] = 2번지 { @charge(), @move(), @speak() }-Robot { model , battery / ---,---,---}
		//bots[2] = 3번지 { @charge(), @move(), @speak() }-Robot { model , battery / ---,---,---}
		for(int i =0; i<bots.length; i++){
			bots[i].model = "Robo" + (i+1);
			bots[i].battery = levels[i];
			//System.out.print(bots[i].model + "\t" );
			bots[i].charge(); //System.out.println(bots[i].battery + "%");
			bots[i].speak();
		   } //end for
	}//end main

}//class AbstractEx001 end
/*
1) 상속도
Object
  ↑
 Robot {   abstract charge() , move() , speak() }
↑          ↑               ↑ 
CleaningRobot  SecurityRobot   CookingRobot   
{@charge() ,    {@charge() ,    {@charge() ,
@ move() ,     @move() ,           @move() , 
@ speak() }}         @speak() }}          @speak() }}

2)main
public class AbstractEx001 {
public static void main(String[] args) {
//Robot robot  = new Robot();  // Q1.why? 오류이유?
System.out.println("\n--- 로봇 배열 시뮬레이션 ---");
Robot [] bots = { new CleaningRobot(), new SecurityRobot() , new CookingRobot() };
int[] levels = { 50, 70, 95 };

}
}

출력화면 :  
--- 로봇 배열 시뮬레이션 ---
Robo1 청소로봇 충전 중... 배터리 50%
Robo1 청소로봇: 먼지를 제거합니다!
Robo2 경비로봇 태양광 충전 중... 배터리 70%
Robo2 경비로봇: 이상 없음. 안전 확보!
Robo3 요리로봇 인덕션 충전 중... 배터리 95%
Robo3 요리로봇: 오늘의 메뉴는 파스타입니다!   */