package com.cyb;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMethodClass {

	public FileMethodClass() {

	}

	public static void fileRead(String uri) {
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr = new FileReader(uri); // 파일 읽기 위한 객체 생성
			br = new BufferedReader(fr); //한줄씩 읽기 위한 객체 생성
			
			String temp = null; // 한 줄을 저장할 변수
			
			while((temp=br.readLine()) != null){	 //오류 해결 -1.메소드 선언부
				System.out.println(temp);			//기존catch 밑에 하나 더
				}
			br.close();   
			fr.close();			
		} catch (FileNotFoundException e) {
			System.out.println("fileRead() ERR:"+e.getMessage());
		}
		catch (IOException e) {
			System.out.println(e.getMessage()); 
		} //fileRead()END
	
		
	}

	public static void fileWrite(String uri) {
		FileWriter fw = null;

		try {
			fw = new FileWriter(uri);
			fw.write("akdjfdl");
			fw.close();
		} catch (Exception e) {
			System.out.println();
		}

	}

}
