package com.the703.basic016_ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;
import java.text.SimpleDateFormat;

public class JavaIoEx001 {
	public static void main(String[] args) {
		//#1. 경로
		SimpleDateFormat sdf = new SimpleDateFormat("yyyymmdd_HHmmss"); // 포맷설정
		long millis = System.currentTimeMillis();  //시스템시간 가져오기
		String folder_rel = "src/com/the703/basic016_ex/"; //상대경로 - 현재작업 폴더기준
		String file_path  = sdf.format(millis) + "app.log";
		
		File folder = new File(folder_rel);
		File file = new File(folder_rel + file_path);
		
		//#2. 파일 + 폴더준비 (exists, mkdirs, createNewFile)
		try {
			if(!folder.exists() )  { folder.mkdirs();   }
			if(  !file.exists() ) { file.createNewFile(); }
		   } catch(Exception e ) { e.printStackTrace(); }
		System.out.println("폴더/파일 준비완료~!"); 
				
		//#3. Char 단위로 파일 쓰기   Reader(FileReader)   >  [프로그램]  > Writer # (FileWriter)
		// sdf.format(millis) + "로그파일입니다."   20260508_1716 로그파일입니다.
		try {
			Writer cw = new FileWriter(file);
			cw.write(sdf.format(millis) + "로그파일입니다.");
			cw.close();
		  } catch (IOException e) { e.printStackTrace(); }

		//#4. Char 단위로 파일읽기
		try {
			Reader cr = new FileReader(file);
			int cnt = 0;
			while ( (cnt = cr.read()   ) != -1) {  System.out.print((char) cnt); }
			cr.close();
		} catch (IOException e) { e.printStackTrace(); }
	}
}
