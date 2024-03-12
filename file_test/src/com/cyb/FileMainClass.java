package com.cyb;

import java.util.Scanner;

public class FileMainClass {

	public static void main(String[] args) {
		String uri = "c:/filetest/하둡 분산 처리 파일 시스템.txt";
		uri="C:\\yubin\\file_test\\src\\com\\cyb\\FileMethodClass.java";
		
		//FileMethodClass.fileRead(uri);
//		
//		uri="c:/filetest/test.txt";
//		
//		FileMethodClass.fileWriter(uri);
		
		Scanner sc = new Scanner(System.in);//어디에 스캔할건지 반드시 입력해야함
		
//		sc.next();		//파일명 읽어올 거 ( nextInt() : 받아서 정수로)
//		String str = sc.next();
		uri=sc.next();		
//		System.out.println(str);
		sc.close();
		
		String ext = ".txt";
		FileMethodClass.fileWrite(uri+ext);
		
	}//main()END

}
