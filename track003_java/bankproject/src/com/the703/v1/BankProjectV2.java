package com.the703.v1;

import java.util.Scanner;

public class BankProjectV2 {

	public static void main(String[] args) {
		// 변수 
		int menu = -1, id = -1, pass = -1, balance = -1 ;
		Scanner scanner = new Scanner(System.in);
		
		// 입력 처리 출력
		// for (  ; menu !=9;     ) {
		while (menu != 9) {
			System.out.println(id + "\t" + pass + "\t" + balance);  // 계좌 1명분 확인용
			System.out.print("\n\n 🌟💰 WELCOME TO BANK SYSTEM 💰🌟 \r\n"
					+ " [1] ➕ 계좌 추가 [2] 🔍 계좌 조회  [3] 💵 입금하기 [4] 💸 출금하기  [5] 🗑️ 계좌 삭제 [9] 종료 \r\n" 
					+ " 👉 번호를 선택하세요: ");
			
			menu = scanner.nextInt();
			
			if (menu == 9) {   
				System.out.println("프로그램을 종료합니다.\n");
			}  else if ( menu == 1 ) {
				// 변수 X
				// 입력
				System.out.println(" ID 입력 > " );  id = scanner.nextInt();
				System.out.println(" PASS 입력 > " );  pass = scanner.nextInt();
				System.out.println(" 잔액 입력 > " );  balance = scanner.nextInt();
				// 처리 X 출력 X
			}  else if ( menu >= 2 && menu <= 5) {
				// 2-1. 사용자가 맞는지 여부
				int tid = 0, tpass = 0;
				System.out.println(" ID 입력 > " );  tid = scanner.nextInt();
				System.out.println(" PASS 입력 > " );  tpass = scanner.nextInt();
				// if ( !(id == tid && pass != tpass)) { continue; }
				if(  id != tid || pass != tpass) { continue;} // 아이디가 다르거나 비번이 다르다면 continue
				
				//2-2. 조회면 조회기능, 입력이면 사용자에게 입력받아서 입금, 출금이면 출금금액받아서 출금, 계좌삭제하려면 y, n 입력 받아서 계좌삭제
				switch (menu) {
				  case 2 : System.out.printf(" ID : %d\n PASS : %d\n BALANCE : %d\n" , id, pass, balance ); break;
				  case 3 : System.out.print(" 입금할 금액 > "  ); balance += scanner.nextInt();         break;
				  case 4 : System.out.print(" 출금할 금액 >"   ); int tbalance = scanner.nextInt(); 
				           System.out.println( tbalance > balance ? " 잔액부족!! 출금불가 " : "출금완료!! 현재잔액 : " 
				                                                                 + (balance -= tbalance));  break;
				  case 5 : System.out.println(" 계좌삭제 (Y/N) > "  ); char again = scanner.next().charAt(0);
				        if (again == 'Y' || again == 'y') { id = -1; pass = -1; balance = -1; } 		  break;
				}
			}
		} // end while
	}

}

/*
 * ver-1 
  - 조건문 : if, swich
  - 반복문 : for(시작; 종료; 변화), while (조건), do while (한번은 무조건 실행, 맨끝에 조건)

//무한반복으로 (종료 9) {
/   0. 메뉴판 입력

//🌟💰 WELCOME TO BANK SYSTEM 💰🌟

[1] ➕ 계좌 추가
[2] 🔍 계좌 조회
[3] 💵 입금하기
[4] 💸 출금하기
[5] 🗑️ 계좌 삭제  

👉 번호를 선택하세요:
    1. [9] 종료
    2. [1] + 계좌 추가
    3. [2~5]
    	2-1. 사용자가 맞는지 여부
    	2-2. 조회면 조회기능, 입력이면 사용자에게 입력받아서 입금, 출금이면 출금금액받아서 출금, 계좌삭제하려면 y, n 입력 받아서 계좌삭제
    
}

 while (menu !=9) {//나오면 종료
  0. 메뉴판 입력
//🌟💰 WELCOME TO BANK SYSTEM 💰🌟

[1] ➕ 계좌 추가
[2] 🔍 계좌 조회
[3] 💵 입금하기
[4] 💸 출금하기
[5] 🗑️ 계좌 삭제  

👉 번호를 선택하세요:
    if (menu !=9) { [9] 종료문구 }
    else if (menu ==1) { [1] + 계좌 추가 }
    else { 2. [2~5] 메뉴
    	2-1. 사용자가 맞는지 여부
    	임시 아이디입력받기>
    	임시 비밀번호 입력 받기 >
    	저장되어 있는 아이디와 임시 아이디가 같고 저장되어 있는 비번과 임시비번이 같으면 아래 내용 처리
    	2-2. 조회면 조회기능, 입력이면 사용자에게 입력받아서 입금, 출금이면 출금금액받아서 출금, 계좌삭제하려면 y, n 입력 받아서 계좌삭제
    	switch ( menu ) {
    	    case 2 : 조회처리  break;
    	    case 3 : 입금받기 / 잔액에 입금받은 돈 추가       break;
    	    case 4 : 출금받기 / 잔액에 출금받은 돈 빼기 (마이너스 통장 X, 잔액없으면 출금 안되게)  break;
    	    case 5 : 계좌삭제여부  y, n 입력 
    	    
    3. [9] 종료
} 
*/