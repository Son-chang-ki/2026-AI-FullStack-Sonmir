package com.the703.basic016;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class JavaIo004_img {
	public static void main(String[] args) throws IOException {
		//#1. 경로
		String origin = "src/com/the703/basic016/isto1.jpg";
		String target1 = "src/com/the703/basic016/isto2.jpg";
		String target2 = "src/com/the703/basic016/isto3.jpg";
		
		//#2. byte 이미지파일 원본 읽어들여서 쓰기
		//InputStream  >  [program]  > OurputStream
		InputStream  bis = new FileInputStream(origin);   // 원본 읽어들여서  (read)
        OutputStream bos = new FileOutputStream(target1); // isto2.jpg 쓰기   (write)
     
        int cnt1=0;
        while(   (cnt1 = bis.read())     !=  -1 ) { // 원본 읽어들여서
           bos.write((byte) cnt1);  // isto2.jpg 쓰기 (write)
        }
        bos.close(); bis.close();
        System.out.println(">> byte 이미지 복사완료!!! ");
        
     //#3. char 이미지파일 원본 읽어들여서 쓰기
     //  Reader   >  [프로그램]  >  Writer
        Reader cr = new FileReader(origin);  // 원본 읽어들여서  (read)
        Writer cw = new FileWriter(target2); //  isto2.jpg 쓰기 (write)
        
        int cnt2=0;
        while(   (cnt2 = cr.read())     !=  -1 ) { // 원본 읽어들여서
           cw.write((byte) cnt2);  // isto2.jpg 쓰기 (write)
        }
        cw.close(); cr.close();
        System.out.println(">> byte 이미지 복사완료!!! "); // ==> 이미지 처리 안됨. 문자 전용이라서..

	}

}
