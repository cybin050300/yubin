package com.cyb;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/** Buffered~ 를 사용하는 목적 **/
// 1. 줄단위로 읽은 메서드를 보유
// 2. 대용량 데이터를 빨리 처리하기 위해서
// BufferedReader : FileReader / BufferedWriter : FileWriter
// BufferedInputStream : FileInputStream / BufferedOutputStream : FileOutputStream
// *~~~InputStream 은 InputStream 가 조상
// *~~~OutputStream 은 OutputStream 가 조상
// Buffered~~ 들은 단독 사용 불가능 반드시 File~~~ 객체가 필요

public class BufferedStream {

	public static void main(String[] args) {
		FileOutputStream fos;
		BufferedOutputStream bos;
		BufferedInputStream bis;
		
		String fname = "src/com/cyb/test.buff";
		/*
		 * 백업파일: ~.bak
		 * 데이터베이스 파일 : ~.db
		 * 데이터 파일 " ~.dat
		 * 자바스크립트 파일 : ~~.js
		 * CSS 파일 : ~~.css
		 * JSP 파일 : ~~.jsp
 * HTML 파일 : ~~.htm/ ~~.html/~~~.mhtml
		 * 이미지 파일 : ~~~.gif/ ~~~.png/ ~~~.jpg/ ~~~.jpeq
		 * 오디오 파일 : ~~~.mp3/ ~~~.mp4/ ~~~.wav
		 * 비디오 파일 : ~~~.avi/~~~.mov/ ~~~.mkv / ~~~.mp4
		 * 버퍼 파일 : ~~~.buff/ ~~~.bff
		 */
		
		try {
			fos = new FileOutputStream(fname);
			
			// buffer로 데이터 내보내기 그리고 파일에 쓰기
			bos = new BufferedOutputStream(fos);
			byte[] data = {'A', 'B', 'C', 'D'};
				//				65  66  67  68
			System.out.println(Arrays.toString(data));
			
			//버퍼에 쓰고 내보낼거
			bos.write(data,0,4);		// write(배열, 시작 index, 개수)
			bos.close();
			fos.close();
			
			// buffer에 저장된 데이터 읽기
			bis = new BufferedInputStream(new FileInputStream(fname));
			data = new byte[10];
			bis.read(data, 2, 5);
			bis.close();
			
			System.out.println(Arrays.toString(data));
			
		} catch (IOException e) {

		System.err.println(e.getMessage());}
	}

}
