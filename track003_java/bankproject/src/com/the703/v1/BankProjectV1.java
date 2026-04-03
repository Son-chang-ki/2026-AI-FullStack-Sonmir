package com.the703.v1;

import java.util.Scanner;

public class BankProjectV1 {

	public static void main(String[] args) {
		// 변수 입력 처리 출력
		int num = 0, id = 0, pass = 0, balance = 0 ;
		String menu = "\u0000";
		Scanner scanner = new Scanner(System.in);

		for (;;) {
			System.out.println(" 🌟💰 WELCOME TO BANK SYSTEM 💰🌟 \n");
			System.out.println(" [1] ➕ 계좌 추가 ");
			System.out.println(" [2] 🔍 계좌 조회 ");
			System.out.println(" [3] 💵 입금하기  ");
			System.out.println(" [4] 💸 출금하기  ");
			System.out.println(" [5] 🗑️ 계좌 삭제 \n");

			System.out.println(" 👉 번호를 선택하세요: ");// + num);
			num = scanner.nextInt();

			// 처리
			if (num == 1) {
				System.out.println("추가기능입니다.\n"); // 변수 입력 처리 출력
				   // 입력 id = 1, pass = 1, balance;
				  System.out.println(" [1] ID 입력 > " );
				  id = scanner.nextInt();
				  System.out.println(" [2] PASS 입력 > " );
				  pass = scanner.nextInt();
				  System.out.println(" [3] 금액 입력 > " );
				  balance = scanner.nextInt();
			} 

			else if (num == 2) {
				System.out.println("조회기능입니다.\n");
				// 변수
				int tid = 0, tpass = 0;
				// 입력 (임시공간에 아이디와 비번 입력받기)
				//[1] ID 입력 >
				//[2] PASS 입력 >
				 System.out.println(" [1] ID 입력 > " );
				 tid = scanner.nextInt();
				 System.out.println(" [2] PASS 입력 > " );
				 tpass = scanner.nextInt();
				// 처리 + 출력
				 if ( id == tid && pass == tpass )  { System.out.println( id + "를 출력") ;}
				 else              { System.out.println("비밀번호를 확인해주세요!!\n") ; }
				// 9번째 줄에 있는 아이디와 임시아이디가 같고, 9번째 줄에 있는 비번과 임시 비번이 같으면 정보출력
				//아니면 비밀번호를 확인해주세요!!
			} else if (num == 3) {
				System.out.println("입금기능입니다.\n");
			} else if (num == 4) {
				System.out.println("출금기능입니다.\n");
			} else if (num == 5) {
				System.out.println("삭제기능입니다.\n");
			} else if (num == 9) {
				System.out.println("종료합니다.\n");
				break;
			}

		}
	}

}

/* Q1. 메뉴판나오게 만들고 사용자가 메뉴 선택시
1을 입력하면 추가기능입니다. 출력구문까지만
2를 입력하면 조회기능입니다. 출력구문까지만
3을 입력하면 입금기능입니다. 출력구문까지만
4를 입력하면 출금기능입니다. 출력구문까지만
5를 입력하면 삭제기능입니다. 출력구문까지만
9를 입력하면 종료합니다.    출력구문까지만

Q2. 무한반복으로 메뉴나오게, 9 나오면 종료
■ 힌트
for(;;) { 
System.out.println("숫자1을 입력하세요.");
int a = scanner.nextInt();
if(a == 1) { break;} } 

🌟💰 WELCOME TO BANK SYSTEM 💰🌟

[1] ➕ 계좌 추가
[2] 🔍 계좌 조회
[3] 💵 입금하기
[4] 💸 출금하기
[5] 🗑️ 계좌 삭제  

👉 번호를 선택하세요:*/
