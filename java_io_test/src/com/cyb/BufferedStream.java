package com.cyb;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/** Buffered~ �� ����ϴ� ���� **/
// 1. �ٴ����� ���� �޼��带 ����
// 2. ��뷮 �����͸� ���� ó���ϱ� ���ؼ�
// BufferedReader : FileReader / BufferedWriter : FileWriter
// BufferedInputStream : FileInputStream / BufferedOutputStream : FileOutputStream
// *~~~InputStream �� InputStream �� ����
// *~~~OutputStream �� OutputStream �� ����
// Buffered~~ ���� �ܵ� ��� �Ұ��� �ݵ�� File~~~ ��ü�� �ʿ�

public class BufferedStream {

	public static void main(String[] args) {
		FileOutputStream fos;
		BufferedOutputStream bos;
		BufferedInputStream bis;
		
		String fname = "src/com/cyb/test.buff";
		/*
		 * �������: ~.bak
		 * �����ͺ��̽� ���� : ~.db
		 * ������ ���� " ~.dat
		 * �ڹٽ�ũ��Ʈ ���� : ~~.js
		 * CSS ���� : ~~.css
		 * JSP ���� : ~~.jsp
 * HTML ���� : ~~.htm/ ~~.html/~~~.mhtml
		 * �̹��� ���� : ~~~.gif/ ~~~.png/ ~~~.jpg/ ~~~.jpeq
		 * ����� ���� : ~~~.mp3/ ~~~.mp4/ ~~~.wav
		 * ���� ���� : ~~~.avi/~~~.mov/ ~~~.mkv / ~~~.mp4
		 * ���� ���� : ~~~.buff/ ~~~.bff
		 */
		
		try {
			fos = new FileOutputStream(fname);
			
			// buffer�� ������ �������� �׸��� ���Ͽ� ����
			bos = new BufferedOutputStream(fos);
			byte[] data = {'A', 'B', 'C', 'D'};
				//				65  66  67  68
			System.out.println(Arrays.toString(data));
			
			//���ۿ� ���� ��������
			bos.write(data,0,4);		// write(�迭, ���� index, ����)
			bos.close();
			fos.close();
			
			// buffer�� ����� ������ �б�
			bis = new BufferedInputStream(new FileInputStream(fname));
			data = new byte[10];
			bis.read(data, 2, 5);
			bis.close();
			
			System.out.println(Arrays.toString(data));
			
		} catch (IOException e) {

		System.err.println(e.getMessage());}
	}

}
