package com.cyb;

import java.io.File;
import java.util.Date;

/** 파일의 정보 : File **/
public class FileInfo {

	public static void main(String[] args) {
	
		String fname = "C:/filetest";

		// 1. 정보를 얻기 위한 File 객체 생성
		File f = new File(fname); 					// 파일 생성자에게 어떤 파일의 어떤 데이타를 넣겠다!
		System.out.println(f.getPath()); 			// 해당 파일에 대한 이름을 얻어옴 ReadFiels.java - 상대 경로 \src\com\cyb
		System.out.println(f.getAbsolutePath());	// 절대 경로 : 드라이브명: \~~ - 드라이브부터 시작 C:\yubin\java_io_test\src\com\cyb
		
		System.out.println("쓰기" + f.canWrite()); 			// 파일의 속성이 쓰기 활성화 여부 = 허용 쓰기가 허용되어있는지(true) 안되어있는지
		System.out.println("읽기" + f.canRead()); 			// 파일의 속성이 읽기 활성화 여부
		System.out.println(f.getParent()); 			// 부모 폴더 얻기
		System.out.println("파일" + f.isFile());					// 지정한 내용이 파일이면 true
		System.out.println("폴더"+f.isDirectory());			// 정한 내용이 폴더이면 true
		Date date = new Date(f.lastModified());// 날짜출력하는 클래스
		System.out.println(date); 		// 파일의 마지막 수정 날짜 및 시간(정수로 반환)
		System.out.println(f.length()); 				// 파일의 크기 (byte)
		
		String[] fileList = f.list();	// 지정한 폴더 내의 파일명 리스트
		for(String n : fileList) { // n을 꺼내준 다음에 한 번 더 만들어줘야함
			System.out.println(n);
		}
		System.out.println(fileList.length);

	}

}
