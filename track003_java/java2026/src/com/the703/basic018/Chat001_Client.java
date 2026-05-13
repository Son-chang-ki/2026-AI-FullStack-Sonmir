package com.the703.basic018;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class Chat001_Client {
	public static void main(String[] args) {
		// 2) 클라이언트 연결 요청, 수락
		Socket user = null;
		
		try {
			user = new Socket("127.0.0.1", 703);   // ip, port 번호
			System.out.println("[Client] 3. A/S센터에 고객문의~!");
			
			Thread sender   = new Sender( user );    sender.start();
			Thread receiver = new Receiver ( user ); receiver.start();
			//System.out.println(LocalDateTime.now());
		} catch (UnknownHostException e) {  e.printStackTrace();
		} catch (IOException e) {  e.printStackTrace(); } 
	}
}
