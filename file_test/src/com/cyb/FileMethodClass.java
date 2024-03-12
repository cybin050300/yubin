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
			fr = new FileReader(uri); // ���� �б� ���� ��ü ����
			br = new BufferedReader(fr); //���پ� �б� ���� ��ü ����
			
			String temp = null; // �� ���� ������ ����
			
			while((temp=br.readLine()) != null){	 //���� �ذ� -1.�޼ҵ� �����
				System.out.println(temp);			//����catch �ؿ� �ϳ� ��
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